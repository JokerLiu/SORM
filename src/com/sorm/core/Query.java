package com.sorm.core;

import java.util.List;

/**
 * 提供查询服务核心接口
 * 
 * @author Joker
 *
 */
@SuppressWarnings("all")
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
	 * @param Obj
	 */
	public void insert(Object obj);

	/**
	 * 删除clazz表示类对应的对象表中的记录（指定的主键id值）
	 * 
	 * @param clazz
	 *            表对应类的Class对象
	 * @param id
	 *            主键值
	 */
	public void delete(Class clazz, int id);

	/**
	 * 根据Object删除数据库的一条记录
	 * 
	 * @param Obj
	 */
	public void delete(Object Obj);

	/**
	 * 更新对象对应记录，更新传入字段
	 * 
	 * @param Obj
	 *            更新的对象
	 * @param fieldName
	 *            更新的字段
	 * @return
	 */
	public int update(Object Obj, String[] fieldName);

	/**
	 * 根据传入sql查询，返回多行记录，并将每行记录封装到clazz指定的类的对象中
	 * 
	 * @param sql
	 *            查询语句
	 * @param clazz
	 *            封装数据的javabean类的Class对象
	 * @param params
	 *            sql的参数
	 * @return
	 */
	public List queryRows(String sql, Class clazz, Object[] params);

	/**
	 * 根据传入sql查询，返回单行记录，并将记录封装到clazz指定的类的对象中
	 * 
	 * @param sql
	 *            查询语句
	 * @param clazz
	 *            封装数据的javabean类的Class对象
	 * @param params
	 *            sql的参数
	 * @return
	 */
	public List queryUniqueRow(String sql, Class clazz, Object[] params);

	/**
	 * 查询返回一个值(一行一列)，并将该值返回
	 * 
	 * @param sql
	 *            查询语句
	 * @param params
	 *            sql的参数
	 * @return 查询到的结果
	 */
	public Object queryValue(String sql, Object[] params);

	/**
	 * 查询返回一个数字(一行一列)，并将该值返回
	 * 
	 * @param sql
	 *            查询语句
	 * @param params
	 *            sql的参数
	 * @return 查询到的数字
	 */
	public Number queryNumber(String sql, Object[] params);
}