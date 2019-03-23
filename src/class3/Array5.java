package class3;


import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
/*		5．数组的应用
		实现双色球的机选功能：
		    双色球的构成：6个红号+1个蓝号，红号的范围是1-33，蓝号的范围是1-16。
		声明一个长度为6的整型数组，存储6个不同的1-33之间的随机数；
		声明一个变量，存储1-16之间的随机数；输出机选的号码。
		效果图如下：
		本期双色球机选号码如下：
		红号：3 10 17 23 29 30 蓝号：14
		1)	声明长度为6的数组
		2)	【嵌套循环】通过循环不断的产生随机数，每产生一个随机数先判断是否在数组中已经存在，
		           如果存在，则继续产生下一个随机数，如果不存在，将这个随机数存入到数组中
		3)	排序：从小到大排序
*/
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];
		int i = 0;
		do{
			int a = (int)(1+Math.random()*33);	
			for (int j = 0; j < arr.length; j++) {
				if(a != arr[j]){
					a = arr[j];
					i = i + 1;
				}
			}
			
			
		}while(i > 5);
		/*for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println(i);*/
		System.out.print("红球： ");
		Arrays.sort(arr);
		for (int j : arr) {
			System.out.print(j+" ");
		}
		int b = (int)(1+Math.random()*16);
		System.out.print("蓝球： "+b);

	}

}
