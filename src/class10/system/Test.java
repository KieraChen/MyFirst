package class10.system;

import java.util.Scanner;

public class Test {
	/*��5�� дһ���ࡣ  ��ʵ�����login �����У����û������û��������룬
	 * ֮�����UserBiz �е�login ��������ɵ�¼��ҵ���߼��������register �����У�
	 * ͨ�����û�����ע��ʱ��Ҫ����Ϣ��Ȼ����� UserBiz �е�register ������*/ 
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		UseUserBiz uub = new UseUserBiz();
	/*	int flag = 0;
		do{*/
			try {
				System.out.println("�������û��������룺");
				uub.login(scan.next(), scan.next());
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			/*	System.out.println("���������µ�¼�����˳���1-���µ�¼��2-�˳���");
				flag = scan.nextInt();
			}
		}while(flag == 2);
		*/

			}
		
		try {
			System.out.println("������ע����Ϣ��");
			uub.register(scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
		} catch (RegisterException e) {
			System.out.println(e.getMessage());
		}
	}
}

