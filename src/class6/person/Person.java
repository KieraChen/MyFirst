package class6.person;

/*1��	����һ��Person�࣬�������³�Ա��
a)	���ԣ�name��age��sex
b)	������
i.	���췽������3�����Ը���ʼֵ
ii.	��3�������Ĺ��췽����ͨ�����������Ը�ֵ
iii.	show()����ʾ�����е�����ֵ*/
public class Person {
	String name;
	int age;
	String sex;
	Person(){
		this.name = " ";
		this.age = 18;
		this.sex = "��";	
	}
	Person(String name,int age,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void show(){
		System.out.println("�����ǣ�"+this.name+" �����ǣ�"+this.age+" �Ա��ǣ�"+this.sex);
	}
}

/*2��	����Child�࣬�̳�Person�࣬��Ա���£�
a)	���ԣ�kindergarten���׶�԰��
b)	������
i.	��4�������Ĺ��췽����ͨ�����������Ը�ֵ
ii.	void game��String gameName�������С������������ʲô��Ϸ����Ϸ����ͨ��������ȡ*/
class Child extends Person{
	String kindergarten;
	Child(String name,int age,String sex,String kindergarten){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.kindergarten = kindergarten;
	}
	void game(String gameName){
		System.out.println("С����������"+gameName+"��Ϸ");
	}
}

/*3��	����Student�࣬�̳�Person�࣬��Ա���£�
a)	���ԣ�stuClass���༶��
b)	������
i.	��4�������Ĺ��췽����ͨ�����������Ը�ֵ
ii.	void study��String subject�������ѧ��������ѧϰʲô�γ̣��γ�����ͨ��������ȡ*/
class Student extends Person{
	int stuClass;
	Student(String name,int age,String sex,int stuClass){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.stuClass = stuClass;
	}
	void study(String subject){
		System.out.println("ѧ��������ѧϰ"+subject+"�γ�");
	}
}

