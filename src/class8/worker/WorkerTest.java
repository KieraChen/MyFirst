package class8.worker;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*1) ����һ��List����List �������������ˣ�������Ϣ���£� 
 * ���� ���� ���� zhang3 18 3000 ;li4 25 3500 ;wang5 22 3200 
2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300 3) ɾ��wang5 ����Ϣ 
4) ����for ѭ����������ӡList �����й��˵���Ϣ 
5) ���õ�����������List �����еĹ��˵���work ������ 
6) ΪWorker ����дequals �����������������䡢����ȫ�����ʱ��ŷ�true */

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
			System.out.println("����"+list.get(i).getName()+"����"+list.get(i).getAge()+"����"+list.get(i).getSalary());
		}
		System.out.println("===================");
		Iterator<Worker> it = list.iterator();
		while(it.hasNext()){
			Worker next = it.next();
			next.work();
		}
		
	

	}

}
