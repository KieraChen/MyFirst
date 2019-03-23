package class4;

import java.util.Scanner;

public class Student {
	/*		创建类Student，完成判断学生成绩的有效性及成绩转换的功能，包含如下方法：
	a)	自定义方法boolean validate(int score)：用于判断成绩是否有效，
	参数score代表被判断的成绩，若成绩在1-100分之间，则视为成绩有效，返回true，
	否则视为成绩无效，返回false
	b)	自定义方法 void convert(int score)：用于将百分之的成绩转换为等级制，
	参数score代表被转换的成绩，根据如下原则，判断成绩的分数，输出对应的等级
	    i.	90~100分：A等级
	    ii.	80~89分：B等级
	    iii.70~79分：C等级
	    iv.	60~69分：D等级
	    v.	60分以下：X等级
	c)	main()：输入一个学生的成绩，调用validate()方法，判断该成绩是否有效，
	如果无效，则给出成绩无效的提示，如果有效，则继续调用convert()方法，实现成绩由百分之到等级的转换。
*/
	static boolean validate(int score){
		boolean a = false;
		if(score > 0 && score <= 100){
			a = !a;
		}
		return a;
	}
	
	static void convert(int score){
		if(score >= 90 ){
			System.out.println("A等级");
		}
		else if(score >= 80 && score < 90){
			System.out.println("B等级");
		}
		else if(score >= 70 && score < 80){
			System.out.println("C等级");
		}
		else if(score >= 60 && score < 70){
			System.out.println("D等级");
		}
		else{
			System.out.println("X等级");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩");
		int score = scan.nextInt();
		boolean result = validate(score);
		if(true == result){
			convert(score);
		}
		else{
			System.out.println("成绩无效!");
		}

		

	}

}
