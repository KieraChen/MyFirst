package class4;

public class Draw {
/*	创建类Draw，包含一个自定义方法calculateArea()，并带有3个整型参数。
	参数代表三角形的三条边，计算三角形的面积，并返回。*/

	public static double calculateArea(int a, int b, int c) {
		double d = (a+b+c)/2;
		double s = Math.sqrt(d*(d-a)*(d-b)*(d-c));
		return s;
	}

}
