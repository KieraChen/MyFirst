package class5.draw;

import java.util.Scanner;

public class TestDraw {
/*	2、	创建类TestDraw，主方法中，接受用户输入每种图形求周长所需要的数据，
 *      并调用相应的round方法求出周长并显示出来，注意描述清楚是哪一种图形*/
	public static void main(String[] args) {
		Draw draw = new Draw();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入圆形半径");
		double r = scan.nextDouble();
		draw.round(r);
		System.out.println("圆形周长为："+draw.getDrawRound());
		
		System.out.println("请输入长方形的长");
		int length = scan.nextInt();
		System.out.println("请输入长方形的宽");
		int width = scan.nextInt();
		draw.round(length, width);
		System.out.println("长方形周长为："+draw.getDrawRound());
		
		System.out.println("请输入正方形边长");
		int length1 = scan.nextInt();
		draw.round(length1);
		System.out.println("正方形周长为："+draw.getDrawRound());
		
		System.out.println("请输入三角形边长1");
		int a = scan.nextInt();
		System.out.println("请输入三角形边长2");
		int b = scan.nextInt();
		System.out.println("请输入三角形边长3");
		int c = scan.nextInt();
		draw.round(a, b, c);
		System.out.println("三角形周长为："+draw.getDrawRound());
		
	

	}

}
