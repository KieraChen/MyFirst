package class8;
/*1) 把//1 处的代码补充完整，要求输出list 中所有元素的内容 
2) 写出程序执行的结果
3) 如果要把实现类由ArrayList 换为LinkedList，应该改哪里？
ArrayList 和 LinkedList 使用上有什么区别？实现上有什么区别？ */
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
