package class8;
/*1) ��//1 ���Ĵ��벹��������Ҫ�����list ������Ԫ�ص����� 
2) д������ִ�еĽ��
3) ���Ҫ��ʵ������ArrayList ��ΪLinkedList��Ӧ�ø����
ArrayList �� LinkedList ʹ������ʲô����ʵ������ʲô���� */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("Hello");
		list.add("World");
		list.add(1, "Learn");
		list.add(1, "Java");
		printList(list);

	}
	
	public static void printList(List list) { 
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println(element);
		}

 	}


}
