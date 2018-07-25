package service;

import dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService{

	private InjectionDAO injectionDAO;
	

	//设值注入
	/*public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}*/
	
	//构造器注入
	public InjectionServiceImpl(InjectionDAO injectionDAO){
		this.injectionDAO = injectionDAO;
	}


	public void save(String str){
		System.out.println("Service接收参数:"+str);
		str = str + this.hashCode();
		injectionDAO.save(str);
	}
}
