package class3;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		/*6��	����һ��3��4�еĶ�ά���飬�洢һ���༶3��ѧ����4���ɼ�������ͼ��ʾ����
		 * ͨ�����̸�ѧ��¼��ɼ���ͳ��ÿ��ѧ����ƽ���֣�ͳ��ÿ���γ̵�ƽ����
		HTML	Java	MySQL	JavaScript
	Mary	78	77	76	84
	Tom	    67	80	69	66
	Bruce	81	68	91	72
	��ʾ��
	1��	������ά����ķ�ʽ �������� ������[][] = new ��������[����][����];
	2��	���ö�ά����ĳ��Ԫ��  ������[�б�][�б�]*/
		Scanner scan = new Scanner(System.in);

		double arr[][] = new double[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("�������"+(i+1)+"λѧ���ĵ�"+(j+1)+"�ſγ̳ɼ�");
				arr[i][j] = scan.nextDouble();
			}
		}
		
		double sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum1 = sum1 + arr[i][j];
			}
			System.out.println("��"+(i+1)+"λѧ����ƽ����Ϊ��"+(sum1/4));
			
		}
		
		
		double sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <3; j++) {
				sum2 = sum2 + arr[j][i];
			}
			System.out.println("��"+(i+1)+"�ſγ̵�ƽ����Ϊ��"+(sum2/3));
		}


	}

}
