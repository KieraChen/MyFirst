package class7.interfacework;


/*5、	创建类TestAnimal，包含主方法
a)	创建猫、鱼、鸟类各一个对象，分别给它们的属性赋值，输出的效果参照“我是大连的一只猫，我叫安哥拉猫，白色的”
b)	使用每个对象分别调用各自拥有的方法*/
public class TestAnimal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.color = "白色";
		cat.name = "安哥拉猫";
		System.out.println("我是"+cat.city+"的一只猫，我叫"+cat.name+"，"+cat.color+"的");
		cat.eat("猫食");
		cat.sound();
		
		
		Fish fish = new Fish();
		fish.color = "金色";
		fish.type = "热带鱼";
		System.out.println("我是"+fish.city+"的一条鱼，我叫"+fish.type+"，"+cat.color+"的");
		fish.eat("鱼食");
		fish.sound();
		fish.swim(10);
		
		
		Bird bird = new Bird();
		bird.length = 10;
		System.out.println("我是"+fish.city+"的一只鸟，我体长"+bird.length);
		bird.eat("鸟食");
		bird.sound();
		bird.fly();
		

	}

}
