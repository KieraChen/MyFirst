package class1;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		3��	������
		a)	�Ӽ�������һ����λ��
		b)	������λ����ֳ�5��һλ�����ֱ𱣴���5����ͬ�ı�����
		c)	��������5������������ʾ����
		���磺��������42380�������4   2     3     8     0

		����ʾ��
		��number���������һ��������������ԭ��
		---number/10�ܹ���number��β���������Ϊ�������������ֻ�ܵõ������Ľ��
		---number%10����һ��������10�õ���������������һ����number��β����
*/
	System.out.println("������һ����λ����");	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	int a1 = num/10;
	int a = num%10;
	int b1 = a1/10;
	int b = a1%10;
	int c1 = b1/10;
	int c = b1%10;
	int d1 = c1/10;
	int d = c1%10;
	int e1 = d1/10;
	int e = d1%10;
	
	System.out.println(e);
	System.out.println(d);
	System.out.println(c);
	System.out.println(b);
	System.out.println(a);
		
		
		
	}

}
