package class4;

import java.util.Scanner;

public class Add {
/*	4、【求奇数和偶数的和】
	1)	main方法：接受用户从键盘输入一个数，判断该数是奇数还是偶数，
	          如果是奇数，则调用自定义方法evenAdd()，求1—n之间的奇数的倒数和，并输出；
	          如果是偶数，则调用自定义方法oddAdd()，求2—n之间的偶数倒数和，并输出。
	2)	evenAdd方法：有一个int参数，用来接受main方法传递过来的值，
	           使用循环求出从1到该数之间的奇数倒数和，并将计算结果进行返回。
	3)	oddAdd方法：有一个int参数，用来接受main方法传递过来的值，
	           使用循环求出从2到该数之间的偶数倒数和，并将计算结果进行返回。
*/
	static double evenAdd(int a){
		double b = 0;
		for (double i = 1; i <= a; i += 2) {
			b = b + (1/i);
		}
		return b;
	}
	
	static double oddAdd(int a){
		double b = 0;
		for (double i = 2; i <= a; i += 2) {
			b = b + (1/i);
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("请输入一个整数");
		int a = scan.nextInt();
		if(a%2 == 1){
			System.out.println("运算结果："+evenAdd(a));
		}
		else{
			System.out.println("运算结果："+oddAdd(a));
		}

	}

}
