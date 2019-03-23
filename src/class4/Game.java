package class4;

import java.util.Scanner;

public class Game {
/*	3、【猜拳游戏】
	1）玩家：电脑和用户
	2）出拳规则：1 - 石头 2 - 剪刀 3 - 布
	3）创建类Game，包含如下3个自定义方法
	a) user()：完成接收控制台输入玩家的出拳，如果出拳无效，要求重新出拳，
	        如果出拳有效，则输出用户的出拳是什么，并返回用户的出拳；
	b) computer()：完成电脑的随机出拳，随机出1-3之间的数字，
	        代表电脑出拳，输出电脑出拳是什么，并返回电脑的出拳；
	c) 创建自定义方法compare()：带有两个参数，分别代表电脑和用户的出拳，
	        判断出谁输谁赢，输出比较结果。

	main：分别调用者3个方法，实现猜拳游戏的功能。
*/
	
	static int user(){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的出拳：");
		
		int a = scan.nextInt();
		while(a != 1 && a !=2 && a !=3 ){
			System.out.println("您输入的出拳编号无效，请重新输入！");	
			a = scan.nextInt();
			}
		switch(a){
		case 1:System.out.println("您选择了石头");break;
		case 2:System.out.println("您选择了剪刀");break;
		case 3:System.out.println("您选择了布");break;
		}
		return a;
	}
	
	static int computer(){
		int a = (int)(1+Math.random()*3);
		switch(a){
		case 1:System.out.println("电脑选择了石头");break;
		case 2:System.out.println("电脑选择了剪刀");break;
		case 3:System.out.println("电脑选择了布");break;
		}
		return a;
	}
	
	static void compare(int a,int b){
		
		switch(a){
		case 1:switch(b){
		case 1:System.out.println("平手");break;
		case 2:System.out.println("用户赢");break;
		case 3:System.out.println("电脑赢");break;
		};break;
		case 2:switch(b){
		case 1:System.out.println("电脑赢");break;
		case 2:System.out.println("平手");break;
		case 3:System.out.println("用户赢");break;
		};break;
		case 3:switch(b){
		case 1:System.out.println("用户赢");break;
		case 2:System.out.println("电脑赢");break;
		case 3:System.out.println("平手");break;
		};break;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("出拳规则：1-石头  2-剪刀  3-布");
		
		int a = user();
		int b = computer();
		compare(a,b);

	}

}
