package com.esup.kongchong.module;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.sql.Sql;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.upload.TempFile;
import org.nutz.service.EntityService;

import org.nutz.log.Log;
import org.nutz.log.Logs;

import com.esup.kongchong.bean.Order;
import com.esup.kongchong.bean.Stocks;

@IocBean(fields = {"dao"})
public class StocksModule extends EntityService<Order> {

	private static final Log log = Logs.get();

	private Dao dao;

	/**
	 * 根据卡号查询卡是否使用过
	 * 
	 * @param cardNO
	 * @return
	 */
	@At("/Stocks/queryCardIsUsed")
	@Ok("json")
	public boolean queryCardIsUsed(@Param("cardno") String cardNO) {

		boolean rtn = false;
		Sql sql = Sqls
				.create("SELECT STATUS FROM ES_CHARGE_STOCKS WHERE CARDNO = @CARDNO");
		sql.params().set("CARDNO", cardNO);
		dao.execute(sql);
		return rtn;
	}

	/**
	 * 根据卡号查询卡的使用情况
	 * 
	 * @param cardNO
	 * @return
	 */
	@At("/Stocks/queryCardLogs")
	@Ok("json")
	public Stocks queryCardLogs(@Param("cardno") String cardNO) {

		Stocks stocks = new Stocks();
		Sql sql = Sqls
				.create("SELECT CARDNO, SUBDATE, SUBIP, ACCOUNT, ORDERID, ID FROM ES_CHARGE_LOGS WHERE CARDNO =  @CARDNO");
		sql.params().set("CARDNO", cardNO);
		dao.execute(sql);
		return stocks;
	}

	/**
	 * 根据卡号查询卡的面值和游戏名
	 * 
	 * @param cardNO
	 * @return
	 */
	@At("/Stocks/queryCardLogs")
	@Ok("json")
	public void queryFaceValues(@Param("cardno") String cardNO) {

		Sql sql = Sqls
				.create("SELECT FACEVALUES, (SELECT NAME FROM ES_CHARGE_TMP1 WHERE GAMENO = @GAMENO) GAMENAME " +
						"FROM ES_CHARGE_TMP2 WHERE GAMENO = @GAMENO AND VALUESNO = @VALUESNO");
		sql.params().set("CARDNO", cardNO);
		dao.execute(sql);
		// return ;
	}

	/**
	 * 充值
	 * 
	 * @param cardNO
	 * @param cardPwd
	 * @param account
	 * @param gameId
	 * @param areaId
	 * @param serverId
	 * @param factionId
	 * @param roleName
	 * @param email
	 */
	@At("/Stocks/charge")
	@Ok("json")
	public void charge(@Param("cardno") String cardNO,
			@Param("cardpwd") String cardPwd, @Param("account") String account,
			@Param("gameid") String gameId, @Param("areaid") String areaId,
			@Param("serverid") String serverId,
			@Param("factionid") String factionId,
			@Param("rolename") String roleName, @Param("email") String email) {

	}
	
	/**
	 * 验证卡密
	 * @param cardNO
	 * @param cardPWD
	 * @return
	 */
	public boolean verifyCard(String cardNO, String cardPWD){
		
		Sql sql = Sqls.create("");
		
		return true;
	}
	
	/**
	 * 从execel导入卡密到数据库
	 * @param tempFile
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	@At("/Stocks/importCard")
	@Ok("json")
	@AdaptBy(args = { "ioc:upload" })
	public void importCard(@Param("myfile") TempFile tempFile) throws InvalidFormatException, IOException {
		
	}
}