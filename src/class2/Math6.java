package class2;

import java.util.Scanner;

public class Math6 {

	public static void main(String[] args) {
/*		先打印5行的菱形；然后从改为从键盘输入一个整数N，打印出有2*N-1行的菱形
		*
	   ***
	  *****
	   ***
		*

*/
/*		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您要打印的行数");
		int starLine = scan.nextInt();
		
		for (int i = 0; i <= starLine; i++) {
			for (int j = i; j <starLine; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数N：");
		int starLine = scan.nextInt();
		
		for(int i = 1;i<=starLine;i++){
			for(int j = i;j<starLine;j++){
				System.out.print(" ");
			}
			for(int j = 1;j<=(i*2)-1;j++){
				System.out.print("*");
			}
			System.out.println("");

		}
		//starLine=3
		for(int i = starLine;i>=1;i--){
			for(int j = 2*starLine-3;j>=i;j--){
				System.out.print(" ");
			}
			for(int j = (i*2)-3;j>=1;j--){
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
