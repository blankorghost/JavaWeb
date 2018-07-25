package mapper;

import pojo.User;

public interface UserMapper {

	//遵循四个原则
	//1.接口方法名 == User.xml中的id名
	//2.返回值类型与Mapper.xml中返回值类型要一致
	//3.方法的入参类型要和Mapper.xml中入参类型要一致
	//4.命名空间绑定此接口
	public User findUserById(Integer id);
}
