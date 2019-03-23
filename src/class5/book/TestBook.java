package class5.book;

import java.util.Scanner;

/*2、	创建类TestBook：包含main()，创建两个Book类对象，调用默认构造方法为对象进行实例化，
显示出两本书的信息。再通过键盘输入重新为这两本书的属性赋值，再显示出两本书的信息。*/
public class TestBook {

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();		

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入书名：");
		book.bookName = scan.next();
		System.out.println("请输入书页：");
		book.bookPage = scan.nextInt();
		System.out.println("请输入价格：");
		book.bookPrice = scan.nextInt();
		
		System.out.println("请输入书名：");
		book1.bookName = scan.next();
		System.out.println("请输入书页：");
		book1.bookPage = scan.nextInt();
		System.out.println("请输入价格：");
		book1.bookPrice = scan.nextInt();
		
		book.show();
		book1.show();

	}

}
