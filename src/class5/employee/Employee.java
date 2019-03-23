package class5.employee;
/*【创建包：employee，完成如下功能】
1．	创建一个员工类(Employee)，其中包括：
1）	4个私有属性：员工姓名(name)、员工年龄(age)、员工职位(position)、工资(salary)
2）	方法：
Employee() ——给所有的属性指定初始值
setName（）——给name属性赋值
setAge（）——给age属性赋值，要求年龄必须在18岁以上，当年龄无效时，将年龄强制赋值为18
setPosition（）——给position属性赋值，只能是“售后服务”和“销售员”，如果不符合要求，
	                                则强制将职位赋值为“售后服务”。
setSalary（）——用于员工的工资：根据员工的年龄段不同，给工资属性赋值，
                        
getName（）——返回name属性
getAge（）——返回age属性
getPosition（）——返回position属性
getSalary（）——返回salary属性


*/
public class Employee {

	private String name;
	private int age;
	private String position;
	private double salary;
	
	Employee(){
		this.name = "无";
		this.age = 18;
		this.position = "售后服务";
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
		if("售后服务".equals(position) || "销售员".equals(position)){
			this.position = position;
		}
		else{
			this.position = "售后服务";
		}
		
	}
	public double getSalary() {
		return this.salary;
	}
/*	18~20岁之间，1000元，21~25岁之间，1500元，26~30岁之间，2000元，
    31~40岁之间，3000元，41~50岁之间，3500元，50岁以上,4000元*/
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
		System.out.println("员工姓名:"+this.name+"、员工年龄:"+this.age+"、员工职位:"+this.position+"、工资:"+this.salary);
	}



}
