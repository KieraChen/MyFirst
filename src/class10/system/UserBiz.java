package class10.system;
/*创建一个UserBiz 接口，该接口中定义两个方法：  
void register(String username, String password, String password2,  String name, String email) //用户注册  
void login(String username, String password)  //用户登录  
*/
public interface UserBiz {
	void register(String username, String password, String password2,  String name, String email) throws RegisterException;
	void login(String username, String password) throws LoginException;

}
