package class5.book;
/*��������book��������¹��ܡ�
1��	������Book���������³�Ա��
a)	���ԣ�������ҳ�����۸�
b)	������
i.	Ĭ�Ϲ��췽�������������Ը���ʼֵΪ��δ֪����0ҳ��0Ԫ
ii.	show()����ʾ��������ֵ

*/
class Book {
	String bookName;
	int bookPage;
	int bookPrice;
	public void show(){
		System.out.println("����:"+bookName+" ҳ����"+bookPage+" �۸�"+bookPrice);
	}
	Book(){
		this.bookName = "δ֪";
		System.out.println("����:"+bookName+" ҳ����"+bookPage+" �۸�"+bookPrice);
	}
 
}
