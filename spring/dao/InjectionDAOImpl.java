package dao;

public class InjectionDAOImpl implements InjectionDAO{

	public void save(String str){
		System.out.println("保存的数据："+ str);
	}
}
