package class3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
/*		2．数组的应用
		1)	声明一个double类型的数组，用来存储员工的工资
		2)	提示用户输入有多少个员工
		3)	根据员工的个数，给数组分配长度
		4)	接受用户从键盘输入每个员工的工资
		5)	显示出所有员工的工资
		6)	统计出所有员工的平均工资并输出
		7)	求出最高工资和最低工资，并显示分别是哪个员工的工资
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入员工个数");
		int i = scan.nextInt();
		double salary[] = new double[i];
		for (int j = 0; j < salary.length; j++) {
			System.out.println("请输入第【"+(j+1)+"】个员工工资");
			salary[j] = scan.nextDouble();
		}
		for (int j = 0; j < salary.length; j++) {
			System.out.println("员工"+(j+1)+" 工资"+salary[j]);
		}
		
		double sum = 0;
		for (int j = 0; j < salary.length; j++) {
			sum = sum + salary[j];	
		}
		System.out.println("所有员工平均工资："+(sum/i));
		
		double max = salary[0];
		for (int j = 0; j < (salary.length-1); j++) {
			
			if(max < salary[j+1]){
				max = salary[j+1];
			}
		}
		double min = salary[0];
		for (int j = 0; j < (salary.length-1); j++) {
			
			if(min > salary[j+1]){
				min = salary[j+1];
			}
		}
		
		for (int j = 0; j < salary.length; j++) {
			if(salary[j] == max){
				System.out.println("员工"+(j+1)+" 为最高工资"+max);
			}
		    else if(salary[j] == min){
				System.out.println("员工"+(j+1)+" 为最低工资"+min);
			}
			else{}
		}
		

	}

}
