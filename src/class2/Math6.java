package class2;

import java.util.Scanner;

public class Math6 {

	public static void main(String[] args) {
/*		�ȴ�ӡ5�е����Σ�Ȼ��Ӹ�Ϊ�Ӽ�������һ������N����ӡ����2*N-1�е�����
		*
	   ***
	  *****
	   ***
		*

*/
/*		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ������");
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
		System.out.println("������һ������N��");
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
