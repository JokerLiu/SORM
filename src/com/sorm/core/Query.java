package com.sorm.core;

/**
 * �����ѯ����������ѯ���Ľӿڣ�
 * 
 * @author Joker
 *
 */
public interface Query {

	/**
	 * ִ��һ��DML���
	 * 
	 * @param sql
	 *            ����sql���
	 * @param params
	 *            ռλ�� ? ����
	 * @return ִ��sql����Ӱ���¼������
	 */
	public int excuteDML(String sql, Object[] params);

	/**
	 * ����ݿ�������һ����¼
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
