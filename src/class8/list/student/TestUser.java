package class8.list.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import class8.list.employee.Employee;

/*2．创建类TestUser，在main()中，使用List存储5个用户，
 * 每个用户的信息通过控制台获取，输出每个用户的信息。*/
public class TestUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Users> list = new ArrayList<Users>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入学生姓名，密码，所在城市");
			Users users = new Users(scan.next(),scan.nextInt(),scan.next());
			list.add(users);
		}
		Iterator<Users> it= list.iterator();
		while (it.hasNext()) {
			Users users = (Users)it.next();
			System.out.println("姓名："+users.getUserName()+",年龄："+users.getUserPass()+"，城市："+users.getUserCity());
		}


	}

}
