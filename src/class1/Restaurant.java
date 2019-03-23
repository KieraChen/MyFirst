package class1;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1）	程序启动，提示用户进行注册信息，要求用户输入用户名、密码和确认密码，
 *          判断用户名和密码是否符合要求，密码和确认密码是否相同，若输入有效，则注册成功，
 *          继续提示用户进行登录，否则给出相应的错误提示信息，程序结束。
		2）	若注册成功，完成登录功能，提示用户输入用户名和密码，与刚刚注册的信息进行比较，
		           登录成功则提出相应提示，并继续完成如下功能
		3）	登录成功，完成该功能，模拟点餐系统。给出用户一个提示信息：您需要炒饼还是炒面，
		           当用户输入1代表炒饼，输入2代表炒面，输入其他则代表用户选择放弃用餐。
		           当用户选择炒饼后，继续提示用户选择鱿鱼炒饼还是鸡蛋炒饼，并根据用户的选择，
		           显示相应的提示信息，即“你选择了****，请稍后！”；当用户选择炒面，
		           继续提示用户选择肉丝炒面还是蔬菜烧面，并根据用户的选择，显示相应的提示信息，
		           即“你选择了****，请稍后！”
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请注册信息");
		System.out.println("请输入用户名：");
		String userName = scan.next();
		System.out.println("请输入密码：");
		String userPwd = scan.next();
		System.out.println("请确认密码：");
		String userPwd1 = scan.next();
		
		if(userPwd1.equals(userPwd)){
			System.out.println("注册成功！");
			System.out.println("请输入用户名：");
			String userName2 = scan.next();
			System.out.println("请输入密码：");
			String userPwd2 = scan.next();
			
		    if(userName2.equals(userName) && userPwd2.equals(userPwd)){
			    	System.out.println("登录成功！");
			    	
			    	System.out.println("请输入您需要炒饼还是炒面（1-炒饼，2-炒面，其他-放弃用餐）");
			    	String userNeed = scan.next();
			    	
			    	if("1".equals(userNeed)){
			    		System.out.println("请输入您需要鱿鱼炒饼还是鸡蛋炒饼（1-鱿鱼炒饼，其它-鸡蛋炒饼）");
			    		String pancake = scan.next();
			    		if("1".equals(pancake)){
			    			System.out.println("你选择了鱿鱼炒饼，请稍后！");
			    		}
			    		else{
			    			System.out.println("你选择了鸡蛋炒饼，请稍后！");
			    		}
			    	}
			    	else if("2".equals(userNeed)){
			    		System.out.println("请输入您需要肉丝炒面还是蔬菜炒面（1-肉丝炒面，其它-蔬菜炒面）");
			    		String noodle = scan.next();
			    		if("1".equals(noodle)){
			    			System.out.println("你选择了肉丝炒面，请稍后！");
			    		}
			    		else{
			    			System.out.println("你选择了蔬菜炒面，请稍后！");
			    		}
			    	}
			    	else{
			    		System.out.println("放弃用餐！");
			    	}
			    }
			else{
			    	System.out.println("登陆失败！");
			    }
		}
		  
		else{
			System.out.println("注册失败！");
		}
		
		
		
	}

}
