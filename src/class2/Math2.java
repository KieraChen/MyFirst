package class2;

import java.util.Scanner;

public class Math2 {

	public static void main(String[] args) {
/*		ͨ����������һ�������������������в�ֳ�nλ������ÿλ���ֱ������
		   ���磺����153�������1  5  3
		   		int i,a = 0;
		for ( i = 1; num > 10 ; i++) {
			num=num/10;
			 a = i+1;		
		}
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
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
