package class2;

import java.util.Scanner;

public class Math2 {

	public static void main(String[] args) {
/*		通过键盘输入一个整数，将该整数进行拆分成n位数，将每位数分别输出。
		   例如：输入153，则输出1  5  3
		   		int i,a = 0;
		for ( i = 1; num > 10 ; i++) {
			num=num/10;
			 a = i+1;		
		}
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = scan.nextInt();
		int a;
		String b = "";
		do{
			
			a=num%10;
			
			num=num/10;
			b =a+" "+b;
			
			
			
		}while(num != 0 );

		System.out.print(b);

	}

}
