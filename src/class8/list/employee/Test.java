package class8.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/*2．创建一个Test类，包含main（）方法，在该方法中创建一个List对象，使用ArrayList类进行实例化；
 * 循环接受用户从键盘输入员工的名字、年龄、性别，根据用户输入的信息创建Employee对象，
 * 并添加到集合中，每次输入结束，提问用户是否继续，直到用户不再继续则停止循环
3．	以三种循环的方式(for、foreach、iterator)显示集合中所有员工的信息
4．	通过键盘输入一个员工的姓名，查找该员工是否存在*/
public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		String answer;
		do{
	        System.out.println("请输入一个员工的名字，年龄和性别：");
	        Employee emp = new Employee(scan.next(),scan.nextInt(),scan.next());
		    list.add(emp);
			
		    System.out.println("是否向集合继续添加学生？【y-继续，其它-结束】");
		    answer = scan.next();
		  }while("y".equalsIgnoreCase(answer));
		
		System.out.println("======================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("员工姓名："+list.get(i).empName+"，员工年龄："+list.get(i).empAge+"，员工性别："+list.get(i).empSex);
		}
		System.out.println("======================");
		for (Employee e : list) {
			System.out.println("员工姓名："+e.empName+"，员工年龄："+e.empAge+"，员工性别："+e.empSex);
		}
		System.out.println("======================");
		Iterator<Employee> it= list.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee)it.next();
			System.out.println("姓名："+emp.empName+",年龄："+emp.empAge+"，员工性别："+emp.empSex);
		}

		String name;
		System.out.println("请输入员工姓名");
		for (Employee e : list) {
			name = scan.next();
			if(name.equals(e.empName))
				System.out.println("存在");
			else
				System.out.println("不存在");
		}



	}

}
