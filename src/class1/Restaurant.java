package class1;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1��	������������ʾ�û�����ע����Ϣ��Ҫ���û������û����������ȷ�����룬
 *          �ж��û����������Ƿ����Ҫ�������ȷ�������Ƿ���ͬ����������Ч����ע��ɹ���
 *          ������ʾ�û����е�¼�����������Ӧ�Ĵ�����ʾ��Ϣ�����������
		2��	��ע��ɹ�����ɵ�¼���ܣ���ʾ�û������û��������룬��ո�ע�����Ϣ���бȽϣ�
		           ��¼�ɹ��������Ӧ��ʾ��������������¹���
		3��	��¼�ɹ�����ɸù��ܣ�ģ����ϵͳ�������û�һ����ʾ��Ϣ������Ҫ�������ǳ��棬
		           ���û�����1������������2�����棬��������������û�ѡ������ò͡�
		           ���û�ѡ�񳴱��󣬼�����ʾ�û�ѡ�����㳴�����Ǽ����������������û���ѡ��
		           ��ʾ��Ӧ����ʾ��Ϣ��������ѡ����****�����Ժ󣡡������û�ѡ���棬
		           ������ʾ�û�ѡ����˿���滹���߲����棬�������û���ѡ����ʾ��Ӧ����ʾ��Ϣ��
		           ������ѡ����****�����Ժ󣡡�
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("��ע����Ϣ");
		System.out.println("�������û�����");
		String userName = scan.next();
		System.out.println("���������룺");
		String userPwd = scan.next();
		System.out.println("��ȷ�����룺");
		String userPwd1 = scan.next();
		
		if(userPwd1.equals(userPwd)){
			System.out.println("ע��ɹ���");
			System.out.println("�������û�����");
			String userName2 = scan.next();
			System.out.println("���������룺");
			String userPwd2 = scan.next();
			
		    if(userName2.equals(userName) && userPwd2.equals(userPwd)){
			    	System.out.println("��¼�ɹ���");
			    	
			    	System.out.println("����������Ҫ�������ǳ��棨1-������2-���棬����-�����òͣ�");
			    	String userNeed = scan.next();
			    	
			    	if("1".equals(userNeed)){
			    		System.out.println("����������Ҫ���㳴�����Ǽ���������1-���㳴��������-����������");
			    		String pancake = scan.next();
			    		if("1".equals(pancake)){
			    			System.out.println("��ѡ�������㳴�������Ժ�");
			    		}
			    		else{
			    			System.out.println("��ѡ���˼������������Ժ�");
			    		}
			    	}
			    	else if("2".equals(userNeed)){
			    		System.out.println("����������Ҫ��˿���滹���߲˳��棨1-��˿���棬����-�߲˳��棩");
			    		String noodle = scan.next();
			    		if("1".equals(noodle)){
			    			System.out.println("��ѡ������˿���棬���Ժ�");
			    		}
			    		else{
			    			System.out.println("��ѡ�����߲˳��棬���Ժ�");
			    		}
			    	}
			    	else{
			    		System.out.println("�����òͣ�");
			    	}
			    }
			else{
			    	System.out.println("��½ʧ�ܣ�");
			    }
		}
		  
		else{
			System.out.println("ע��ʧ�ܣ�");
		}
		
		
		
	}

}
