package class6;

/*public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
/*class Person{
	public Person(int x){
	       System.out.println("person run"+x);
	}
}
class Son extends Person{
	public Son(int x){
		super(0);
System.out.println("son run"+x); //1.¡¾  ¡¿
	}
}
public class ExtendsDemo{
   public static void main(String[] args){
       Son son  = new Son(5);
   }
}
*/

class Person{
	 int num =4;
	}
	class Son extends Person{
	  int num = 3;
	   public void show(){
	       System.out.println("num="+super.num); //2¡¾¡¿
	}
	}
	public class ExtendsDemo{
	   public static void main(String[] args){
	       Son son  = new Son();
	       son.show();//1¡¾¡¿
	}
	}










