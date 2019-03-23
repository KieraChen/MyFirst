package class10;

import java.util.Scanner;

/*2. 自定义一个“三角形类”，其中有成员 x,y,z,作为三边长，
 * 重载构造方法分别给x,y,z 三个成员变量赋值，
 * 在此类中应该有一个方法：求三角形面积“getArea”和显示三角形信息(三个边长)“showInfo”，
 * 在这2个方法中当三条边不能构成一个三角形时要抛出自定义异常NotSanjiaoException，否则显示正确信息。
 * 在测试类中的主方法中构造一个三角形对象(三边为命令行输入的三个整数)， 显示三角形信息和面积，并捕获异常。*/
public class TestTriangle {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("请输入三角形三边");
		Triangle triangle = new Triangle(scan.nextInt(),scan.nextInt(),scan.nextInt());
		try {
			triangle.showInfo();
		} catch (NotSanjiaoException e) {
			System.out.println(e.getMessage());
		}
		try {
			triangle.getArea();
		} catch (NotSanjiaoException e) {
			System.out.println(e.getMessage());
		}

	}
	

}
class NotSanjiaoException extends Exception{
	public NotSanjiaoException(String message){
		super(message);
	}
}
class Triangle{
	int x;
	int y;
	int z;
	Triangle(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void getArea() throws NotSanjiaoException{
		//d = (a+b+c)/2; 面积 = Math.sqrt(d*(d-a)*(d-b)*(d-c))
		if(x+y>z && y+z>x && x+z>y){
			double d = (x+y+z)/2;
			System.out.println("三角形面积:"+Math.sqrt(d*(d-x)*(d-y)*(d-z)));
		}
		else{
			throw new NotSanjiaoException("不能构成三角形！！");
		}
		
		
	}
	public void showInfo() throws NotSanjiaoException{
		if(x+y>z && y+z>x && x+z>y){
			System.out.println("三角形边长1："+this.x+" 三角形边长2:"+this.y+" 三角形边长3:"+this.z);
		}
		else{
			throw new NotSanjiaoException("不能构成三角形！");
		}
		
	}
}
