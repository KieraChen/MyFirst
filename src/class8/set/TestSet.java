package class8.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*����TestSet�࣬����main()��ʵ�ֹ������£�
a)	����List���϶���ʹ��ArrayList�����ʵ�������ü���ֻ�ܴ洢�ַ���
b)	ͨ��ѭ����ȡ����̨����10��ˮ����Ӣ�ĵ��ʣ�Ҫ�����ظ��ĵ���
c)	ͨ��Set���ϵĹ��ܣ����10��ˮ��Ӣ�ĵ����в��ظ��ĵ��ʣ�
d)	�����ظ���ˮ�����ʰ��մ�С������ʾ����*/

public class TestSet {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("������ˮ����Ӣ�ĵ��ʣ�");
			list.add(scan.next());
		}
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		for (String s : set) {
			System.out.println(s);
		}

	}

}
