package class7.interfacedemo;
/*5��	����һ��������Test�����main��������
a)	��������Bus���󣬷ֱ����Ĭ�Ϲ��췽���ʹ������Ĺ��췽������ʵ��������ʾ�����������������Լ�����
b)	���������綯���г����󣬷ֱ����Ĭ�Ϲ��췽���ʹ��ι��췽������ʾ���������������ԣ��������ﳵ�ķ���*/

public class Test {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.show();
		bus1.function();
		
		Bus bus2 = new Bus("��ɫ",6,"06:00","22:00",65);
		bus2.show();
		bus2.function();
		
		Autocycle autocycle1 = new Autocycle();
		autocycle1.show();
		autocycle1.ride();
		
		Autocycle autocycle2 = new Autocycle("��ɫ",2,15,5);
		autocycle2.show();
		autocycle2.ride();

	}

}
