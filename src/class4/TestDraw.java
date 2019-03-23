package class4;

import java.util.Scanner;

public class TestDraw {
/*	创建类TestDraw，通过控制台输入3个整数，代表三角形的三条边，
 * 判断能否构成三角形，如果不能构成，则给出提示；
 * 如果可以构成三角形，则调用calculateArea()，计算该三角形的面积。*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三角形的边长1：");
		int a = scan.nextInt();
		System.out.println("请输入三角形的边长2：");
		int b = scan.nextInt();
		System.out.println("请输入三角形的边长3：");
		int c = scan.nextInt();
		if(a+b > c && b+c > a && c+a > b){
			Draw ss = new Draw();
			double area = ss.calculateArea(a,b,c);
			System.out.println("三角形面积为："+ area);
			
		}
		else{
			System.out.println("不能构成三角形！");
		}
		

	}

}
