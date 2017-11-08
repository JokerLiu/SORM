package com.sorm.core;

/**
 * 提供查询服务核心接口
 * 
 * @author Joker
 *
 */
public interface Query {

	/**
	 * 执行一条sql语句
	 * 
	 * @param sql
	 *            sql
	 * @param params
	 *            传入参数
	 * @return int
	 */
	public int excuteDML(String sql, Object[] params);

	/**
	 * 往数据库插入一条记录
	 * 
	 * @param object
	 */
	public void insert(Object object);

	/**
	 * 根据id删除数据库的一条记录
	 * 
	 * @param id
	 * @return
	 */
	public int delete(String id);
}
