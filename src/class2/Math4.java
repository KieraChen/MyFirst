package class2;

import java.util.Scanner;

public class Math4 {

	public static void main(String[] args) {
		/*�����û��Ӽ�������һ����n���жϸ�������������ż����
		���������������1~n֮��������ĵ����ͣ������ż����
		����2~n֮���ż�������͡����磬���û�����8ʱ����1/2+1/4+1/6+1/8�ĺ͡�*/

		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		double n = scan.nextInt();
		
		
		if(n%2 == 0){
			double sum = 0;
			for (double i = 2; i <= n; i = i+2) {
				sum = sum + 1/i;
			}
			System.out.println(sum);
		}
		else{
			double sum1 = 0;
			for (double i = 1; i <= n; i = i+2) {
				sum1 = sum1 + 1/i;
			}
			System.out.println(sum1);
		}
		

	}

}
