package class6.person;

import java.util.Scanner;

/*4．创建TestPerson类，包含main方法
a)	创建每个子类的对象，通过控制台输入给每个对象的所有属性赋值
b)	先输出每个对象的所有属性
c)	分别使用不同的子类对象调用其新增的方法，实现相应的功能*/
public class TestPerson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入小孩姓名");
		String name = scan.next();
		System.out.println("请输入小孩年龄");
		int age = scan.nextInt();
		System.out.println("请输入小孩性别");
		String sex = scan.next();
		System.out.println("请输入小孩幼儿园");
		String kindergarten = scan.next();
		
		Child child = new Child(name,age,sex,kindergarten);
		
		child.show();
		System.out.print("小孩幼儿园:"+child.kindergarten);
		
		System.out.println("请输入游戏名称");
		String gameName = scan.next();
		child.game(gameName);
		
		
		System.out.println("请输入学生姓名");
		String name1 = scan.next();
		System.out.println("请输入学生年龄");
		int age1 = scan.nextInt();
		System.out.println("请输入学生性别");
		String sex1 = scan.next();
		System.out.println("请输入学生班级");
		int stuClass = scan.nextInt();
		
		Student student = new Student(name1,age1,sex1,stuClass);
		
		student.show();
		System.out.println("学生班级:"+student.stuClass);
		
		System.out.println("请输入课程名称");
		String subject = scan.next();
		student.study(subject);

	}

}
