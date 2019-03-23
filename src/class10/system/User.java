package class10.system;

/*��1��  ����һ��User �࣬�������û���¼����username�������루password����
 * �û���ʵ�� ����name���������ʼ���ַ��email�����Ժ���Ӧ�Ĺ��췽����set/get ������  
��2�� ���������Զ����쳣�࣬һ��LoginException����ʾ��¼�쳣��
           һ��RegisterException�� ��ʾע���쳣��
           �Զ���������쳣����Ҫ����һ�������ַ������Ͳ����Ĺ��췽����*/ 
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
