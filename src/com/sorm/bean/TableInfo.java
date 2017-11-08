package com.sorm.bean;

import java.util.List;
import java.util.Map;

/**
 * 存储表结构信息
 * 
 * @author Joker
 *
 */
public class TableInfo {
	/**
	 * 表名
	 */
	private String tname;

	/**
	 * 所有字段的信息
	 */
	private Map<String, ColumnInfo> columns;

	/**
	 * 唯一主键
	 */
	private ColumnInfo onlyPriKey;

	private List<ColumnInfo> priKeys;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Map<String, ColumnInfo> getColumns() {
		return columns;
	}

	public void setColumns(Map<String, ColumnInfo> columns) {
		this.columns = columns;
	}

	public ColumnInfo getOnlyPriKey() {
		return onlyPriKey;
	}

	public void setOnlyPriKey(ColumnInfo onlyPriKey) {
		this.onlyPriKey = onlyPriKey;
	}

	public List<ColumnInfo> getPriKeys() {
		return priKeys;
	}

	public void setPriKeys(List<ColumnInfo> priKeys) {
		this.priKeys = priKeys;
	}

	public TableInfo(String tname, List<ColumnInfo> priKeys, Map<String, ColumnInfo> columns) {
		super();
		this.tname = tname;
		this.columns = columns;
		this.priKeys = priKeys;
	}

	public TableInfo() {

	}
}
