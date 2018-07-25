package dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pojo.User;

/**
 * dao
 * @author lp
 *
 */

public interface UserDao {

	public User selectUserById(Integer id);
}
