package class8.list.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import class8.list.employee.Employee;

/*2��������TestUser����main()�У�ʹ��List�洢5���û���
 * ÿ���û�����Ϣͨ������̨��ȡ�����ÿ���û�����Ϣ��*/
public class TestUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Users> list = new ArrayList<Users>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("������ѧ�����������룬���ڳ���");
			Users users = new Users(scan.next(),scan.nextInt(),scan.next());
			list.add(users);
		}
		Iterator<Users> it= list.iterator();
		while (it.hasNext()) {
			Users users = (Users)it.next();
			System.out.println("������"+users.getUserName()+",���䣺"+users.getUserPass()+"�����У�"+users.getUserCity());
		}


	}

}
