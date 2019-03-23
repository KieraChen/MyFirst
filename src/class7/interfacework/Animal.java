package class7.interfacework;

public interface Animal {
/*	1��	�����ӿ�Animal��������
	a)	������city����ֵΪ���������������������ڴ�����
	b)	������
	i.	eat(String food);
	ii.	sound();*/
	String city = "����";
	void eat(String food);
	void sound();
}

/*2��	������Cat��ʵ��Animal�ӿ�
a)	���ԣ�è�����֡�è����ɫ
b)	������
i.	eat(String food):����è��ʲôʳ�ʳ��ͨ����������
ii.	sound():����è����νе�*/
class Cat implements Animal{
	String name;
	String color;

	@Override
	public void eat(String food) {
		System.out.println("è��"+food);	
	}

	@Override
	public void sound() {
		System.out.println("�����С�����");
	}
}

/*3��	������Fish��ʵ��Animal�ӿ�
a)	���ԣ�������ࡢ�����ɫ
b)	������
i.	eat(String food):�������ʲôʳ�ʳ��ͨ����������
ii.	sound():����������νе�
iii.	swim(int speed):�������ε��ٶȣ����ݲ�����ֵ��������ε��ٶ�ΪÿСʱ���ٹ���*/
class Fish implements Animal{
	String type;
	String color;

	@Override
	public void eat(String food) {
		System.out.println("���"+food);
	}

	@Override
	public void sound() {
		System.out.println("�㲻���");
	}
	public void swim(int speed){
		System.out.println("���ε��ٶ�ΪÿСʱ"+speed+"����");
	}
}

/*4��	������Bird��ʵ��Animal�ӿ�
a)	���ԣ�����峤
b)	������
i.	eat(String food):�������ʲôʳ�ʳ��ͨ����������
ii.	sound():����������νе�
iii.	fly():����������ηɵ�*/
class Bird implements Animal{
	int length;

	@Override
	public void eat(String food) {
		System.out.println("���"+food);	
	}

	@Override
	public void sound() {
		System.out.println("�����С�����");
	}
	
	public void fly(){
		System.out.println("�������Ϸɡ�����");
	}
}













