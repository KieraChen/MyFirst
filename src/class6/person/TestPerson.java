package class6.person;

import java.util.Scanner;

/*4������TestPerson�࣬����main����
a)	����ÿ������Ķ���ͨ������̨�����ÿ��������������Ը�ֵ
b)	�����ÿ���������������
c)	�ֱ�ʹ�ò�ͬ�������������������ķ�����ʵ����Ӧ�Ĺ���*/
public class TestPerson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������С������");
		String name = scan.next();
		System.out.println("������С������");
		int age = scan.nextInt();
		System.out.println("������С���Ա�");
		String sex = scan.next();
		System.out.println("������С���׶�԰");
		String kindergarten = scan.next();
		
		Child child = new Child(name,age,sex,kindergarten);
		
		child.show();
		System.out.print("С���׶�԰:"+child.kindergarten);
		
		System.out.println("��������Ϸ����");
		String gameName = scan.next();
		child.game(gameName);
		
		
		System.out.println("������ѧ������");
		String name1 = scan.next();
		System.out.println("������ѧ������");
		int age1 = scan.nextInt();
		System.out.println("������ѧ���Ա�");
		String sex1 = scan.next();
		System.out.println("������ѧ���༶");
		int stuClass = scan.nextInt();
		
		Student student = new Student(name1,age1,sex1,stuClass);
		
		student.show();
		System.out.println("ѧ���༶:"+student.stuClass);
		
		System.out.println("������γ�����");
		String subject = scan.next();
		student.study(subject);

	}

}
