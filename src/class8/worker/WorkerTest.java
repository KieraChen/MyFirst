package class8.worker;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*1) 创建一个List，在List 中增加三个工人，基本信息如下： 
 * 姓名 年龄 工资 zhang3 18 3000 ;li4 25 3500 ;wang5 22 3200 
2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300 3) 删除wang5 的信息 
4) 利用for 循环遍历，打印List 中所有工人的信息 
5) 利用迭代遍历，对List 中所有的工人调用work 方法。 
6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返true */

public class WorkerTest {

	public static void main(String[] args) {
		List<Worker> list  = new LinkedList<Worker>();
		Worker worker1 = new Worker("zhang3",18,3000);
		list.add(worker1);
		Worker worker2 = new Worker("li4",25,3500);
		list.add(worker2);
		Worker worker3 = new Worker("wang5",22,3200);
		list.add(worker3);
		
		Worker worker4 = new Worker("zhao6",24,3300);
		list.add(1, worker4);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("姓名"+list.get(i).getName()+"年龄"+list.get(i).getAge()+"工资"+list.get(i).getSalary());
		}
		System.out.println("===================");
		Iterator<Worker> it = list.iterator();
		while(it.hasNext()){
			Worker next = it.next();
			next.work();
		}
		
	

	}

}
