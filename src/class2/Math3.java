package class2;

import java.util.Scanner;

public class Math3 {

	public static void main(String[] args) {
		/*利用for循环求1到n之间的偶数的平方和，n的值从键盘输入。
		例如用户从键盘输入n的值为9，则求1到9之间的偶数的平方的和，
		即22+42+62+82。*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if(i%2 == 0){
				sum=sum+i*i;
			}
	
			
		}
		System.out.println(sum);
	}

}
