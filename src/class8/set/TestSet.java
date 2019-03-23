package class8.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*创建TestSet类，包含main()，实现功能如下：
a)	创建List集合对象，使用ArrayList类进行实例化，该集合只能存储字符串
b)	通过循环获取控制台输入10个水果的英文单词，要求有重复的单词
c)	通过Set集合的功能，输出10个水果英文单词中不重复的单词；
d)	将不重复的水果单词按照大小升序显示出来*/

public class TestSet {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("请输入水果的英文单词：");
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
