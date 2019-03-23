package class8.teach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*7.已知某学校的教学课程内容安排如下： 
完成下列要求： 
1） 使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述 课程安排。 （课程自拟）
2） 增加了一位新老师Allen 教JDBC
 3） Lucy 改为教CoreJava put方法 
4） 遍历Map，输出所有的老师及老师教授的课程(Set<MAP.ENTRY>、Set get(key)) 
5） *利用Map，输出所有教JSP 的老师*/

public class Teach {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Dasiy", "Chinese");
		map.put("Peter", "Math");
		map.put("Lucy", "English");
		map.put("Jessica", "JSP");
		map.put("Avril", "JSP");
		map.put("Allen", "JDBC");
		map.put("Lucy", "CoreJava");
		

		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> next = it.next();
			System.out.println("teacher:"+next.getKey()+" course:"+next.getValue());
		}
		System.out.println("====================");
		
		/*Iterator<Entry<String, String>> it1 = map.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> next = it.next();
			String name = next.getKey();
			String course = next.getValue();
			if("JSP".equals(course))
				System.out.println("teacher:"+name);
		}*/
		
		for (String s : map.keySet()) {
			if("JSP".equals(map.get(s)))
				System.out.println(s);
		}
	

	}

}
