package class3;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
/*		3.�����Ӧ��
		�޸�֮ǰ�������̳����۵���Ŀ����Ϊ���еĹ˿ͽ��˽���֮��
		1��	ͳ�Ƴ����챾�̳��������ܶ��Ƕ���Ǯ����ͳ�Ƴ����й˿͵�֧�������ܺ�
		2��	��ʾ�������������Ѷ��������Ѷ�ֱ�Ϊ����Ǯ���ڼ�λ�˿�
*/
		int i = 0;
		float arr[] = new float[100];
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
			
		arr[i] = sum;
		System.out.println("�������Ƿ����Ϊ��һλ�˿ͽ��ˣ�y-�ǣ�����-��");
		answer = scan.next();
		i = i + 1;
		}while("y".equalsIgnoreCase(answer));
		
		float consume = 0;
		for (int j = 0; j < arr.length; j++) {
			consume = consume + arr[j];
		}
		System.out.println("�����ܶ"+ consume);
		
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
				System.out.println("�˿�"+(j+1)+" Ϊ�������"+max);
			}
		    else if(arr[j] == min){
				System.out.println("�˿�"+(j+1)+" Ϊ�������"+min);
			}
			else{}
		}
	
		
	}

}
