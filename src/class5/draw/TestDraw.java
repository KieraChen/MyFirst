package class5.draw;

import java.util.Scanner;

public class TestDraw {
/*	2��	������TestDraw���������У������û�����ÿ��ͼ�����ܳ�����Ҫ�����ݣ�
 *      ��������Ӧ��round��������ܳ�����ʾ������ע�������������һ��ͼ��*/
	public static void main(String[] args) {
		Draw draw = new Draw();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������Բ�ΰ뾶");
		double r = scan.nextDouble();
		draw.round(r);
		System.out.println("Բ���ܳ�Ϊ��"+draw.getDrawRound());
		
		System.out.println("�����볤���εĳ�");
		int length = scan.nextInt();
		System.out.println("�����볤���εĿ�");
		int width = scan.nextInt();
		draw.round(length, width);
		System.out.println("�������ܳ�Ϊ��"+draw.getDrawRound());
		
		System.out.println("�����������α߳�");
		int length1 = scan.nextInt();
		draw.round(length1);
		System.out.println("�������ܳ�Ϊ��"+draw.getDrawRound());
		
		System.out.println("�����������α߳�1");
		int a = scan.nextInt();
		System.out.println("�����������α߳�2");
		int b = scan.nextInt();
		System.out.println("�����������α߳�3");
		int c = scan.nextInt();
		draw.round(a, b, c);
		System.out.println("�������ܳ�Ϊ��"+draw.getDrawRound());
		
	

	}

}
