package class2;

public class Math5 {

	public static void main(String[] args) {
		// 编程计算1*2*3+4*5*6+…+100*101*102的值
		int sum = 0;
		for(int i = 1; i <101;i+=3){
			
			sum = sum + i*(i+1)*(i+2);
			
		}System.out.println(sum);

	}

}
