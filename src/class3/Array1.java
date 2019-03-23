package class3;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
/*		1.数组的初始化和取值
		1)	声明一个字符串数组，并初始化10个水果的名字
		2)	显示出这10个水果的名字，如下图所示
		3)	接受用户从控制台输入一个整数，代表需要选择水果编号，判断编号的有效性，
		           如果无效，则显示没有此编号的水果，要求用户必须重新选择，
		           如果编号有效，则显示出用户选择了哪个水果
*/
		String arr[] = new String[10];
		arr[0] = "西瓜";
		arr[1] = "草莓";
		arr[2] = "橘子";
		arr[3] = "苹果";
		arr[4] = "香蕉";
		arr[5] = "柠檬";
		arr[6] = "蓝莓";
		arr[7] = "橙子";
		arr[8] = "柚子";
		arr[9] = "桃子";
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+". "+arr[i]);
		}
		
    	Scanner scan = new Scanner(System.in);
    	System.out.println("请输入您选择的水果编号");
		int a = scan.nextInt();
	    do{
	    	System.out.println("请重新输入您选择的水果编号");
	    	a = scan.nextInt();
	    }while(a <= 0 || a > arr.length);
	    System.out.println("您选择了"+arr[a-1]);

		

	}

}
