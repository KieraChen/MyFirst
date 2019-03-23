package class7.interfacedemo;

/*1��	����һ�����������ĳ�����Car��������Ա���£�
a)	���ԣ���ɫ��color������̥������tyres��
b)	������
i.	Ĭ�Ϲ��췽������ɫΪ��ɫ����̥��0��
ii.	�������Ĺ��췽���������Ը�ֵΪ����ֵ
iii.	��ʾ����show����������ֵΪ�գ����󷽷�
*/
public abstract class Car {
	String color;
	int tyres;
	Car(){
		this.color = "��ɫ";
		this.tyres = 0;
	}
	Car(String color,int tyres){
		this.color = color;
		this.tyres = tyres;
	}
	public abstract void show();
}

/*2��	����һ����Bus���̳г�����Car��������������ٱ��̳У���ӳ�Ա���£�
a)	���ԣ�ÿ���ʼ��ʱ�䣨startTime����ÿ���ĩ��ʱ�䣨endTime�����ؿ�����passenger��
b)	������
i.	Ĭ�Ϲ��췽������ʼ��ʱ���ĩ��ʱ�丳ֵΪ��00:00�����ؿ���Ϊ0
ii.	���������췽���������Ը�ֵΪ����ֵ
iii.	��д�����еĳ��󷽷�����ʾ�������߱�����������ֵ
iv.	function()���������������ĺ����������������Ĺ��ܣ�
           ������������50��ʱ�����������һ����������������������������
           �������������һ��С���������������೵��*/
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
		System.out.println("��ɫ"+this.color+" ��̥��"+this.tyres+" ʼ��ʱ��"+this.startTime+" ĩ��ʱ��"+this.endTime+" �ؿ���"+this.passenger);
	}
	public void function(){
		if(this.passenger <= 50)
			System.out.println("����һ��С���������������೵");
		else
			System.out.println("����һ������������������������");
	}
}

/*3��	����һ�����г���Bicycle���̳г�����Car����ӳ�Ա���£�
a)	���ԣ��ͺţ�type��
b)	������
i.	Ĭ�Ϲ��췽�������ͺŸ�ֵΪ24
ii.	���������췽���������Ը�ֵΪ����ֵ
iii.	��д����ĳ��󷽷�����ʾ�������߱�����������ֵ
iv.	ride():���ݳ����ͺţ����������г����õ���Ⱥ�����ͺ���16���£������������г��ʺ϶�ͯ���á���
                               ���������������г��ʺϳ��������á���*/
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
		System.out.println("��ɫ"+this.color+" ��̥��"+this.tyres+" �ͺ�"+this.type);	
	}
	public void ride(){
		if(this.type <= 16)
			System.out.println("������г��ʺ϶�ͯ����");
		else
			System.out.println("������г��ʺϳ���������");
	}
}

/*4��	����һ���綯���г�����Autocycle���̳����г���Bicycle����ӳ�Ա���£�
a)	���ԣ��ٹ�����ͣ�gas��
b)	������
i.	Ĭ�Ϲ��췽������gas��ֵΪ0
ii.	�������Ĺ��췽���������Ը�ֵΪ����ֵ
iii.	��д�����show��������������ԭ�и����и÷����Ĺ��ܣ������һ����ʾ����������Ե�������*/
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
		System.out.println("�ٹ������"+this.gas);	
	}
}













