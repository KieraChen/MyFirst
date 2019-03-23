package class3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
/*		4.数组的元素取值及运算
		模拟选班长：
			现有5名候选人要竞选班长，每个人的编号分别为1、2、3、4、5。 现有若干人为这5个候选人进行投票。
			循环接受每个人从键盘输入所投票的编号，若投票有效，则进行统计相应候选人的票数，
			若投票无效，则提示投票无效，并继续接受下一个投票，直到接受的投票为0号时，投票结束。
			显示出每位候选人的得票数，并显示出最终哪位候选人当选了班长
*/
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int i;

		do{
			System.out.println("请输入投票的班长编号：");
			i = scan.nextInt();
			if(i > 0 && i <= 5){
				arr[i-1] = arr[i-1]+1;
			}
			else{
				System.out.println("投票无效！");
			}
		}while(i != 0);
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println("编号"+(j+1)+"竞选者票数为："+arr[j]);
		}
		int max = arr[0];
		for (int j = 0; j < (arr.length-1); j++) {
			if(max < arr[j+1]){
				max = arr[j+1];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if(max == arr[j]){
				System.out.println("班长编号为"+(j+1));
			}
		}

	}

}
