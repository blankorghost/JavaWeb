package dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 原始dao开发
 * @author ghost
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	//声明工厂
	public void insertUser(){
		this.getSqlSession().insert("", "");
	}
	
}
