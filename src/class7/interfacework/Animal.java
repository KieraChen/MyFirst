package class7.interfacework;

public interface Animal {
/*	1、	创建接口Animal，包含：
	a)	常量：city，赋值为“大连”（代表动物生存在大连）
	b)	方法：
	i.	eat(String food);
	ii.	sound();*/
	String city = "大连";
	void eat(String food);
	void sound();
}

/*2、	创建类Cat，实现Animal接口
a)	属性：猫的名字、猫的颜色
b)	方法：
i.	eat(String food):描述猫吃什么食物，食物通过参数接受
ii.	sound():描述猫是如何叫的*/
class Cat implements Animal{
	String name;
	String color;

	@Override
	public void eat(String food) {
		System.out.println("猫吃"+food);	
	}

	@Override
	public void sound() {
		System.out.println("喵喵叫。。。");
	}
}

/*3、	创建类Fish，实现Animal接口
a)	属性：鱼的种类、鱼的颜色
b)	方法：
i.	eat(String food):描述鱼吃什么食物，食物通过参数接受
ii.	sound():描述鱼是如何叫的
iii.	swim(int speed):描述鱼游的速度，根据参数的值，输出鱼游的速度为每小时多少公里*/
class Fish implements Animal{
	String type;
	String color;

	@Override
	public void eat(String food) {
		System.out.println("鱼吃"+food);
	}

	@Override
	public void sound() {
		System.out.println("鱼不会叫");
	}
	public void swim(int speed){
		System.out.println("鱼游的速度为每小时"+speed+"公里");
	}
}

/*4、	创建类Bird，实现Animal接口
a)	属性：鸟的体长
b)	方法：
i.	eat(String food):描述鸟吃什么食物，食物通过参数接受
ii.	sound():描述鸟是如何叫的
iii.	fly():描述鸟是如何飞的*/
class Bird implements Animal{
	int length;

	@Override
	public void eat(String food) {
		System.out.println("鸟吃"+food);	
	}

	@Override
	public void sound() {
		System.out.println("喳喳叫。。。");
	}
	
	public void fly(){
		System.out.println("鸟在天上飞。。。");
	}
}













