package class4;

public class Draw {
/*	������Draw������һ���Զ��巽��calculateArea()��������3�����Ͳ�����
	�������������ε������ߣ����������ε�����������ء�*/

	public static double calculateArea(int a, int b, int c) {
		double d = (a+b+c)/2;
		double s = Math.sqrt(d*(d-a)*(d-b)*(d-c));
		return s;
	}

}
