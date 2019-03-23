package class8.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*1.	使用Map实现电话簿的功能
a)	创建一个Map对象，使用HashMap类进行实例化，以键-值对为“名字-电话”的形式向该map中添加通讯录信息，
采取循环的方式添加，循环一次，用户从键盘输入一对名字和电话，然后添加到map中，
提示用户是否继续，输入Y则继续输入并添加，否则退出循环。
b)	将通讯录中的信息按照名字升序显示出来(三种方式)
c)	接受用户从键盘输入一个名字，查找在该通讯录中是否存在这个人，如果存在则显示出这个人的电话，
如果不存在， 则显示此人不存在*/

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		String answer;
		
		do{
		    System.out.println("请输入姓名和电话：");
		    map.put(scan.next(), scan.next());
				
			System.out.println("是否向集合继续添加学生？【y-继续，其它-结束】");
			answer = scan.next();
		}while("y".equalsIgnoreCase(answer));
		
		for (String k : map.keySet()) {
			System.out.println("名字："+k+"，电话："+map.get(k));
		}
		System.out.println("==================");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object next = it.next();
			System.out.println("名字："+next+"，电话："+map.get(next));
		}
		System.out.println("==================");
		
		Iterator<Entry<String, String>> it1 = map.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> next = it1.next();
			System.out.println("名字："+next.getKey()+"，电话："+next.getValue());
		}
		
		String name;
		System.out.println("请输入姓名");
		for (String k : map.keySet()) {
			name = scan.next();
			if(name.equals(k))
				System.out.println("电话："+map.get(k));
			else
				System.out.println("不存在");
		}

	}

}
