package class6.animal;

import java.util.Scanner;

/*5��	����һ��������TestAnimal��������ֻ����main�����������ڸ÷�����ʵ�����¹��ܣ�
1��	����һ��è�����ͨ���������룬���������Ը�ֵ���������ʾ���ö������Ե�ʳ��
2��	����һ���������ͨ���������룬���������Ը�ֵ���������ʾ���ö������Ե�ʳ��
3��	����һ���������ͨ���������룬���������Ը�ֵ���������ʾ���ö������Ե�ʳ��*/

public class TestAnimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������è������");
		String name = scan.next();
		System.out.println("������è�Ƿ���(��-1������-����)");
		int flag = scan.nextInt();
		boolean sound;
		if(flag == 1){
			sound = true;
		}
		else{
			sound = false;
		}
		System.out.println("������è����ɫ");
		String color = scan.next();
		Animal cat = new Cat(name,sound,color);
		cat.showAnimal();
		cat.eatFood();
		
		System.out.println("�������������");
		String name1 = scan.next();
		System.out.println("���������Ƿ���(��-1������-����)");
		int flag1 = scan.nextInt();
		boolean sound1;
		if(flag1 == 1){
			sound1 = true;
		}
		else{
			sound1 = false;
		}
		System.out.println("�����������ɫ");
		String color1 = scan.next();
		Animal fish = new Fish(name1,sound1,color1);
		fish.showAnimal();
		fish.eatFood();
		
		System.out.println("�������������");
		String name2 = scan.next();
		System.out.println("���������Ƿ���(��-1������-����)");
		int flag2 = scan.nextInt();
		boolean sound2;
		if(flag2 == 1){
			sound2 = true;
		}
		else{
			sound2 = false;
		}
		System.out.println("�����������ɫ");
		String color2 = scan.next();
		Animal bird = new Bird(name2,sound2,color2);
		bird.showAnimal();
		bird.eatFood();

	}

}
