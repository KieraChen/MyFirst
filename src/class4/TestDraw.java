package class4;

import java.util.Scanner;

public class TestDraw {
/*	������TestDraw��ͨ������̨����3�����������������ε������ߣ�
 * �ж��ܷ񹹳������Σ�������ܹ��ɣ��������ʾ��
 * ������Թ��������Σ������calculateArea()������������ε������*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����������εı߳�1��");
		int a = scan.nextInt();
		System.out.println("�����������εı߳�2��");
		int b = scan.nextInt();
		System.out.println("�����������εı߳�3��");
		int c = scan.nextInt();
		if(a+b > c && b+c > a && c+a > b){
			Draw ss = new Draw();
			double area = ss.calculateArea(a,b,c);
			System.out.println("���������Ϊ��"+ area);
			
		}
		else{
			System.out.println("���ܹ��������Σ�");
		}
		

	}

}
