package class5.employee;

import java.util.Scanner;

/*2��	������TestEmployee���ڸ����д���3��Employee����
ͨ�����������3��Ա�������֡����䡢ְλ���и�ֵ�������ÿ��Ա���Ĺ��ʣ���ʾ������Ա������Ϣ*/
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һλԱ��������");
		String name1 = scan.next();
		employee1.setName(name1);
		System.out.println("�������һλԱ�����䣺");
		int age1 = scan.nextInt();
		employee1.setAge(age1);
		System.out.println("�������һλԱ��ְλ��");
		String position1 = scan.next();
		employee1.setPosition(position1);
		employee1.setSalary(age1);
		
		System.out.println("������ڶ�λԱ��������");
		String name2 = scan.next();
		employee2.setName(name2);
		System.out.println("������ڶ�λԱ�����䣺");
		int age2 = scan.nextInt();
		employee2.setAge(age2);
		System.out.println("������ڶ�λԱ��ְλ��");
		String position2 = scan.next();
		employee2.setPosition(position2);
		employee2.setSalary(age2);
		

		System.out.println("���������λԱ��������");
		String name3 = scan.next();
		employee3.setName(name3);
		System.out.println("���������λԱ�����䣺");
		int age3 = scan.nextInt();
		employee3.setAge(age3);
		System.out.println("���������λԱ��ְλ��");
		String position3 = scan.next();
		employee3.setPosition(position3);
		employee3.setSalary(age3);
		
		employee1.show();
		employee2.show();
		employee3.show();

	}

}
