package com.esup.kongchong.tools;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

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

	/** 通过数据库生成永不重复的序列号 */
	public String generatSerialNumber() {

		// select t.serialNumber from es_sequence t where t.owner='ChargeCard'

		// update es_sequence t set t.serialNumber=t.serialNumber+1 where
		// t.owner='ChargeCard'

		Ioc ioc = new NutIoc(new JsonLoader("conf/ioc/dao.js"));
		NutDao dao = ioc.get(NutDao.class, "dao");

		Sql sql = Sqls.create("select t.serialNumber from es_sequence t where t.owner='ChargeCard' ");
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

		String tmp = sql.getString();

		sql = Sqls.create("update es_sequence t set t.serialNumber=t.serialNumber+1 where t.owner='ChargeCard' ");
		dao.execute(sql);

		return tmp;
	}

	public String generatPassword() {
		return String.valueOf(Calendar.getInstance().getTimeInMillis());
	}

	public static void main(String[] args) {
		System.out.println(new Common().generatSerialNumber());// 打印生成的序列号
		System.out.println(new Common().generatPassword());// 打印生成的密码
	}

}
