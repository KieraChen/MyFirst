package class1;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		3、	拆数字
		a)	从键盘输入一个五位数
		b)	将这五位数拆分成5个一位数，分别保存在5个不同的变量中
		c)	将拆分完的5个数，依次显示出来
		例如：键盘输入42380，则输出4   2     3     8     0

		（提示：
		用number代表任意的一个数，则有如下原则：
		---number/10能够将number的尾数舍掉，因为两个整数相除，只能得到整除的结果
		---number%10代表一个数除以10得到的余数，该余数一定是number的尾数）
*/
	System.out.println("请输入一个五位数：");	
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
	int a1 = num/10;
	int a = num%10;
	int b1 = a1/10;
	int b = a1%10;
	int c1 = b1/10;
	int c = b1%10;
	int d1 = c1/10;
	int d = c1%10;
	int e1 = d1/10;
	int e = d1%10;
	
	System.out.println(e);
	System.out.println(d);
	System.out.println(c);
	System.out.println(b);
	System.out.println(a);
		
		
		
	}

}
