package class3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
/*		4.�����Ԫ��ȡֵ������
		ģ��ѡ�೤��
			����5����ѡ��Ҫ��ѡ�೤��ÿ���˵ı�ŷֱ�Ϊ1��2��3��4��5�� ����������Ϊ��5����ѡ�˽���ͶƱ��
			ѭ������ÿ���˴Ӽ���������ͶƱ�ı�ţ���ͶƱ��Ч�������ͳ����Ӧ��ѡ�˵�Ʊ����
			��ͶƱ��Ч������ʾͶƱ��Ч��������������һ��ͶƱ��ֱ�����ܵ�ͶƱΪ0��ʱ��ͶƱ������
			��ʾ��ÿλ��ѡ�˵ĵ�Ʊ��������ʾ��������λ��ѡ�˵�ѡ�˰೤
*/
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int i;

		do{
			System.out.println("������ͶƱ�İ೤��ţ�");
			i = scan.nextInt();
			if(i > 0 && i <= 5){
				arr[i-1] = arr[i-1]+1;
			}
			else{
				System.out.println("ͶƱ��Ч��");
			}
		}while(i != 0);
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println("���"+(j+1)+"��ѡ��Ʊ��Ϊ��"+arr[j]);
		}
		int max = arr[0];
		for (int j = 0; j < (arr.length-1); j++) {
			if(max < arr[j+1]){
				max = arr[j+1];
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if(max == arr[j]){
				System.out.println("�೤���Ϊ"+(j+1));
			}
		}

	}

}
