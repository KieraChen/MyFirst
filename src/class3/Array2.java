package class3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
/*		2�������Ӧ��
		1)	����һ��double���͵����飬�����洢Ա���Ĺ���
		2)	��ʾ�û������ж��ٸ�Ա��
		3)	����Ա���ĸ�������������䳤��
		4)	�����û��Ӽ�������ÿ��Ա���Ĺ���
		5)	��ʾ������Ա���Ĺ���
		6)	ͳ�Ƴ�����Ա����ƽ�����ʲ����
		7)	�����߹��ʺ���͹��ʣ�����ʾ�ֱ����ĸ�Ա���Ĺ���
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ա������");
		int i = scan.nextInt();
		double salary[] = new double[i];
		for (int j = 0; j < salary.length; j++) {
			System.out.println("������ڡ�"+(j+1)+"����Ա������");
			salary[j] = scan.nextDouble();
		}
		for (int j = 0; j < salary.length; j++) {
			System.out.println("Ա��"+(j+1)+" ����"+salary[j]);
		}
		
		double sum = 0;
		for (int j = 0; j < salary.length; j++) {
			sum = sum + salary[j];	
		}
		System.out.println("����Ա��ƽ�����ʣ�"+(sum/i));
		
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
				System.out.println("Ա��"+(j+1)+" Ϊ��߹���"+max);
			}
		    else if(salary[j] == min){
				System.out.println("Ա��"+(j+1)+" Ϊ��͹���"+min);
			}
			else{}
		}
		

	}

}
