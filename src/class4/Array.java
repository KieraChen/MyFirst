package class4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
/*	5、【附加】向数组中添加非0数字：循环接受用户输入非0数字，并添加到数组中，重复元素不可以添加，具体要求如下：
	1)	在main方法中创建长度为10的数组，并全部初始化为0。
	2)	main方法中接受用户从键盘输入一个数字
	a)	如果是0，则提示错误并重新输入；
	b)	如果不是0，则调用自定义方法find(),查找该数在数组中是否存在；
	i.	如果存在，则提示该数已存在，不可以向数组中插入，然后询问用户是否继续输入下一个数
	ii.	如果不存在，则调用自定义方法insert()，向数组中添加此数，返回添加的位置，
	添加成功询问用户是否继续输入下一个元素，直到用户不想再输入或者数组已满，则停止循环
	3)	main方法中输出添加结束之后的数组
	4)	int find(int arr[],int num)：用于查找num在arr数组中是否存在，
	如果存在，返回该数在数组中的位置，若不存在，则返回10（二分法查找）
	5)	int insert(int arr,int num): 用于向arr数组中添加num元素，
	在arr数组中查找第一个为0的元素，将num的值添加到该位置，并返回添加成功之后的位置，
	如果找不到为0的数字，则返回10，代表数组已满，不可以再插入。
*/
	static int find(int arr[],int num){
		Arrays.sort(arr);
		int a = Arrays.binarySearch(arr, num);
		
		if(a < 0){
			a = 10;
		}
		return a;
	} 
	
	static int insert(int[] arr,int num){
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0){
				arr[i] = num;
				a = i;
				//System.out.println("a"+a);
				break;
			}
			else{
				a = 10;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int arr[] = new int[10];
		String answer;
		int b = 0;
		do{
			System.out.println("请输入数字");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			while(a == 0){
				System.out.println("错误，请重新输入！！");	
				a = scan.nextInt();
				}
			if(find(arr, a) == 10){
				b = insert(arr,a);
				
				//System.out.println("b"+b);
				if(b==10){
					System.out.println("数组已满！");
					break;}
			}else{
				System.out.println("该数已存在，不可以向数组中插入");
			}
			
			System.out.println("请输入是否继续录入数据（y-是，其它-否）");
			answer = scan.next();
		}while("y".equalsIgnoreCase(answer) || b == 10);
		System.out.print("数组为");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
