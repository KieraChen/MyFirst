package class11.student;

import java.util.List;
import java.util.Scanner;

import class11.db.ConnectToServer;
import class11.user.User;

public class TestStudent {
	/*static void menu()：显示主菜单*/
	static void menu(){
		System.out.println();
		System.out.println("--------------------");
		System.out.println("A.     登录");
		System.out.println("B.     注册");
		System.out.println("C.     修改密码");
		System.out.println("D.     管理学生信息");
		System.out.println("E.     退出");
		System.out.println("--------------------");
		System.out.println();
	}
	
	/*：显示子菜单*/
	static void subMenu(){
		System.out.println();
		System.out.println("--------------------");
		System.out.println("1.   添加学生信息");
		System.out.println("2.   删除学生信息");
		System.out.println("3.   根据性别查询学生信息");
		System.out.println("4.   根据年龄查询学生信息");
		System.out.println("5.   查询所有学生信息并写入文件");
		System.out.println("6.   添加院系信息");
		System.out.println("7.   返回上一级菜单");
		System.out.println("--------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		ConnectToServer cts = new ConnectToServer();
		User user = new User();
		boolean flaga = false;
		String no = null;
		System.out.println("*********欢迎使用本管理系统*********");
		do{
			menu();
			System.out.println("*********请输入菜单编号*********");
			no = scan.next();
			while(!"a".equalsIgnoreCase(no) && !"b".equalsIgnoreCase(no) && !"c".equalsIgnoreCase(no) && !"d".equalsIgnoreCase(no) && !"e".equalsIgnoreCase(no)){
				System.out.println("*********菜单编号错误！请重新输入*********");
				no = scan.next();
			}
			if("a".equalsIgnoreCase(no)){
				User user1 = new User();
				int i = 0;
				do{
					System.out.println("请输入用户名：");
					System.out.println("请输入密码");
					user1.setUsername(scan.next());
					user1.setUserpass(scan.next());
					flaga = cts.login(user1);
					if(flaga){
						user.setUsername(user1.getUsername());
						user.setUserpass(user1.getUserpass());
					}
					i++;
				}while(!flaga || i < 3);
			}
			else if("b".equalsIgnoreCase(no)){
				System.out.println("请输入用户名：");
				String name = scan.next();
				System.out.println("请输入密码：");
				String pass1 = scan.next();
				System.out.println("请再次输入密码：");
				String pass2 = scan.next();
				if(pass1.equals(pass2)){
					User user1 = new User();
					user1.setUsername(name);
					user1.setUserpass(pass1);
					cts.registe(user1);
				}else{
					System.out.println("....密码和确认密码不同，注册失败....");
				}
			}
			else if("c".equalsIgnoreCase(no)){
				if(flaga){
					System.out.println("请输入新密码：");
					String pass1 = scan.next();
					System.out.println("请再次输入新密码：");
					String pass2 = scan.next();
					if(pass1.equals(pass2)){
						cts.changePassword(user, pass1);
					}else{
						System.out.println("....两次密码不同，注册失败....");
					}
				}else{
					System.out.println("....请登录后后再使用该功能....");
				}
			}
			else if("d".equalsIgnoreCase(no)){
				if(flaga){
					int no1 = 0;
					do{
						subMenu();
						System.out.println("*********请输入菜单编号*********");
						no1 = scan.nextInt();
						switch(no1){
						case 1:{
							Student stu = new Student();
							System.out.println("姓名：");
							stu.setStuName(scan.next());
							System.out.println("年龄：");
							stu.setStuAge(scan.nextInt());
							System.out.println("电话：");
							stu.setStuTel(scan.next());
							System.out.println("性别：");
							stu.setStuSex(scan.next());
							List<Department> list = cts.getAllDepartment();
							for (int i = 0; i < list.size(); i++) {
								System.out.println(list.get(i).getDeptID()+"...."+list.get(i).getDeptName());
							}
							System.out.println("请选择院系：");
							stu.setDeptID(scan.nextInt());
							cts.addStudent(stu);
							break;
						}
						case 2:{
							System.out.println("请输入删除的学员ID：");
							cts.delStudent(cts.fun(scan.nextInt()));
							break;
						}
						case 3:{
							System.out.println("请输入您要查询的学员性别（男/女）");
							String sex = scan.next();
							if("男".equals(sex)||"女".equals(sex)){
								cts.queryBySex(sex);
							}else{
								System.out.println("性别输入错误，查询失败！");
							}
							break;
						}
						case 4:{
							System.out.println("***请输入您要查询的学员年龄范围***");
							System.out.println("最小年龄：");
							System.out.println("最大年龄：");
							cts.queryByAge(scan.nextInt(), scan.nextInt());
							break;
						}
						case 5:{
							cts.queryAllStudent();
							break;
						}
						case 6:{
							System.out.println("请输入院系的名字：");
							Department dept = new Department();
							dept.setDeptName(scan.next());
							cts.addDepartment(dept);
							break;
						}
						case 7:{
							break;
						}
						default:
							System.out.println("请输入正确的编号！");
						}
					}while(no1 != 7);
				}else{
					System.out.println("....请登录后后再使用该功能....");
				}
			}
			else{
				System.out.println("*********系统退出，感谢使用！*********");
			}
		}while(!"e".equalsIgnoreCase(no));
		
		
		cts.closeDB();
		
		

	}

}
