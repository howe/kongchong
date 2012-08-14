package com.esup.kongchong.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 游戏区服阵营对照表
*/
@Table("es_charge_tmp1")
@PK({"id"})
public class Tmp1 {

	/**
	 * ID
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 项目名
	 */
	@Column("name")
	private String name;
	/**
	 * 父ID，0为无上级
	 */
	@Column("parentId")
	private Integer parentId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}