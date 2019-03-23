package class10.system;

import java.util.HashMap;
import java.util.Map;


/*����register ������������password ������
ԭ���ǣ����û�ע��ʱ����Ҫ�������� password��ֻ�����������password һ�£�������ע�ᡣ*/
/*��4�� ����UserBiz �ӿڵ�ʵ���ࡣ
 * ���У�Ϊ��ʵ���ഴ��һ�����ԣ�������Ϊһ��Map��
 * ����������ע����û���Ϣ�����ܺܶ࣬ģ�����ݿ����Ѵ������ݵı���
 * Map �ļ�Ϊ�û���¼����ֵΪ��¼����Ӧ��User ���󡣳�ʼ����£�Map �б���Ķ� ��Ϊ��������*/
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

/*	register ��������������������׳��쳣�� 
	1�� username ��Map ���Ѵ��� 
	2�� ���������password ��һ�� */
	@Override
	public void register(String username, String password, String password2,
			String name, String email) throws RegisterException {
		fun();
		for (String k : map.keySet()) {
			if(username.equals(k)){
				throw new RegisterException("�û������ڣ�");
			}
		}
		if(password.equals(password2)){
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			map.put(username, user);
			System.out.println("ע��ɹ���");
		}
		else{
			throw new RegisterException("����ȷ�ϴ���");
		}
	
	}
		

/*	login ��������������������׳��쳣�� 
	1�� username ������  
	2�� username ��password ��ƥ��*/
	@Override
	public void login(String username, String password) throws LoginException {
		
		for (String k : map.keySet()) {
			if(username.equals(k)){
				if(password.equals(map.get(k).getPassword())){
					System.out.println("��¼�ɹ���");
				}
				else{
					throw new LoginException("�������");
				}
			}
			else{
				throw new LoginException("�û������ڣ�");
			}
		}
	}

}
