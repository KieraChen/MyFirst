package class2;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		/*�޸��̳����ۻ����Ŀ��ʵ���ܹ�����Ϊ�ͻ����˵Ĺ��ܣ�
		ÿ��Ϊһλ�˿ͽ��˽���֮�������Ƿ����Ϊ��һλ�˿ͽ��ˣ�
		�����롮y����ʱ����������������*/

		String answer;
		do{
			System.out.println("�������������ѽ�");
			Scanner scan = new Scanner(System.in);
			float sum = scan.nextFloat();	
			
			if(sum >= 2000){
				
				System.out.println("���������Ƿ�Ϊ��Ա��y - ��Ա������ - �ǻ�Ա��:");
				String vip = scan.next();
				
				if("y".equalsIgnoreCase(vip)){
					
					System.out.println("����������֧����ʽ��1-�ֽ�֧�� 2-���ÿ�֧�� ����-��ǿ�֧������");
					String pay = scan.next();
					
					if("1".equals(pay)){
						System.out.println("������"+sum+"Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8���Żݣ�����ʵ��֧�����Ϊ"+0.8*sum+"Ԫ");
					}
					else if("2".equals(pay)){
						
						System.out.println("������"+sum+"Ԫ������Ϊ��Ա��ѡ�������ÿ�֧������������8.5���Żݣ�����ʵ��֧�����Ϊ"+0.85*sum+"Ԫ");
					}
					else{
						System.out.println("������"+sum+"Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ"+0.9*sum+"Ԫ");
					}
					
				}
				else{
					System.out.println("������"+sum+"Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ"+0.95*sum+"Ԫ");
				}
				
			}
			else{
				System.out.println("�������ѽ���2000��ֻ��ʹ���ֽ�֧�������������κδ��۵��Żݣ�����ʵ��֧�����Ϊ"+sum+"Ԫ");
			}
			
		
		System.out.println("�������Ƿ����Ϊ��һλ�˿ͽ��ˣ�y-�ǣ�����-��");
		answer = scan.next();
		}while("y".equalsIgnoreCase(answer));

	}

}
