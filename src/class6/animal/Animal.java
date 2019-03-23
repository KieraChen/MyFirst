package class6.animal;

/*1．	创建一个动物类Animal，包括的成员如下：
a)	属性：动物的名字（name），动物是否会叫（sound），颜色（color）
b)	方法：
i.	默认构造方法，给属性分别赋值为“怪物”、true、“黑色”；
ii.	带三个参数的构造方法，给属性赋值为参数的值
iii.	吃食的方法：eatFood（）：输出“我是一个动物，我什么都吃”
	显示所有属性的方法：showAnimal（），声明为final类型，输出的效果为“这是一只**色的**，
           它会叫”或者“这是一只**色的**，它不会叫”*/
public class Animal {
	String name;
	boolean sound;
	String color;
	Animal(){
		this.name = "怪物";
		this.sound = true;
		this.color = "黑色";
	}
	Animal(String name,boolean sound,String color){
		this.name = name;
		this.sound = sound;
		this.color = color;
	}
	public void eatFood(){
		System.out.println("我是一个动物，我什么都吃");
	}
	final void showAnimal(){
		if(this.sound = true){
			System.out.println("这是一只"+this.color+"色的"+this.name+"，它会叫");
		}
		else{
			System.out.println("这是一只"+this.color+"色的"+this.name+"，它不会叫");
		}
	}
}

/*2．	创建一个猫类Cat，继承Animal类：
方法：
i.	默认构造方法，给属性分别赋值为“波斯猫”、true、“白色”；
ii.	带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法，
           从而实现给属性赋值
iii.	重写eatFood()，输出猫类应该吃的食物*/
class Cat extends Animal{
	Cat(){
		this.name = "波斯猫";
		this.sound = true;
		this.color = "白色";
	}
	Cat(String name,boolean sound,String color){
		super(name,sound,color);
	}
	public void eatFood(){
		System.out.println("我是一个猫，我吃猫食");
	}
}

/*3．	创建一个鱼类Fish，继承Animal类：
方法：
i.	默认构造方法，给属性分别赋值为“金鱼”、false、“红色”；
ii.	带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法
iii.	重写eatFood()，输出鱼类应该吃的食物*/
class Fish extends Animal{
	Fish(){
		this.name = "金鱼";
		this.sound = false;
		this.color = "红色";
	}
	Fish(String name,boolean sound,String color){
		super(name,sound,color);
	}
	public void eatFood(){
		System.out.println("我是一个鱼，我吃鱼食");
	}
}

/*4．	创建一个鸟类Bird，继承Animal类：
方法：
i.	默认构造方法，给属性分别赋值为“麻雀”、true、“褐色”；
ii.	带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法，从而实现给属性赋值
iii.	重写eatFood()，输出鸟类应该吃的食物*/
class Bird extends Animal{
	Bird(){
		this.name = "麻雀";
		this.sound = true;
		this.color = "褐色";
	}
	Bird(String name,boolean sound,String color){
		super(name,sound,color);
	}
	public void eatFood(){
		System.out.println("我是一个鸟，我吃鸟食");
	}
	
}
