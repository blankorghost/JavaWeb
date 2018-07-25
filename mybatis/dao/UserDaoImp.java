package dao;

import org.apache.ibatis.session.SqlSession;
/**
 * dao 
 */
import org.apache.ibatis.session.SqlSessionFactory;

import pojo.User;

public class UserDaoImp implements UserDao{

	//注入
	private SqlSessionFactory sqlSessionFactory;
	public UserDaoImp(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	//通过用户ID查询一个用户
	public User selectUserById(Integer id){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession.selectOne("test.findUserById", id);
	}
}
