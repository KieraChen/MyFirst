package class10.system;

import java.util.HashMap;
import java.util.Map;


/*其中register 方法接受两个password 参数，
原因是：在用户注册时，需要输入两遍 password，只有两次输入的password 一致，才允许注册。*/
/*（4） 创建UserBiz 接口的实现类。
 * 其中，为该实现类创建一个属性，该属性为一个Map，
 * 用来保存已注册的用户信息（可能很多，模拟数据库中已存在数据的表）。
 * Map 的键为用户登录名，值为登录名对应的User 对象。初始情况下，Map 中保存的对 象为以下两个*/
public class UseUserBiz implements UserBiz{
	Map<String,User> map= new HashMap<String,User>();
	public void fun(){
		 User user1 = new User();
		 user1.setUsername("admin");
		 user1.setPassword("admin");
		 user1.setName("Administrator");
		 user1.setEmail("admin@123.com");
		 map.put("admin", user1);
		 User user2 = new User();
		 user2.setUsername("tom");
		 user2.setPassword("cat");
		 user2.setName("tomcat");
		 user2.setEmail("tomcat@cat.com");
		 map.put("tom", user2);	 
	}

/*	register 方法在以下两种情况下抛出异常： 
	1） username 在Map 中已存在 
	2） 两次输入的password 不一致 */
	@Override
	public void register(String username, String password, String password2,
			String name, String email) throws RegisterException {
		fun();
		for (String k : map.keySet()) {
			if(username.equals(k)){
				throw new RegisterException("用户名存在！");
			}
		}
		if(password.equals(password2)){
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			map.put(username, user);
			System.out.println("注册成功！");
		}
		else{
			throw new RegisterException("密码确认错误！");
		}
	
	}
		

/*	login 方法在以下两种情况下抛出异常： 
	1） username 不存在  
	2） username 和password 不匹配*/
	@Override
	public void login(String username, String password) throws LoginException {
		
		for (String k : map.keySet()) {
			if(username.equals(k)){
				if(password.equals(map.get(k).getPassword())){
					System.out.println("登录成功！");
				}
				else{
					throw new LoginException("密码错误！");
				}
			}
			else{
				throw new LoginException("用户不存在！");
			}
		}
	}

}
