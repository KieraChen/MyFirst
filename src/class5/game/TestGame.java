package class5.game;

import java.util.Scanner;

public class TestGame {
/*	2．	测试类TestGame，创建3个游戏对象，接受键盘输入，给每个游戏的属性赋值，
 *      显示出所有游戏的属性值，输出每款游戏允许组团的最少人数*/
	public static void main(String[] args) {
		NetGame netgame1 = new NetGame();
		NetGame netgame2 = new NetGame();
		NetGame netgame3 = new NetGame();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个游戏名");
		String gameName1 = scan.next();
		netgame1.setGameName(gameName1);
		System.out.println("请输入第一个游戏服务器");
		String gameServer1 = scan.next();
		netgame1.setGameServer(gameServer1);
		System.out.println("请输入第一个游戏等级");
		int gameLevel1 = scan.nextInt();
		netgame1.setGameLevel(gameLevel1);
		System.out.println("请输入该游戏组团最少人数");
		int person1 = scan.nextInt();
		
		System.out.println("请输入第二个游戏名");
		String gameName2 = scan.next();
		netgame2.setGameName(gameName2);
		System.out.println("请输入第二个游戏服务器");
		String gameServer2 = scan.next();
		netgame2.setGameServer(gameServer2);
		System.out.println("请输入第二个游戏等级");
		int gameLevel2 = scan.nextInt();
		netgame2.setGameLevel(gameLevel2);
		System.out.println("请输入该游戏组团最少人数");
		int person2 = scan.nextInt();
		
		System.out.println("请输入第三个游戏名");
		String gameName3 = scan.next();
		netgame3.setGameName(gameName3);
		System.out.println("请输入第三个游戏服务器");
		String gameServer3 = scan.next();
		netgame3.setGameServer(gameServer3);
		System.out.println("请输入第三个游戏等级");
		int gameLevel3 = scan.nextInt();
		netgame3.setGameLevel(gameLevel3);
		System.out.println("请输入该游戏组团最少人数");
		int person3 = scan.nextInt();
		
		netgame1.show();
		System.out.println("游戏1组团人数为："+netgame1.group(person1));
		netgame2.show();
		System.out.println("游戏2组团人数为："+netgame2.group(person2));
		netgame3.show();
		System.out.println("游戏3组团人数为："+netgame3.group(person3));

	}

}
