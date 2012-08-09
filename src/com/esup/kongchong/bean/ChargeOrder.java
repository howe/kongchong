package com.esup.kongchong.bean;

import org.nutz.dao.entity.annotation.*;


/**
* 空充系统订单表
*/
@PK({"id"})
@Table("es_charge_order")
public class ChargeOrder {

	/**
	 * 
	 */
	@Id
	@Column("id")
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}