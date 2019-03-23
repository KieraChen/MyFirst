package class1;

import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		2、	统计小朋友摘苹果的个数。具体要求如下：
		a)	有小红、小刚、小丽、小玉4个小朋友到苹果园子摘苹果。
		b)	先输入小红摘的苹果数，然后输出1个小朋友一共摘了多少个苹果；
		c)	再输入小刚摘的苹果数，然后输出2个小朋友一共摘了多少个苹果；
		d)	再输入小丽摘的苹果数，然后输出3个小朋友一共摘了多少个苹果；
		e)	再输入小玉摘的苹果数，然后输出4个小朋友一共摘了多少个苹果。
*/
		System.out.println("请输入小红摘的苹果数：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("1个小朋友一共摘了"+a+"个苹果");
		
		System.out.println("请输入小刚摘的苹果数：");
		int b = scan.nextInt();
		System.out.println("2个小朋友一共摘了"+(a+b)+"个苹果");
		
		System.out.println("请输入小丽摘的苹果数：");
		int c = scan.nextInt();
		System.out.println("3个小朋友一共摘了"+(a+b+c)+"个苹果");
		
		System.out.println("请输入小玉摘的苹果数：");
		int d = scan.nextInt();
		System.out.println("4个小朋友一共摘了"+(a+b+c+d)+"个苹果");
		
		
		
	}

}
