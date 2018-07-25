package junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.UserDao;
import dao.UserDaoImp;
import pojo.User;

public class MybatisDaoTest {

	private SqlSessionFactory sqlSessionFactory;
	@Before
	public void before() throws Exception {
		//加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
	}
	@Test
	public void testDao() throws Exception{
		
		UserDao userDao = new UserDaoImp(sqlSessionFactory);
		
		User user = userDao.selectUserById(10);
		System.out.println(user);
		
	}
}
