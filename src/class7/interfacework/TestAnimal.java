package class7.interfacework;


/*5��	������TestAnimal������������
a)	����è���㡢�����һ�����󣬷ֱ�����ǵ����Ը�ֵ�������Ч�����ա����Ǵ�����һֻè���ҽа�����è����ɫ�ġ�
b)	ʹ��ÿ������ֱ���ø���ӵ�еķ���*/
public class TestAnimal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.color = "��ɫ";
		cat.name = "������è";
		System.out.println("����"+cat.city+"��һֻè���ҽ�"+cat.name+"��"+cat.color+"��");
		cat.eat("èʳ");
		cat.sound();
		
		
		Fish fish = new Fish();
		fish.color = "��ɫ";
		fish.type = "�ȴ���";
		System.out.println("����"+fish.city+"��һ���㣬�ҽ�"+fish.type+"��"+cat.color+"��");
		fish.eat("��ʳ");
		fish.sound();
		fish.swim(10);
		
		
		Bird bird = new Bird();
		bird.length = 10;
		System.out.println("����"+fish.city+"��һֻ�����峤"+bird.length);
		bird.eat("��ʳ");
		bird.sound();
		bird.fly();
		

	}

}
