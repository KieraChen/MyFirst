package class8.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*1.	ʹ��Mapʵ�ֵ绰���Ĺ���
a)	����һ��Map����ʹ��HashMap�����ʵ�������Լ�-ֵ��Ϊ������-�绰������ʽ���map�����ͨѶ¼��Ϣ��
��ȡѭ���ķ�ʽ��ӣ�ѭ��һ�Σ��û��Ӽ�������һ�����ֺ͵绰��Ȼ����ӵ�map�У�
��ʾ�û��Ƿ����������Y��������벢��ӣ������˳�ѭ����
b)	��ͨѶ¼�е���Ϣ��������������ʾ����(���ַ�ʽ)
c)	�����û��Ӽ�������һ�����֣������ڸ�ͨѶ¼���Ƿ��������ˣ������������ʾ������˵ĵ绰��
��������ڣ� ����ʾ���˲�����*/

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		Scanner scan = new Scanner(System.in);
		String answer;
		
		do{
		    System.out.println("�����������͵绰��");
		    map.put(scan.next(), scan.next());
				
			System.out.println("�Ƿ��򼯺ϼ������ѧ������y-����������-������");
			answer = scan.next();
		}while("y".equalsIgnoreCase(answer));
		
		for (String k : map.keySet()) {
			System.out.println("���֣�"+k+"���绰��"+map.get(k));
		}
		System.out.println("==================");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object next = it.next();
			System.out.println("���֣�"+next+"���绰��"+map.get(next));
		}
		System.out.println("==================");
		
		Iterator<Entry<String, String>> it1 = map.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> next = it1.next();
			System.out.println("���֣�"+next.getKey()+"���绰��"+next.getValue());
		}
		
		String name;
		System.out.println("����������");
		for (String k : map.keySet()) {
			name = scan.next();
			if(name.equals(k))
				System.out.println("�绰��"+map.get(k));
			else
				System.out.println("������");
		}

	}

}
