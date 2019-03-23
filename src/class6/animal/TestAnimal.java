package class6.animal;

import java.util.Scanner;

/*5．	创建一个测试类TestAnimal，该类中只包含main（）方法：在该方法中实现如下功能：
1）	创建一个猫类对象，通过键盘输入，给所有属性赋值并输出，显示出该动物所吃的食物
2）	创建一个鱼类对象，通过键盘输入，给所有属性赋值并输出，显示出该动物所吃的食物
3）	创建一个鸟类对象，通过键盘输入，给所有属性赋值并输出，显示出该动物所吃的食物*/

public class TestAnimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入猫的姓名");
		String name = scan.next();
		System.out.println("请输入猫是否会叫(会-1，不会-其他)");
		int flag = scan.nextInt();
		boolean sound;
		if(flag == 1){
			sound = true;
		}
		else{
			sound = false;
		}
		System.out.println("请输入猫的颜色");
		String color = scan.next();
		Animal cat = new Cat(name,sound,color);
		cat.showAnimal();
		cat.eatFood();
		
		System.out.println("请输入鱼的姓名");
		String name1 = scan.next();
		System.out.println("请输入鱼是否会叫(会-1，不会-其他)");
		int flag1 = scan.nextInt();
		boolean sound1;
		if(flag1 == 1){
			sound1 = true;
		}
		else{
			sound1 = false;
		}
		System.out.println("请输入鱼的颜色");
		String color1 = scan.next();
		Animal fish = new Fish(name1,sound1,color1);
		fish.showAnimal();
		fish.eatFood();
		
		System.out.println("请输入鸟的姓名");
		String name2 = scan.next();
		System.out.println("请输入鸟是否会叫(会-1，不会-其他)");
		int flag2 = scan.nextInt();
		boolean sound2;
		if(flag2 == 1){
			sound2 = true;
		}
		else{
			sound2 = false;
		}
		System.out.println("请输入鸟的颜色");
		String color2 = scan.next();
		Animal bird = new Bird(name2,sound2,color2);
		bird.showAnimal();
		bird.eatFood();

	}

}
