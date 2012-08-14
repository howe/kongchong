package com.esup.kongchong.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 游戏充值面值对照表
*/
@Table("es_charge_tmp2")
@PK({"id"})
public class Tmp2 {

	/**
	 * ID
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 游戏简码
	 */
	@Column("gameNO")
	private String gameNo;
	/**
	 * 面值编码
	 */
	@Column("valuesNO")
	private String valuesNo;
	/**
	 * 面值
	 */
	@Column("faceValues")
	private String faceValues;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public String getValuesNo() {
		return valuesNo;
	}
	public void setValuesNo(String valuesNo) {
		this.valuesNo = valuesNo;
	}
	public String getFaceValues() {
		return faceValues;
	}
	public void setFaceValues(String faceValues) {
		this.faceValues = faceValues;
	}
	
}