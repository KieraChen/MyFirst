package class2;

import java.util.Scanner;

public class Math3 {

	public static void main(String[] args) {
		/*����forѭ����1��n֮���ż����ƽ���ͣ�n��ֵ�Ӽ������롣
		�����û��Ӽ�������n��ֵΪ9������1��9֮���ż����ƽ���ĺͣ�
		��22+42+62+82��*/
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if(i%2 == 0){
				sum=sum+i*i;
			}
	
			
		}
		System.out.println(sum);
	}

}
