package class3;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
/*		1.����ĳ�ʼ����ȡֵ
		1)	����һ���ַ������飬����ʼ��10��ˮ��������
		2)	��ʾ����10��ˮ�������֣�����ͼ��ʾ
		3)	�����û��ӿ���̨����һ��������������Ҫѡ��ˮ����ţ��жϱ�ŵ���Ч�ԣ�
		           �����Ч������ʾû�д˱�ŵ�ˮ����Ҫ���û���������ѡ��
		           ��������Ч������ʾ���û�ѡ�����ĸ�ˮ��
*/
		String arr[] = new String[10];
		arr[0] = "����";
		arr[1] = "��ݮ";
		arr[2] = "����";
		arr[3] = "ƻ��";
		arr[4] = "�㽶";
		arr[5] = "����";
		arr[6] = "��ݮ";
		arr[7] = "����";
		arr[8] = "����";
		arr[9] = "����";
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+". "+arr[i]);
		}
		
    	Scanner scan = new Scanner(System.in);
    	System.out.println("��������ѡ���ˮ�����");
		int a = scan.nextInt();
	    do{
	    	System.out.println("������������ѡ���ˮ�����");
	    	a = scan.nextInt();
	    }while(a <= 0 || a > arr.length);
	    System.out.println("��ѡ����"+arr[a-1]);

		

	}

}
