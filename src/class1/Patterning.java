package class1;

import java.util.Scanner;

public class Patterning {

	public static void main(String[] args) {
//1、求图形的周长和面积。具体要求如下：
//a)通过键盘输入长方形的长和宽，输入前给出相应的提示，求出长方形的周长和面积并输出
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入长方形的长：");
		float a1 = scan.nextFloat();
		System.out.println("请输入长方形的宽：");
		float b1 = scan.nextFloat();
		
		System.out.println("长方形周长为："+2*(a1+b1));
		System.out.println("长方形面积为："+a1*b1);
		
//b)通过键盘输入正方形的边长，输入前给出相应的提示，求出正方形的周长和面积并输出
		System.out.println("请输入正方形的边长：");
		float a2 = scan.nextFloat();
		
		System.out.println("正方形周长为："+4*a2);
		System.out.println("正方形面积为："+a2*a2);
		
//c)通过键盘输入圆形的半径，输入前给出相应的提示，求出圆形的周长和面积并输出
		System.out.println("请输入圆形的半径：");
		float r = scan.nextFloat();
		
	    System.out.println("圆形周长为："+2*Math.PI*r);
	    System.out.println("圆形面积为："+r*Math.PI*r);
	    
//d)通过键盘输入三角形的边长，输入前给出相应的提示，求出三角形的周长和面积并输出
//d = (a+b+c)/2; 面积 = Math.sqrt(d*(d-a)*(d-b)*(d-c))
	    System.out.println("请输入三角形的边长1：");
		float a3 = scan.nextFloat();
		System.out.println("请输入三角形的边长2：");
		float b3 = scan.nextFloat();
		System.out.println("请输入三角形的边长3：");
		float c3 = scan.nextFloat();
		
		System.out.println("三角形周长为："+(a3+b3+c3));
		float d = (a3+b3+c3)/2;
	    System.out.println("三角形面积为："+Math.sqrt(d*(d-a3)*(d-b3)*(d-c3)));
		
	

		
	}

}
