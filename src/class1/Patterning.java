package class1;

import java.util.Scanner;

public class Patterning {

	public static void main(String[] args) {
//1����ͼ�ε��ܳ������������Ҫ�����£�
//a)ͨ���������볤���εĳ��Ϳ�����ǰ������Ӧ����ʾ����������ε��ܳ�����������
		Scanner scan = new Scanner(System.in);
		System.out.println("�����볤���εĳ���");
		float a1 = scan.nextFloat();
		System.out.println("�����볤���εĿ�");
		float b1 = scan.nextFloat();
		
		System.out.println("�������ܳ�Ϊ��"+2*(a1+b1));
		System.out.println("���������Ϊ��"+a1*b1);
		
//b)ͨ���������������εı߳�������ǰ������Ӧ����ʾ����������ε��ܳ�����������
		System.out.println("�����������εı߳���");
		float a2 = scan.nextFloat();
		
		System.out.println("�������ܳ�Ϊ��"+4*a2);
		System.out.println("���������Ϊ��"+a2*a2);
		
//c)ͨ����������Բ�εİ뾶������ǰ������Ӧ����ʾ�����Բ�ε��ܳ�����������
		System.out.println("������Բ�εİ뾶��");
		float r = scan.nextFloat();
		
	    System.out.println("Բ���ܳ�Ϊ��"+2*Math.PI*r);
	    System.out.println("Բ�����Ϊ��"+r*Math.PI*r);
	    
//d)ͨ���������������εı߳�������ǰ������Ӧ����ʾ����������ε��ܳ�����������
//d = (a+b+c)/2; ��� = Math.sqrt(d*(d-a)*(d-b)*(d-c))
	    System.out.println("�����������εı߳�1��");
		float a3 = scan.nextFloat();
		System.out.println("�����������εı߳�2��");
		float b3 = scan.nextFloat();
		System.out.println("�����������εı߳�3��");
		float c3 = scan.nextFloat();
		
		System.out.println("�������ܳ�Ϊ��"+(a3+b3+c3));
		float d = (a3+b3+c3)/2;
	    System.out.println("���������Ϊ��"+Math.sqrt(d*(d-a3)*(d-b3)*(d-c3)));
		
	

		
	}

}
