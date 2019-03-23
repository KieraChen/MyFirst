package class2;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
/*		模拟登录功能：能够成功登录的用户名和密码分别为：admin和asjy
		1、	接受用户输入用户名和密码，判断能否登录成功
		2、	如果登录成功则提示成功
		3、	如果登录失败，则要求必须重新登录
		4、	如果连续3次登录失败，则不允许再登录，并给出相应的提示
*/
		
	
		
/*		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName= scan.next();;
		System.out.println("请输入密码：");
		String userPwd= scan.next();;
		if("admin".equalsIgnoreCase(userName) && "asjy".equalsIgnoreCase(userPwd)){
			System.out.println("登录成功！");
		}
		else{
			for (int i = 0; "admin".equalsIgnoreCase(userName) && "asjy".equalsIgnoreCase(userPwd); i++) {
				System.out.println("重新登录");
				System.out.println("请输入用户名：");
				userName = scan.next();
				System.out.println("请输入密码：");
				userPwd = scan.next();
				
				if(i>2){
					System.out.println("连续3次登录失败，不允许再登录");
					break;
				}
				System.out.println("登录成功！");
				
			}
		}
	*/
		
	Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0;i<3;i++) {
		
		System.out.println("请输入用户名：");
		String userName = scan.next();
		System.out.println("请输入密码：");
		String userPwd = scan.next();
		
		if("admin".equals(userName) && "asjy".equals(userPwd)){
			System.out.println("登陆成功！");
		}else{
			System.out.println("用户名与密码不正确！请重新输入！");
		}continue;

		}System.out.println("不允许再登录");
		
	}
}
	

