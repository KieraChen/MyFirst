package class10.system;

/*（1）  创建一个User 类，包括：用户登录名（username）、密码（password）、
 * 用户真实姓 名（name）、电子邮件地址（email）属性和相应的构造方法及set/get 方法。  
（2） 创建两个自定义异常类，一个LoginException，表示登录异常。
           一个RegisterException， 表示注册异常。
           自定义的两个异常，都要求有一个接受字符串类型参数的构造方法。*/ 
public class User {
	String username;
	String password;
	String name;
	String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
class LoginException extends Exception{
	LoginException(String message){
		super(message);
	}
}
class RegisterException extends Exception{
	RegisterException(String message){
		super(message);
	}
}
