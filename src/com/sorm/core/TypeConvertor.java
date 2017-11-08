package com.sorm.core;

/**
 * 负责将数据库数据类型与Java的数据类型互相转换
 * 
 * @author Joker
 *
 */
public interface TypeConvertor {

	/**
	 * 将数据库数据类型转换成Java的数据类型
	 * 
	 * @param columnType
	 * @return
	 */
	public String databaseType2JavaType(String columnType);

	/**
	 * 将java数据类型转换成数据库的数据类型
	 * 
	 * @param javaDataType
	 * @return
	 */
	public String javaType2DatabaseType(String javaDataType);
}
