package class10;

import java.util.Scanner;

/*2. �Զ���һ�����������ࡱ�������г�Ա x,y,z,��Ϊ���߳���
 * ���ع��췽���ֱ��x,y,z ������Ա������ֵ��
 * �ڴ�����Ӧ����һ���������������������getArea������ʾ��������Ϣ(�����߳�)��showInfo����
 * ����2�������е������߲��ܹ���һ��������ʱҪ�׳��Զ����쳣NotSanjiaoException��������ʾ��ȷ��Ϣ��
 * �ڲ������е��������й���һ�������ζ���(����Ϊ�������������������)�� ��ʾ��������Ϣ��������������쳣��*/
public class TestTriangle {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("����������������");
		Triangle triangle = new Triangle(scan.nextInt(),scan.nextInt(),scan.nextInt());
		try {
			triangle.showInfo();
		} catch (NotSanjiaoException e) {
			System.out.println(e.getMessage());
		}
		try {
			triangle.getArea();
		} catch (NotSanjiaoException e) {
			System.out.println(e.getMessage());
		}

	}
	

}
class NotSanjiaoException extends Exception{
	public NotSanjiaoException(String message){
		super(message);
	}
}
class Triangle{
	int x;
	int y;
	int z;
	Triangle(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void getArea() throws NotSanjiaoException{
		//d = (a+b+c)/2; ��� = Math.sqrt(d*(d-a)*(d-b)*(d-c))
		if(x+y>z && y+z>x && x+z>y){
			double d = (x+y+z)/2;
			System.out.println("���������:"+Math.sqrt(d*(d-x)*(d-y)*(d-z)));
		}
		else{
			throw new NotSanjiaoException("���ܹ��������Σ���");
		}
		
		
	}
	public void showInfo() throws NotSanjiaoException{
		if(x+y>z && y+z>x && x+z>y){
			System.out.println("�����α߳�1��"+this.x+" �����α߳�2:"+this.y+" �����α߳�3:"+this.z);
		}
		else{
			throw new NotSanjiaoException("���ܹ��������Σ�");
		}
		
	}
}
