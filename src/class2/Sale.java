package class2;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		/*修改商场打折活动的题目，实现能够连续为客户结账的功能，
		每次为一位顾客结账结束之后，提问是否继续为下一位顾客结账，
		当输入‘y’的时候则继续，否则结束*/

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
			
		
		System.out.println("请输入是否继续为下一位顾客结账（y-是，其它-否）");
		answer = scan.next();
		}while("y".equalsIgnoreCase(answer));

	}

}
