package com.sorm.core;

/**
 * 负责查询（负责对外查询核心接口）
 * 
 * @author Joker
 *
 */
public interface Query {

	/**
	 * 执行一个DML语句
	 * 
	 * @param sql
	 *            传入sql语句
	 * @param params
	 *            占位符 ? 参数
	 * @return 执行sql语句后影响记录的行数
	 */
	public int excuteDML(String sql, Object[] params);
	
	/**
	 * 往数据库中新增一条记录
	 * @param object
	 */
	public void insert(Object object);
}
