package com.esup.kongchong.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 充值卡库存表
*/
@Table("es_charge_stocks")
@PK({"id"})
public class Stocks {

	@Id
	@Column("id")
	private Integer id;
	/**
	 * 充值卡号
	 */
	@Column("cardNO")
	private String cardNo;
	/**
	 * 加密过的充值密码
	 */
	@Column("cardPWD")
	private String cardPwd;
	/**
	 * 卡密状态
	 */
	@Column("status")
	private String status;
	/**
	 * 订单表ID
	 */
	@Column("logId")
	private Integer logId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardPwd() {
		return cardPwd;
	}
	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	
}