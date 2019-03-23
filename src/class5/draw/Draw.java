package class5.draw;
/*1、	创建类Draw（代表图形），包含：
a)	属性：private double drawRound；（代表图形的周长）
b)	构造方法：给属性赋值为0；
c)	方法：getRound（）返回代表周长的属性值
d)	方法：void round（double r） 计算圆形的周长，参数表示圆的半径
e)	方法：void round（int length，int width） 计算长方形的周长，参数表示长方形的长与宽
f)	方法：void round（int length）计算正方形的周长，参数表示正方形的边长
g)	方法：void round（int a，int b，int c）计算三角形的周长，参数表示三角形的三条边。
*/
public class Draw {
	private double drawRound;
	Draw(){
		drawRound = 0;
	}
	public double getDrawRound() {
		return this.drawRound;
	}
	public void round(double r){
		this.drawRound = 2*Math.PI*r;	
	}
	public void round(int length, int width){
		this.drawRound = 2*(length + width);
	}
	public void round(int length){
		this.drawRound = 4*length;
	}
	public void round(int a, int b, int c){
		if(a+b > c && b+c > a && c+a > b){
			this.drawRound = a+b+c;
		}
		else{
			System.out.println("无法构成三角形！");
			this.drawRound = 0;
		}
	}
	

}
