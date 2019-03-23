package class2;

import java.util.Scanner;

public class Math4 {

	public static void main(String[] args) {
		/*接受用户从键盘输入一个数n，判断该数是奇数还是偶数，
		如果是奇数，则求1~n之间的奇数的倒数和，如果是偶数，
		则求2~n之间的偶数倒数和。例如，当用户输入8时，求1/2+1/4+1/6+1/8的和。*/

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		double n = scan.nextInt();
		
		
		if(n%2 == 0){
			double sum = 0;
			for (double i = 2; i <= n; i = i+2) {
				sum = sum + 1/i;
			}
			System.out.println(sum);
		}
		else{
			double sum1 = 0;
			for (double i = 1; i <= n; i = i+2) {
				sum1 = sum1 + 1/i;
			}
			System.out.println(sum1);
		}
		

	}

}
