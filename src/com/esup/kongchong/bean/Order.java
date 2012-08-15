package com.esup.kongchong.bean;

import org.nutz.dao.entity.annotation.*;


/**
* 空充系统订单表
*/
@PK({"id"})
@Table("es_charge_order")
public class Order {

	/**
	 * ID
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 订单号
	 */
	@Column("orderNO")
	private String orderNo;
	/**
	 * 充值帐号
	 */
	@Column("account")
	private String account;
	/**
	 * 游戏名
	 */
	@Column("gameName")
	private String gameName;
	/**
	 * 游戏ID
	 */
	@Column("gameId")
	private Integer gameId;
	/**
	 * 游戏区名
	 */
	@Column("areaName")
	private String areaName;
	/**
	 * 游戏区ID
	 */
	@Column("areaId")
	private Integer areaId;
	/**
	 * 服务器名
	 */
	@Column("serverName")
	private String serverName;
	/**
	 * 服务区ID
	 */
	@Column("serverId")
	private Integer serverId;
	/**
	 * 阵营名
	 */
	@Column("factionName")
	private String factionName;
	/**
	 * 阵营ID
	 */
	@Column("factionId")
	private Integer factionId;
	/**
	 * 角色名
	 */
	@Column("roleName")
	private String roleName;
	/**
	 * 充值面值
	 */
	@Column("faceValue")
	private String faceValue;
	/**
	 * 用户电子邮件
	 */
	@Column("email")
	private String email;
	/**
	 * 提交时间
	 */
	@Column("orderTime")
	private java.util.Date orderTime;
	/**
	 * 订单状态
	 */
	@Column("status")
	private String status;
	/**
	 * 确认充值时间
	 */
	@Column("confirmTime")
	private java.util.Date confirmTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Integer getGameId() {
		return gameId;
	}

	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public Integer getFactionId() {
		return factionId;
	}

	public void setFactionId(Integer factionId) {
		this.factionId = factionId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(String faceValue) {
		this.faceValue = faceValue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(java.util.Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getConfirmTime() {
		return confirmTime;
	}

	public void setConfirmTime(java.util.Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	
}