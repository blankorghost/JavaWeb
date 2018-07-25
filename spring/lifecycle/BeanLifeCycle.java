package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle {//implements InitializingBean,DisposableBean

	/*public void start(){
		System.out.println("Bean start.");
	}
	
	public void stop(){
		System.out.println("Bean stop.");
	}*/
	public void defaultInit(){
		System.out.println("Bean start.");
	}
	public void defaultDestroy(){
		System.out.println("Bean stop.");
	}
	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean start.");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean stop.");
	}*/
}
