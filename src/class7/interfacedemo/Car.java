package class7.interfacedemo;

/*1．	创建一个定义汽车的抽象类Car，包括成员如下：
a)	属性：颜色（color），轮胎个数（tyres）
b)	方法：
i.	默认构造方法：颜色为黑色，轮胎有0个
ii.	带参数的构造方法，给属性赋值为参数值
iii.	显示属性show（），返回值为空，抽象方法
*/
public abstract class Car {
	String color;
	int tyres;
	Car(){
		this.color = "黑色";
		this.tyres = 0;
	}
	Car(String color,int tyres){
		this.color = color;
		this.tyres = tyres;
	}
	public abstract void show();
}

/*2．	创建一个类Bus，继承抽象类Car，并不允许该类再被继承，添加成员如下：
a)	属性：每天的始发时间（startTime），每天的末班时间（endTime），载客量（passenger）
b)	方法：
i.	默认构造方法：给始发时间和末班时间赋值为“00:00”，载客量为0
ii.	带参数构造方法，给属性赋值为参数值
iii.	重写父类中的抽象方法，显示该类所具备的所有属性值
iv.	function()方法：根据汽车的核载量描述该汽车的功能，
           当核载量大于50人时，输出“这是一辆大汽车，可以用作公交车”，
           否则，输出“这是一辆小汽车，可以用作班车”*/
final class Bus extends Car{
	String startTime;
	String endTime;
	int passenger;
	Bus(){
		this.startTime = "00:00";
		this.endTime = "00:00";
		this.passenger = 0;
	}
	Bus(String color,int tyres,String startTime,String endTime,int passenger){
		this.color = color;
		this.tyres = tyres;
		this.startTime = startTime;
		this.endTime = endTime;
		this.passenger = passenger;
	}
	@Override
	public void show() {
		System.out.println("颜色"+this.color+" 轮胎数"+this.tyres+" 始发时间"+this.startTime+" 末班时间"+this.endTime+" 载客量"+this.passenger);
	}
	public void function(){
		if(this.passenger <= 50)
			System.out.println("这是一辆小汽车，可以用作班车");
		else
			System.out.println("这是一辆大汽车，可以用作公交车");
	}
}

/*3．	创建一个自行车类Bicycle，继承抽象类Car，添加成员如下：
a)	属性：型号（type）
b)	方法：
i.	默认构造方法：给型号赋值为24
ii.	带参数构造方法：给属性赋值为参数值
iii.	重写父类的抽象方法，显示该类所具备的所有属性值
iv.	ride():根据车的型号，描述该自行车适用的人群，当型号在16以下，输出“这个自行车适合儿童适用”，
                               否则输出“这个自行车适合成年人适用”。*/
class Bicycle extends Car{
	int type;
	Bicycle(){
		this.type = 24;
	}
	Bicycle(String color,int tyres,int type){
		this.color = color;
		this.tyres = tyres;
		this.type = type;
	}

	@Override
	public void show() {
		System.out.println("颜色"+this.color+" 轮胎数"+this.tyres+" 型号"+this.type);	
	}
	public void ride(){
		if(this.type <= 16)
			System.out.println("这个自行车适合儿童适用");
		else
			System.out.println("这个自行车适合成年人适用");
	}
}

/*4．	创建一个电动自行车的类Autocycle，继承自行车类Bicycle，添加成员如下：
a)	属性：百公里耗油（gas）
b)	方法：
i.	默认构造方法：给gas赋值为0
ii.	带参数的构造方法：给属性赋值为参数值
iii.	重写父类的show（）方法，保留原有父类中该方法的功能，再添加一条显示本类独有属性的输出语句*/
class Autocycle extends Bicycle{
	int gas;
	Autocycle(){
		this.gas = 0;
	}
	Autocycle(String color,int tyres,int type,int gas){
		this.color = color;
		this.tyres = tyres;
		this.type = type;
		this.gas = gas;
	}
	public void show() {
		super.show();
		System.out.println("百公里耗油"+this.gas);	
	}
}













