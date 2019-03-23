package class11.student;

import java.util.List;
import java.util.Scanner;

import class11.db.ConnectToServer;
import class11.user.User;

public class TestStudent {
	/*static void menu()����ʾ���˵�*/
	static void menu(){
		System.out.println();
		System.out.println("--------------------");
		System.out.println("A.     ��¼");
		System.out.println("B.     ע��");
		System.out.println("C.     �޸�����");
		System.out.println("D.     ����ѧ����Ϣ");
		System.out.println("E.     �˳�");
		System.out.println("--------------------");
		System.out.println();
	}
	
	/*����ʾ�Ӳ˵�*/
	static void subMenu(){
		System.out.println();
		System.out.println("--------------------");
		System.out.println("1.   ���ѧ����Ϣ");
		System.out.println("2.   ɾ��ѧ����Ϣ");
		System.out.println("3.   �����Ա��ѯѧ����Ϣ");
		System.out.println("4.   ���������ѯѧ����Ϣ");
		System.out.println("5.   ��ѯ����ѧ����Ϣ��д���ļ�");
		System.out.println("6.   ���Ժϵ��Ϣ");
		System.out.println("7.   ������һ���˵�");
		System.out.println("--------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		ConnectToServer cts = new ConnectToServer();
		User user = new User();
		boolean flaga = false;
		String no = null;
		System.out.println("*********��ӭʹ�ñ�����ϵͳ*********");
		do{
			menu();
			System.out.println("*********������˵����*********");
			no = scan.next();
			while(!"a".equalsIgnoreCase(no) && !"b".equalsIgnoreCase(no) && !"c".equalsIgnoreCase(no) && !"d".equalsIgnoreCase(no) && !"e".equalsIgnoreCase(no)){
				System.out.println("*********�˵���Ŵ�������������*********");
				no = scan.next();
			}
			if("a".equalsIgnoreCase(no)){
				User user1 = new User();
				int i = 0;
				do{
					System.out.println("�������û�����");
					System.out.println("����������");
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
				System.out.println("�������û�����");
				String name = scan.next();
				System.out.println("���������룺");
				String pass1 = scan.next();
				System.out.println("���ٴ��������룺");
				String pass2 = scan.next();
				if(pass1.equals(pass2)){
					User user1 = new User();
					user1.setUsername(name);
					user1.setUserpass(pass1);
					cts.registe(user1);
				}else{
					System.out.println("....�����ȷ�����벻ͬ��ע��ʧ��....");
				}
			}
			else if("c".equalsIgnoreCase(no)){
				if(flaga){
					System.out.println("�����������룺");
					String pass1 = scan.next();
					System.out.println("���ٴ����������룺");
					String pass2 = scan.next();
					if(pass1.equals(pass2)){
						cts.changePassword(user, pass1);
					}else{
						System.out.println("....�������벻ͬ��ע��ʧ��....");
					}
				}else{
					System.out.println("....���¼�����ʹ�øù���....");
				}
			}
			else if("d".equalsIgnoreCase(no)){
				if(flaga){
					int no1 = 0;
					do{
						subMenu();
						System.out.println("*********������˵����*********");
						no1 = scan.nextInt();
						switch(no1){
						case 1:{
							Student stu = new Student();
							System.out.println("������");
							stu.setStuName(scan.next());
							System.out.println("���䣺");
							stu.setStuAge(scan.nextInt());
							System.out.println("�绰��");
							stu.setStuTel(scan.next());
							System.out.println("�Ա�");
							stu.setStuSex(scan.next());
							List<Department> list = cts.getAllDepartment();
							for (int i = 0; i < list.size(); i++) {
								System.out.println(list.get(i).getDeptID()+"...."+list.get(i).getDeptName());
							}
							System.out.println("��ѡ��Ժϵ��");
							stu.setDeptID(scan.nextInt());
							cts.addStudent(stu);
							break;
						}
						case 2:{
							System.out.println("������ɾ����ѧԱID��");
							cts.delStudent(cts.fun(scan.nextInt()));
							break;
						}
						case 3:{
							System.out.println("��������Ҫ��ѯ��ѧԱ�Ա���/Ů��");
							String sex = scan.next();
							if("��".equals(sex)||"Ů".equals(sex)){
								cts.queryBySex(sex);
							}else{
								System.out.println("�Ա�������󣬲�ѯʧ�ܣ�");
							}
							break;
						}
						case 4:{
							System.out.println("***��������Ҫ��ѯ��ѧԱ���䷶Χ***");
							System.out.println("��С���䣺");
							System.out.println("������䣺");
							cts.queryByAge(scan.nextInt(), scan.nextInt());
							break;
						}
						case 5:{
							cts.queryAllStudent();
							break;
						}
						case 6:{
							System.out.println("������Ժϵ�����֣�");
							Department dept = new Department();
							dept.setDeptName(scan.next());
							cts.addDepartment(dept);
							break;
						}
						case 7:{
							break;
						}
						default:
							System.out.println("��������ȷ�ı�ţ�");
						}
					}while(no1 != 7);
				}else{
					System.out.println("....���¼�����ʹ�øù���....");
				}
			}
			else{
				System.out.println("*********ϵͳ�˳�����лʹ�ã�*********");
			}
		}while(!"e".equalsIgnoreCase(no));
		
		
		cts.closeDB();
		
		

	}

}
