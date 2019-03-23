package class3;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		/*6、	声明一个3行4列的二维数组，存储一个班级3名学生的4个成绩（如下图所示），
		 * 通过键盘给学生录入成绩，统计每个学生的平均分，统计每个课程的平均分
		HTML	Java	MySQL	JavaScript
	Mary	78	77	76	84
	Tom	    67	80	69	66
	Bruce	81	68	91	72
	提示：
	1）	声明二维数组的方式 数据类型 数组名[][] = new 数据类型[行数][列数];
	2）	引用二维数组某个元素  数组名[行标][列标]*/
		Scanner scan = new Scanner(System.in);

		double arr[][] = new double[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("请输入第"+(i+1)+"位学生的第"+(j+1)+"门课程成绩");
				arr[i][j] = scan.nextDouble();
			}
		}
		
		double sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum1 = sum1 + arr[i][j];
			}
			System.out.println("第"+(i+1)+"位学生的平均分为："+(sum1/4));
			
		}
		
		
		double sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <3; j++) {
				sum2 = sum2 + arr[j][i];
			}
			System.out.println("第"+(i+1)+"门课程的平均分为："+(sum2/3));
		}


	}

}
