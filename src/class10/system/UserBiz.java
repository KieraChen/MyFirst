package class10.system;
/*����һ��UserBiz �ӿڣ��ýӿ��ж�������������  
void register(String username, String password, String password2,  String name, String email) //�û�ע��  
void login(String username, String password)  //�û���¼  
*/
public interface UserBiz {
	void register(String username, String password, String password2,  String name, String email) throws RegisterException;
	void login(String username, String password) throws LoginException;

}
