package class3;


import java.util.Arrays;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
/*		5�������Ӧ��
		ʵ��˫ɫ��Ļ�ѡ���ܣ�
		    ˫ɫ��Ĺ��ɣ�6�����+1�����ţ���ŵķ�Χ��1-33�����ŵķ�Χ��1-16��
		����һ������Ϊ6���������飬�洢6����ͬ��1-33֮����������
		����һ���������洢1-16֮���������������ѡ�ĺ��롣
		Ч��ͼ���£�
		����˫ɫ���ѡ�������£�
		��ţ�3 10 17 23 29 30 ���ţ�14
		1)	��������Ϊ6������
		2)	��Ƕ��ѭ����ͨ��ѭ�����ϵĲ����������ÿ����һ����������ж��Ƿ����������Ѿ����ڣ�
		           ������ڣ������������һ�����������������ڣ��������������뵽������
		3)	���򣺴�С��������
*/
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];
		int i = 0;
		do{
			int a = (int)(1+Math.random()*33);	
			for (int j = 0; j < arr.length; j++) {
				if(a != arr[j]){
					a = arr[j];
					i = i + 1;
				}
			}
			
			
		}while(i > 5);
		/*for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println(i);*/
		System.out.print("���� ");
		Arrays.sort(arr);
		for (int j : arr) {
			System.out.print(j+" ");
		}
		int b = (int)(1+Math.random()*16);
		System.out.print("���� "+b);

	}

}
