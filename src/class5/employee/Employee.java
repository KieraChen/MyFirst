package class5.employee;
/*����������employee��������¹��ܡ�
1��	����һ��Ա����(Employee)�����а�����
1��	4��˽�����ԣ�Ա������(name)��Ա������(age)��Ա��ְλ(position)������(salary)
2��	������
Employee() ���������е�����ָ����ʼֵ
setName����������name���Ը�ֵ
setAge����������age���Ը�ֵ��Ҫ�����������18�����ϣ���������Чʱ��������ǿ�Ƹ�ֵΪ18
setPosition����������position���Ը�ֵ��ֻ���ǡ��ۺ���񡱺͡�����Ա�������������Ҫ��
	                                ��ǿ�ƽ�ְλ��ֵΪ���ۺ���񡱡�
setSalary������������Ա���Ĺ��ʣ�����Ա��������β�ͬ�����������Ը�ֵ��
                        
getName������������name����
getAge������������age����
getPosition������������position����
getSalary������������salary����


*/
public class Employee {

	private String name;
	private int age;
	private String position;
	private double salary;
	
	Employee(){
		this.name = "��";
		this.age = 18;
		this.position = "�ۺ����";
		this.salary = 1000;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age >= 18){
			this.age = age;
		}
		else{
			this.age = 18;
		}
		
		
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		if("�ۺ����".equals(position) || "����Ա".equals(position)){
			this.position = position;
		}
		else{
			this.position = "�ۺ����";
		}
		
	}
	public double getSalary() {
		return this.salary;
	}
/*	18~20��֮�䣬1000Ԫ��21~25��֮�䣬1500Ԫ��26~30��֮�䣬2000Ԫ��
    31~40��֮�䣬3000Ԫ��41~50��֮�䣬3500Ԫ��50������,4000Ԫ*/
	public void setSalary(double salary) {
		
		if(this.age < 21){
			this.salary = 1000;
		}
		else if(this.age >= 21 && this.age < 26){
			this.salary = 1500;
		}
		else if(this.age >= 26 && this.age < 31){
			this.salary = 2000;
		}
		else if(this.age >= 31 && this.age < 41){
			this.salary = 3000;
		}
		else if(this.age >= 41 && this.age < 51){
			this.salary = 3500;
		}
		else{
			this.salary = 4000;
		}
		
	}
	
	public void show(){
		System.out.println("Ա������:"+this.name+"��Ա������:"+this.age+"��Ա��ְλ:"+this.position+"������:"+this.salary);
	}



}
