package class5.book;

import java.util.Scanner;

/*2��	������TestBook������main()����������Book����󣬵���Ĭ�Ϲ��췽��Ϊ�������ʵ������
��ʾ�����������Ϣ����ͨ��������������Ϊ������������Ը�ֵ������ʾ�����������Ϣ��*/
public class TestBook {

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();		

		Scanner scan = new Scanner(System.in);
		System.out.println("������������");
		book.bookName = scan.next();
		System.out.println("��������ҳ��");
		book.bookPage = scan.nextInt();
		System.out.println("������۸�");
		book.bookPrice = scan.nextInt();
		
		System.out.println("������������");
		book1.bookName = scan.next();
		System.out.println("��������ҳ��");
		book1.bookPage = scan.nextInt();
		System.out.println("������۸�");
		book1.bookPrice = scan.nextInt();
		
		book.show();
		book1.show();

	}

}
