package class5.game;

import java.util.Scanner;

public class TestGame {
/*	2��	������TestGame������3����Ϸ���󣬽��ܼ������룬��ÿ����Ϸ�����Ը�ֵ��
 *      ��ʾ��������Ϸ������ֵ�����ÿ����Ϸ�������ŵ���������*/
	public static void main(String[] args) {
		NetGame netgame1 = new NetGame();
		NetGame netgame2 = new NetGame();
		NetGame netgame3 = new NetGame();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ����Ϸ��");
		String gameName1 = scan.next();
		netgame1.setGameName(gameName1);
		System.out.println("�������һ����Ϸ������");
		String gameServer1 = scan.next();
		netgame1.setGameServer(gameServer1);
		System.out.println("�������һ����Ϸ�ȼ�");
		int gameLevel1 = scan.nextInt();
		netgame1.setGameLevel(gameLevel1);
		System.out.println("���������Ϸ������������");
		int person1 = scan.nextInt();
		
		System.out.println("������ڶ�����Ϸ��");
		String gameName2 = scan.next();
		netgame2.setGameName(gameName2);
		System.out.println("������ڶ�����Ϸ������");
		String gameServer2 = scan.next();
		netgame2.setGameServer(gameServer2);
		System.out.println("������ڶ�����Ϸ�ȼ�");
		int gameLevel2 = scan.nextInt();
		netgame2.setGameLevel(gameLevel2);
		System.out.println("���������Ϸ������������");
		int person2 = scan.nextInt();
		
		System.out.println("�������������Ϸ��");
		String gameName3 = scan.next();
		netgame3.setGameName(gameName3);
		System.out.println("�������������Ϸ������");
		String gameServer3 = scan.next();
		netgame3.setGameServer(gameServer3);
		System.out.println("�������������Ϸ�ȼ�");
		int gameLevel3 = scan.nextInt();
		netgame3.setGameLevel(gameLevel3);
		System.out.println("���������Ϸ������������");
		int person3 = scan.nextInt();
		
		netgame1.show();
		System.out.println("��Ϸ1��������Ϊ��"+netgame1.group(person1));
		netgame2.show();
		System.out.println("��Ϸ2��������Ϊ��"+netgame2.group(person2));
		netgame3.show();
		System.out.println("��Ϸ3��������Ϊ��"+netgame3.group(person3));

	}

}
