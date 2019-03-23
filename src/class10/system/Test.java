package class10.system;

import java.util.Scanner;

public class Test {
	/*（5） 写一个类。  该实现类的login 方法中：让用户输入用户名和密码，
	 * 之后调用UserBiz 中的login 方法，完成登录的业务逻辑；该类的register 方法中，
	 * 通过让用户输入注册时需要的信息，然后调用 UserBiz 中的register 方法。*/ 
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		UseUserBiz uub = new UseUserBiz();
	/*	int flag = 0;
		do{*/
			try {
				System.out.println("请输入用户名和密码：");
				uub.login(scan.next(), scan.next());
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			/*	System.out.println("请输入重新登录还是退出（1-重新登录，2-退出）");
				flag = scan.nextInt();
			}
		}while(flag == 2);
		*/

			}
		
		try {
			System.out.println("请输入注册信息：");
			uub.register(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
		} catch (RegisterException e) {
			System.out.println(e.getMessage());
		}
	}
}

