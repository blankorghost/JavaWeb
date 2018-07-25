package junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mapper.UserMapper;
import pojo.User;


public class MapperTest {
	
	@Test
	public void testMapper() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//UserMapper mapper =(UserMapper)ac.getBean("userMapper");
		UserMapper mapper = ac.getBean(UserMapper.class);
		User user = mapper.selectUserById(10);
		System.out.println(user);
	}

}
