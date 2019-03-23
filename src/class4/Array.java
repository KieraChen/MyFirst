package class4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
/*	5�������ӡ�����������ӷ�0���֣�ѭ�������û������0���֣�����ӵ������У��ظ�Ԫ�ز�������ӣ�����Ҫ�����£�
	1)	��main�����д�������Ϊ10�����飬��ȫ����ʼ��Ϊ0��
	2)	main�����н����û��Ӽ�������һ������
	a)	�����0������ʾ�����������룻
	b)	�������0��������Զ��巽��find(),���Ҹ������������Ƿ���ڣ�
	i.	������ڣ�����ʾ�����Ѵ��ڣ��������������в��룬Ȼ��ѯ���û��Ƿ����������һ����
	ii.	��������ڣ�������Զ��巽��insert()������������Ӵ�����������ӵ�λ�ã�
	��ӳɹ�ѯ���û��Ƿ����������һ��Ԫ�أ�ֱ���û��������������������������ֹͣѭ��
	3)	main�����������ӽ���֮�������
	4)	int find(int arr[],int num)�����ڲ���num��arr�������Ƿ���ڣ�
	������ڣ����ظ����������е�λ�ã��������ڣ��򷵻�10�����ַ����ң�
	5)	int insert(int arr,int num): ������arr���������numԪ�أ�
	��arr�����в��ҵ�һ��Ϊ0��Ԫ�أ���num��ֵ��ӵ���λ�ã���������ӳɹ�֮���λ�ã�
	����Ҳ���Ϊ0�����֣��򷵻�10�����������������������ٲ��롣
*/
	static int find(int arr[],int num){
		Arrays.sort(arr);
		int a = Arrays.binarySearch(arr, num);
		
		if(a < 0){
			a = 10;
		}
		return a;
	} 
	
	static int insert(int[] arr,int num){
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0){
				arr[i] = num;
				a = i;
				//System.out.println("a"+a);
				break;
			}
			else{
				a = 10;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int arr[] = new int[10];
		String answer;
		int b = 0;
		do{
			System.out.println("����������");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			while(a == 0){
				System.out.println("�������������룡��");	
				a = scan.nextInt();
				}
			if(find(arr, a) == 10){
				b = insert(arr,a);
				
				//System.out.println("b"+b);
				if(b==10){
					System.out.println("����������");
					break;}
			}else{
				System.out.println("�����Ѵ��ڣ��������������в���");
			}
			
			System.out.println("�������Ƿ����¼�����ݣ�y-�ǣ�����-��");
			answer = scan.next();
		}while("y".equalsIgnoreCase(answer) || b == 10);
		System.out.print("����Ϊ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
