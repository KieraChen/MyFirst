package class5.employee;

import java.util.Scanner;

/*2．	测试类TestEmployee，在该类中创建3个Employee对象，
通过键盘输入给3个员工的名字、年龄、职位进行赋值，计算出每个员工的工资，显示出所有员工的信息*/
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一位员工姓名：");
		String name1 = scan.next();
		employee1.setName(name1);
		System.out.println("请输入第一位员工年龄：");
		int age1 = scan.nextInt();
		employee1.setAge(age1);
		System.out.println("请输入第一位员工职位：");
		String position1 = scan.next();
		employee1.setPosition(position1);
		employee1.setSalary(age1);
		
		System.out.println("请输入第二位员工姓名：");
		String name2 = scan.next();
		employee2.setName(name2);
		System.out.println("请输入第二位员工年龄：");
		int age2 = scan.nextInt();
		employee2.setAge(age2);
		System.out.println("请输入第二位员工职位：");
		String position2 = scan.next();
		employee2.setPosition(position2);
		employee2.setSalary(age2);
		

		System.out.println("请输入第三位员工姓名：");
		String name3 = scan.next();
		employee3.setName(name3);
		System.out.println("请输入第三位员工年龄：");
		int age3 = scan.nextInt();
		employee3.setAge(age3);
		System.out.println("请输入第三位员工职位：");
		String position3 = scan.next();
		employee3.setPosition(position3);
		employee3.setSalary(age3);
		
		employee1.show();
		employee2.show();
		employee3.show();

	}

}
