package class4;

import java.util.Scanner;

public class Game {
/*	3������ȭ��Ϸ��
	1����ң����Ժ��û�
	2����ȭ����1 - ʯͷ 2 - ���� 3 - ��
	3��������Game����������3���Զ��巽��
	a) user()����ɽ��տ���̨������ҵĳ�ȭ�������ȭ��Ч��Ҫ�����³�ȭ��
	        �����ȭ��Ч��������û��ĳ�ȭ��ʲô���������û��ĳ�ȭ��
	b) computer()����ɵ��Ե������ȭ�������1-3֮������֣�
	        ������Գ�ȭ��������Գ�ȭ��ʲô�������ص��Եĳ�ȭ��
	c) �����Զ��巽��compare()�����������������ֱ������Ժ��û��ĳ�ȭ��
	        �жϳ�˭��˭Ӯ������ȽϽ����

	main���ֱ������3��������ʵ�ֲ�ȭ��Ϸ�Ĺ��ܡ�
*/
	
	static int user(){
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ĳ�ȭ��");
		
		int a = scan.nextInt();
		while(a != 1 && a !=2 && a !=3 ){
			System.out.println("������ĳ�ȭ�����Ч�����������룡");	
			a = scan.nextInt();
			}
		switch(a){
		case 1:System.out.println("��ѡ����ʯͷ");break;
		case 2:System.out.println("��ѡ���˼���");break;
		case 3:System.out.println("��ѡ���˲�");break;
		}
		return a;
	}
	
	static int computer(){
		int a = (int)(1+Math.random()*3);
		switch(a){
		case 1:System.out.println("����ѡ����ʯͷ");break;
		case 2:System.out.println("����ѡ���˼���");break;
		case 3:System.out.println("����ѡ���˲�");break;
		}
		return a;
	}
	
	static void compare(int a,int b){
		
		switch(a){
		case 1:switch(b){
		case 1:System.out.println("ƽ��");break;
		case 2:System.out.println("�û�Ӯ");break;
		case 3:System.out.println("����Ӯ");break;
		};break;
		case 2:switch(b){
		case 1:System.out.println("����Ӯ");break;
		case 2:System.out.println("ƽ��");break;
		case 3:System.out.println("�û�Ӯ");break;
		};break;
		case 3:switch(b){
		case 1:System.out.println("�û�Ӯ");break;
		case 2:System.out.println("����Ӯ");break;
		case 3:System.out.println("ƽ��");break;
		};break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("��ȭ����1-ʯͷ  2-����  3-��");
		
		int a = user();
		int b = computer();
		compare(a,b);

	}

}
