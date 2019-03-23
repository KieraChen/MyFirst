package class8.list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/*2������һ��Test�࣬����main�����������ڸ÷����д���һ��List����ʹ��ArrayList�����ʵ������
 * ѭ�������û��Ӽ�������Ա�������֡����䡢�Ա𣬸����û��������Ϣ����Employee����
 * ����ӵ������У�ÿ����������������û��Ƿ������ֱ���û����ټ�����ֹͣѭ��
3��	������ѭ���ķ�ʽ(for��foreach��iterator)��ʾ����������Ա������Ϣ
4��	ͨ����������һ��Ա�������������Ҹ�Ա���Ƿ����*/
public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		String answer;
		do{
	        System.out.println("������һ��Ա�������֣�������Ա�");
	        Employee emp = new Employee(scan.next(),scan.nextInt(),scan.next());
		    list.add(emp);
			
		    System.out.println("�Ƿ��򼯺ϼ������ѧ������y-����������-������");
		    answer = scan.next();
		  }while("y".equalsIgnoreCase(answer));
		
		System.out.println("======================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Ա��������"+list.get(i).empName+"��Ա�����䣺"+list.get(i).empAge+"��Ա���Ա�"+list.get(i).empSex);
		}
		System.out.println("======================");
		for (Employee e : list) {
			System.out.println("Ա��������"+e.empName+"��Ա�����䣺"+e.empAge+"��Ա���Ա�"+e.empSex);
		}
		System.out.println("======================");
		Iterator<Employee> it= list.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee)it.next();
			System.out.println("������"+emp.empName+",���䣺"+emp.empAge+"��Ա���Ա�"+emp.empSex);
		}

		String name;
		System.out.println("������Ա������");
		for (Employee e : list) {
			name = scan.next();
			if(name.equals(e.empName))
				System.out.println("����");
			else
				System.out.println("������");
		}



	}

}
