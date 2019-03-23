package class5;

public class Demo {
int x;
	public static void main(String[] args) {
		Demo d = new Demo();
		d.x = 5;
		show(d);
		System.out.println(d.x);

	}
	
	public static void show(Demo d){
		d.x = 6;
	}

}
