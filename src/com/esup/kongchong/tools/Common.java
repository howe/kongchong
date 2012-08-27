package com.esup.kongchong.tools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import org.nutz.dao.Sqls;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;

/**
 * 公共方法类
 * 
 * @author yangq(qi.yang.cn@gmail.com) 2012-8-23
 */
public class Common {

	/** 生成随机字符串（数字加字母） */
	public String generatRandomStrs(int length) {

		char[] numAndLett = ("123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

		Random random = new Random();
		StringBuilder randomStrs = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int tmp = random.nextInt(numAndLett.length);
			randomStrs.append(numAndLett[tmp]);
		}

		return randomStrs.toString();
	}

	/** 通过数据库生成永不重复的序列号 */
	public String generatSerialNumber(int length) {

		// select t.serialNumber from es_charge_sernum t where
		// t.serialNumber='111';

		Ioc ioc = new NutIoc(new JsonLoader("conf/ioc/dao.js"));
		NutDao dao = ioc.get(NutDao.class, "dao");

		String tmp = "init";
		String strs = null;
		Sql sql = null;

		while (tmp != null) {// 查询到记录

			tmp = generatRandomStrs(length);
			strs = tmp;

			sql = Sqls.create("select t.serialNumber from es_charge_sernum t where t.serialNumber=@serialNumber ");
			sql.params().set("serialNumber", tmp);

			sql.setCallback(new SqlCallback() {

				@Override
				public Object invoke(Connection conn, ResultSet rs, Sql sql) throws SQLException {

					while (rs.next()) {
						return rs.getString("serialNumber");
					}

					return null;
				}
			});

			dao.execute(sql);
			tmp = sql.getString();
		}

		// insert into es_charge_sernum values('111',sysdate());

		sql = Sqls.create("insert into es_charge_sernum values(@randomStrs,sysdate()) ");
		sql.params().set("randomStrs", strs);
		dao.execute(sql);

		return strs;
	}

	public String generatPassword(int length) {
		return generatRandomStrs(length);
	}

	public static void main(String[] args) {
		System.out.print("DNW"+new Common().generatSerialNumber(10)+"A"+" ");// 打印生成的序列号		
		System.out.println(new Common().generatPassword(10));// 打印生成的密码
	}

}
