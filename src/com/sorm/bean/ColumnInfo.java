package com.sorm.bean;

/**
 * 封装数据库表中字段对应的信息
 * 
 * @author Joker
 *
 */
public class ColumnInfo {
	/**
	 * 字段名称
	 */
	private String name;
	/**
	 * 数据类型
	 */
	private String dataType;
	/**
	 * 字段键类型（0：普通键，1：主键，2：外键）
	 */
	private int keyType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public int getKeyType() {
		return keyType;
	}

	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}

	public ColumnInfo(String name, String dataType, int keyType) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.keyType = keyType;
	}

	public ColumnInfo() {

	}
}
