package com.esup.kongchong.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 充值流水日志表
*/
@Table("es_charge_logs")
@PK({"id"})
public class Logs {

	/**
	 * ID
	 */
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
	 * 充值日期
	 */
	@Column("subDate")
	private java.util.Date subDate;
	/**
	 * 充值IP
	 */
	@Column("subIP")
	private String subIp;
	/**
	 * 充值帐号
	 */
	@Column("account")
	private String account;
	/**
	 * 订单表ID
	 */
	@Column("orderId")
	private Integer orderId;
	
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
	public java.util.Date getSubDate() {
		return subDate;
	}
	public void setSubDate(java.util.Date subDate) {
		this.subDate = subDate;
	}
	public String getSubIp() {
		return subIp;
	}
	public void setSubIp(String subIp) {
		this.subIp = subIp;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
}