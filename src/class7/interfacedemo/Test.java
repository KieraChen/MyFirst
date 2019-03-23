package class7.interfacedemo;
/*5．	创建一个测试类Test，添加main（）方法
a)	创建两个Bus对象，分别调用默认构造方法和带参数的构造方法进行实例化，显示出这两辆汽车的属性及功能
b)	创建两个电动自行车对象，分别调用默认构造方法和带参构造方法，显示出这两辆车的属性，并调用骑车的方法*/

public class Test {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.show();
		bus1.function();
		
		Bus bus2 = new Bus("黄色",6,"06:00","22:00",65);
		bus2.show();
		bus2.function();
		
		Autocycle autocycle1 = new Autocycle();
		autocycle1.show();
		autocycle1.ride();
		
		Autocycle autocycle2 = new Autocycle("黑色",2,15,5);
		autocycle2.show();
		autocycle2.ride();

	}

}
