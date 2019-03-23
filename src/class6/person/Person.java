package class6.person;

/*1．	创建一个Person类，包含如下成员：
a)	属性：name，age，sex
b)	方法：
i.	构造方法，给3个属性赋初始值
ii.	带3个参数的构造方法，通过参数给属性赋值
iii.	show()：显示出所有的属性值*/
public class Person {
	String name;
	int age;
	String sex;
	Person(){
		this.name = " ";
		this.age = 18;
		this.sex = "男";	
	}
	Person(String name,int age,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void show(){
		System.out.println("姓名是："+this.name+" 年龄是："+this.age+" 性别是："+this.sex);
	}
}

/*2．	创建Child类，继承Person类，成员如下：
a)	属性：kindergarten（幼儿园）
b)	方法：
i.	带4个参数的构造方法，通过参数给属性赋值
ii.	void game（String gameName）：输出小朋友们正在玩什么游戏，游戏名字通过参数获取*/
class Child extends Person{
	String kindergarten;
	Child(String name,int age,String sex,String kindergarten){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.kindergarten = kindergarten;
	}
	void game(String gameName){
		System.out.println("小朋友正在玩"+gameName+"游戏");
	}
}

/*3．	创建Student类，继承Person类，成员如下：
a)	属性：stuClass（班级）
b)	方法：
i.	带4个参数的构造方法，通过参数给属性赋值
ii.	void study（String subject）：输出学生们正在学习什么课程，课程名字通过参数获取*/
class Student extends Person{
	int stuClass;
	Student(String name,int age,String sex,int stuClass){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.stuClass = stuClass;
	}
	void study(String subject){
		System.out.println("学生们正在学习"+subject+"课程");
	}
}

