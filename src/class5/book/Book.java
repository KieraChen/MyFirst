package class5.book;
/*【创建包book，完成如下功能】
1、	创建类Book，包含如下成员：
a)	属性：书名、页数、价格
b)	方法：
i.	默认构造方法：给三个属性赋初始值为“未知”、0页、0元
ii.	show()：显示三个属性值

*/
class Book {
	String bookName;
	int bookPage;
	int bookPrice;
	public void show(){
		System.out.println("书名:"+bookName+" 页数："+bookPage+" 价格："+bookPrice);
	}
	Book(){
		this.bookName = "未知";
		System.out.println("书名:"+bookName+" 页数："+bookPage+" 价格："+bookPrice);
	}
 
}
