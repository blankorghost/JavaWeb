package junit;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import pojo.User;

public class MybatisFirstTest {

	@Test
	public void testMybatis() throws Exception{
		//加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//执行Sql语句
		//User user = sqlSession.selectOne("test.findUserById", 10); //查询
		
		/*//List<User> user = sqlSession.selectList("test.findUserByUsername", "王"); //查询
		for(User us : user){
			System.out.println(us);
		}*/
		
		/*//添加用户
		User user = new User();
		user.setUsername("宋钦");
		user.setBirthday(new Date());
		user.setAddress("625");
		user.setSex("男");
		int i = sqlSession.insert("test.insertUser", user);
		sqlSession.commit();
		System.out.println(user.getId());*/
		
		/*//添加用户
		User user = new User();
		user.setId(28);
		user.setUsername("宋钦123");
		user.setBirthday(new Date());
		user.setAddress("625");
		user.setSex("男");
		int i = sqlSession.update("test.updateUserById", user);
		sqlSession.commit();
		System.out.println(user);*/
		
		//删除用户
		sqlSession.delete("test.deleteUserById", 28);
		sqlSession.commit();
	}
}
