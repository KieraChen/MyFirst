package class1;

import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		2��	ͳ��С����ժƻ���ĸ���������Ҫ�����£�
		a)	��С�졢С�ա�С����С��4��С���ѵ�ƻ��԰��ժƻ����
		b)	������С��ժ��ƻ������Ȼ�����1��С����һ��ժ�˶��ٸ�ƻ����
		c)	������С��ժ��ƻ������Ȼ�����2��С����һ��ժ�˶��ٸ�ƻ����
		d)	������С��ժ��ƻ������Ȼ�����3��С����һ��ժ�˶��ٸ�ƻ����
		e)	������С��ժ��ƻ������Ȼ�����4��С����һ��ժ�˶��ٸ�ƻ����
*/
		System.out.println("������С��ժ��ƻ������");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("1��С����һ��ժ��"+a+"��ƻ��");
		
		System.out.println("������С��ժ��ƻ������");
		int b = scan.nextInt();
		System.out.println("2��С����һ��ժ��"+(a+b)+"��ƻ��");
		
		System.out.println("������С��ժ��ƻ������");
		int c = scan.nextInt();
		System.out.println("3��С����һ��ժ��"+(a+b+c)+"��ƻ��");
		
		System.out.println("������С��ժ��ƻ������");
		int d = scan.nextInt();
		System.out.println("4��С����һ��ժ��"+(a+b+c+d)+"��ƻ��");
		
		
		
	}

}
