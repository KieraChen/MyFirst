package class4;

import java.util.Scanner;

public class Add {
/*	4������������ż���ĺ͡�
	1)	main�����������û��Ӽ�������һ�������жϸ�������������ż����
	          �����������������Զ��巽��evenAdd()����1��n֮��������ĵ����ͣ��������
	          �����ż����������Զ��巽��oddAdd()����2��n֮���ż�������ͣ��������
	2)	evenAdd��������һ��int��������������main�������ݹ�����ֵ��
	           ʹ��ѭ�������1������֮������������ͣ��������������з��ء�
	3)	oddAdd��������һ��int��������������main�������ݹ�����ֵ��
	           ʹ��ѭ�������2������֮���ż�������ͣ��������������з��ء�
*/
	static double evenAdd(int a){
		double b = 0;
		for (double i = 1; i <= a; i += 2) {
			b = b + (1/i);
		}
		return b;
	}
	
	static double oddAdd(int a){
		double b = 0;
		for (double i = 2; i <= a; i += 2) {
			b = b + (1/i);
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("������һ������");
		int a = scan.nextInt();
		if(a%2 == 1){
			System.out.println("��������"+evenAdd(a));
		}
		else{
			System.out.println("��������"+oddAdd(a));
		}

	}

}
