package dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * ԭʼdao����
 * @author ghost
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	//��������
	public void insertUser(){
		this.getSqlSession().insert("", "");
	}
	
}
