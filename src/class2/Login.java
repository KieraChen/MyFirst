package class2;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
/*		ģ���¼���ܣ��ܹ��ɹ���¼���û���������ֱ�Ϊ��admin��asjy
		1��	�����û������û��������룬�ж��ܷ��¼�ɹ�
		2��	�����¼�ɹ�����ʾ�ɹ�
		3��	�����¼ʧ�ܣ���Ҫ��������µ�¼
		4��	�������3�ε�¼ʧ�ܣ��������ٵ�¼����������Ӧ����ʾ
*/
		
	
		
/*		Scanner scan = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName= scan.next();;
		System.out.println("���������룺");
		String userPwd= scan.next();;
		if("admin".equalsIgnoreCase(userName) && "asjy".equalsIgnoreCase(userPwd)){
			System.out.println("��¼�ɹ���");
		}
		else{
			for (int i = 0; "admin".equalsIgnoreCase(userName) && "asjy".equalsIgnoreCase(userPwd); i++) {
				System.out.println("���µ�¼");
				System.out.println("�������û�����");
				userName = scan.next();
				System.out.println("���������룺");
				userPwd = scan.next();
				
				if(i>2){
					System.out.println("����3�ε�¼ʧ�ܣ��������ٵ�¼");
					break;
				}
				System.out.println("��¼�ɹ���");
				
			}
		}
	*/
		
	Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0;i<3;i++) {
		
		System.out.println("�������û�����");
		String userName = scan.next();
		System.out.println("���������룺");
		String userPwd = scan.next();
		
		if("admin".equals(userName) && "asjy".equals(userPwd)){
			System.out.println("��½�ɹ���");
		}else{
			System.out.println("�û��������벻��ȷ�����������룡");
		}continue;

		}System.out.println("�������ٵ�¼");
		
	}
}
	

