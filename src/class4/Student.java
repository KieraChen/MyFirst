package class4;

import java.util.Scanner;

public class Student {
	/*		������Student������ж�ѧ���ɼ�����Ч�Լ��ɼ�ת���Ĺ��ܣ��������·�����
	a)	�Զ��巽��boolean validate(int score)�������жϳɼ��Ƿ���Ч��
	����score�����жϵĳɼ������ɼ���1-100��֮�䣬����Ϊ�ɼ���Ч������true��
	������Ϊ�ɼ���Ч������false
	b)	�Զ��巽�� void convert(int score)�����ڽ��ٷ�֮�ĳɼ�ת��Ϊ�ȼ��ƣ�
	����score����ת���ĳɼ�����������ԭ���жϳɼ��ķ����������Ӧ�ĵȼ�
	    i.	90~100�֣�A�ȼ�
	    ii.	80~89�֣�B�ȼ�
	    iii.70~79�֣�C�ȼ�
	    iv.	60~69�֣�D�ȼ�
	    v.	60�����£�X�ȼ�
	c)	main()������һ��ѧ���ĳɼ�������validate()�������жϸóɼ��Ƿ���Ч��
	�����Ч��������ɼ���Ч����ʾ�������Ч�����������convert()������ʵ�ֳɼ��ɰٷ�֮���ȼ���ת����
*/
	static boolean validate(int score){
		boolean a = false;
		if(score > 0 && score <= 100){
			a = !a;
		}
		return a;
	}
	
	static void convert(int score){
		if(score >= 90 ){
			System.out.println("A�ȼ�");
		}
		else if(score >= 80 && score < 90){
			System.out.println("B�ȼ�");
		}
		else if(score >= 70 && score < 80){
			System.out.println("C�ȼ�");
		}
		else if(score >= 60 && score < 70){
			System.out.println("D�ȼ�");
		}
		else{
			System.out.println("X�ȼ�");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ�");
		int score = scan.nextInt();
		boolean result = validate(score);
		if(true == result){
			convert(score);
		}
		else{
			System.out.println("�ɼ���Ч!");
		}

		

	}

}
