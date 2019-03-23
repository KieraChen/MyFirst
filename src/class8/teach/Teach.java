package class8.teach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*7.��֪ĳѧУ�Ľ�ѧ�γ����ݰ������£� 
�������Ҫ�� 
1�� ʹ��һ��Map������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ����ʾ���� �γ̰��š� ���γ����⣩
2�� ������һλ����ʦAllen ��JDBC
 3�� Lucy ��Ϊ��CoreJava put���� 
4�� ����Map��������е���ʦ����ʦ���ڵĿγ�(Set<MAP.ENTRY>��Set get(key)) 
5�� *����Map��������н�JSP ����ʦ*/

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
