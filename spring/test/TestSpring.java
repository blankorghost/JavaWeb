package test;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.BeanScope;
import lifecycle.BeanLifeCycle;
import service.AutoWiringService;
import service.InjectionService;

public class TestSpring {

	
	
	@Test
	public void testSetter(){
		//1.创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要对象
		InjectionService service = (InjectionService) ac.getBean("injectionService");
		service.save("这是要保存的数据");
		
	}
	
	@Test
	public void testCons(){
		//1.创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要对象
		InjectionService service = (InjectionService) ac.getBean("injectionService");
		service.save("这是要保存的数据");
	}
	
	@Test
	public void testScope(){
		//1.创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-scope.xml");
		//2.向容器要对象
		BeanScope scope = (BeanScope) ac.getBean("beanScope");
		BeanScope scope1 = (BeanScope) ac.getBean("beanScope");
		scope.say();
		scope1.say();
	}
	
	@Test
	public void testBeanLifecycle(){
		//1.创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
		BeanLifeCycle lifecycle = (BeanLifeCycle)ac.getBean("beanLifeCycle");
		
	}
	
	@Test
	public void testAutoWiring(){
		//1.创建容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("autowiring.xml");
		AutoWiringService autoWiringService = (AutoWiringService)ac.getBean("autoWiringService");
		autoWiringService.say("this is a test");
	}
}
