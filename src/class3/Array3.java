package class3;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
/*		3.数组的应用
		修改之前做过的商场打折的题目，当为所有的顾客结账结束之后
		1）	统计出今天本商场的收入总额是多少钱，即统计出所有顾客的支付金额的总和
		2）	显示出今天的最高消费额和最低消费额分别为多少钱及第几位顾客
*/
		int i = 0;
		float arr[] = new float[100];
		String answer;
		do{
			System.out.println("请输入您的消费金额：");
			Scanner scan = new Scanner(System.in);
			float sum = scan.nextFloat();	
			
			if(sum >= 2000){
				
				System.out.println("请输入您是否为会员（y - 会员，其它 - 非会员）:");
				String vip = scan.next();
				
				if("y".equalsIgnoreCase(vip)){
					
					System.out.println("请输入您的支付方式（1-现金支付 2-信用卡支付 其它-借记卡支付）：");
					String pay = scan.next();
					
					if("1".equals(pay)){
						System.out.println("您消费"+sum+"元，并且为会员，选择了现金支付，可以享受8折优惠，您的实际支付金额为"+0.8*sum+"元");
					}
					else if("2".equals(pay)){
						
						System.out.println("您消费"+sum+"元，并且为会员，选择了信用卡支付，可以享受8.5折优惠，您的实际支付金额为"+0.85*sum+"元");
					}
					else{
						System.out.println("您消费"+sum+"元，并且为会员，选择了借记卡支付，可以享受9折优惠，您的实际支付金额为"+0.9*sum+"元");
					}
					
				}
				else{
					System.out.println("您消费"+sum+"元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为"+0.95*sum+"元");
				}
				
			}
			else{
				System.out.println("您的消费金额不足2000，只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为"+sum+"元");
			}
			
		arr[i] = sum;
		System.out.println("请输入是否继续为下一位顾客结账（y-是，其它-否）");
		answer = scan.next();
		i = i + 1;
		}while("y".equalsIgnoreCase(answer));
		
		float consume = 0;
		for (int j = 0; j < arr.length; j++) {
			consume = consume + arr[j];
		}
		System.out.println("消费总额："+ consume);
		
		double max = arr[0];
		for (int j = 0; j < (arr.length-1) && j < i; j++) {
			
			if(max < arr[j+1]){
				max = arr[j+1];
			}
		}
		double min = arr[0];
		for (int j = 0; j < (arr.length-1) && (j < i-1); j++) {
			
			if(min > arr[j+1]){
				min = arr[j+1];
			}
		}
		System.out.println(i);
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] == max){
				System.out.println("顾客"+(j+1)+" 为最高消费"+max);
			}
		    else if(arr[j] == min){
				System.out.println("顾客"+(j+1)+" 为最低消费"+min);
			}
			else{}
		}
	
		
	}

}
