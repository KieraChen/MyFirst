package class11.db;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import class11.student.Department;
import class11.student.Student;
import class11.user.User;

public class ConnectToServer {
	Scanner scan = new Scanner(System.in);
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	private String url = "jdbc:mysql://127.0.0.1:3306/ms";
	private String user = "root";
	private String pass = "";
	
	//1)�������ݿ�
	public ConnectToServer(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("ע������ʧ�ܣ�");
		} catch (SQLException e) {
			System.out.println("�������ݿ�ʧ�ܣ������ַ���û��������룡");
		}
		System.out.println("ע���������������ݿ�ɹ���");
	}
	//2)�ж��û����Ƿ��ѱ�ע��
	private boolean usernameExiste(String username){
		String sql = "select * from tb_users where userName = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			if(rs.next()){
				return false;
			}
			else{
				return true;
			}
		} catch (SQLException e) {
			System.out.println("�ж��û����Ƿ��ѱ�ע�����");
			return false;
		}
		
	}
	/*3���ע�Ṧ�ܣ�����usernameExiste�������ж��û����Ƿ���ã�
	������Է���ע�ᣬ���ע��ɹ����򷵻�true�����򷵻�false��*/
	public boolean registe(User user){
		if(usernameExiste(user.getUsername())){
			System.out.println("�û����Ѵ��ڻ����");
			return false;
		}else{
			String sql = "insert into tb_users(userID,userName,userPass) values(default,?,?)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, user.getUsername());
				ps.setString(2, user.getUserpass());
				int i = ps.executeUpdate();
				System.out.println("ע��ɹ���user�������"+i+"����¼");
				return true;
			} catch (SQLException e) {
				System.out.println("ע�����");
				return false;
			}
		}
	}
	//4��ɵ�¼���ܣ������¼�ɹ����򷵻�true�����򷵻�false��
	public boolean login(User user){
		String sql = "select * from tb_users where userName=? and userPass=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getUserpass());
			rs = ps.executeQuery();
			if(rs.next()){ 
				System.out.println("��¼�ɹ���");
				return true;
			}else{
				System.out.println("��¼ʧ�ܣ�");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("��¼����");
			return false;
		}

	}
	//5����޸����빦�ܣ�����޸ĳɹ����򷵻�true�����򷵻�false��
	public boolean changePassword(User user,String newPassword){
		String sql = "update tb_job SET userPass=? WHERE userName=? and userPass=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getUserpass());
			int i = ps.executeUpdate();
			System.out.println("�����޸ĳɹ���user���޸���"+i+"����¼��");
			return true;
		} catch (SQLException e) {
			System.out.println("�����޸Ĵ���");
			return false;
		}
	}
	//6�жϲ��������Ժϵ�����Ƿ���ڣ���������򷵻�true�����򷵻�false��
	public boolean deptNameExiste (String name){
		String sql = "select * from tb_department where cName = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("���ڣ�");
				return true;
			}
			else{
				System.out.println("�����ڣ�");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("�жϲ��������Ժϵ�����Ƿ���ڴ���");
			return false;
		}
	}
	/*7)public boolean addDepartment(Department dept)����������ѧԺ�Ĺ��ܣ�
	����deptNameExiste()���ж�Ժϵ�Ƿ���ڣ���������������Ӧ��ʾ��������false��
	��ӳɹ��򷵻�true�����򷵻�false��*/
	public boolean addDepartment(Department dept){
		if(deptNameExiste(dept.getDeptName())){
			System.out.println("Ժϵ���Ѵ��ڻ����");
			return false;
		}else{
			String sql = "insert into tb_department(cID,cName) values(default,?)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, dept.getDeptName());
				int i = ps.executeUpdate();
				System.out.println("���Ժϵ�ɹ���department�������"+i+"����¼");
				return true;
			} catch (SQLException e) {
				System.out.println("���Ժϵ����");
				return false;
			}
		}
	}
/*	8)	����������ѧ����Ϣ�Ĺ��ܣ���ӳɹ��򷵻�true�����򷵻�false��*/
	public boolean addStudent(Student stu){
		try {
			/*String sql = "select * from tb_department ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("ID....Name");
			while(rs.next()){
				int i = 1;
				System.out.println(i+"...."+rs.getString("cName"));
				i++;
			}
			System.out.println("��ѡ��Ժϵ��");
			int k = scan.nextInt();
			rs.absolute(k);
			int deptID = rs.getInt("cID");
			stu.setDeptID(deptID);	*/
			//
			String sql1 = "insert into tb_student(stuID,stuName,stuAge,stuSex,stuTel,deptID) values(default,?,?,?,?,?)";
			ps = conn.prepareStatement(sql1);
			ps.setString(1, stu.getStuName());
			ps.setInt(2, stu.getStuAge());
			ps.setString(3, stu.getStuSex());
			ps.setString(4, stu.getStuTel());
			ps.setInt(5, stu.getDeptID());
			int j = ps.executeUpdate();
			System.out.println("���ѧ���ɹ���student�������"+j+"����¼");
			return true;
		} catch (SQLException e) {
			System.out.println("���ѧ������");
			return false;
		}
	}
/*	9)	���жϸ�ѧ���Ƿ���ڣ�������ڣ���ɾ����������true�����򷵻�false*/
	public boolean delStudent(Student stu){
		String sql = "select * from tb_student where stuName =? and stuAge =? and stuSex =? and stuTel =? and deptID =?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, stu.getStuName());
			ps.setInt(2, stu.getStuAge());
			ps.setString(3, stu.getStuSex());
			ps.setString(4, stu.getStuTel());
			ps.setInt(5, stu.getDeptID());
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("���ڣ�");
				sql = "delete from tb_student where stuName =? and stuAge =? and stuSex =? and stuTel =? and deptID =?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, stu.getStuName());
				ps.setInt(2, stu.getStuAge());
				ps.setString(3, stu.getStuSex());
				ps.setString(4, stu.getStuTel());
				ps.setInt(5, stu.getDeptID());
				int i = ps.executeUpdate();
				System.out.println("ɾ��ѧ���ɹ���student��ɾ����"+i+"����¼");
				return true;
			}
			else{
				System.out.println("�����ڣ�");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("�ж�ѧ���Ƿ���ڴ����ɾ��ѧ������");
			return false;
		}
	}
/*	10)	�������Ա����ѧ�����жϸ��Ա��ѧ���Ƿ���ڣ�
 * ������ڣ�������������ѧ����ŵ������У����ظü��ϣ��������ڣ��򷵻ؿռ���*/
	public List<Student> queryBySex(String sex){
		String sql = "select * from tb_student where stuSex = ? ";
		List<Student> list = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, sex);
			rs = ps.executeQuery();
			list = new ArrayList<Student>();
			while(rs.next()){
				Student stu = new Student();
				stu.setStuName(rs.getString("stuName"));
				stu.setStuAge(rs.getInt("stuAge"));
				stu.setStuSex(rs.getString("stuSex"));
				stu.setStuTel(rs.getString("stuTel"));
				stu.setDeptID(rs.getInt("deptID"));
				list.add(stu);
			}
			return list;
		} catch (SQLException e) {
			System.out.println("���Ҵ���");
			return list;
		}
	}
/*	11)�����������ѧ�����ж��������䷶Χ�ڵ�ѧ���Ƿ���ڣ�
 * ������ڣ�������������ѧ����ŵ������У����ظü��ϣ��������ڣ��򷵻ؿռ���*/
	public List<Student> queryByAge(int minAge,int maxAge){
		String sql = "select * from tb_student where stuAge between ? and ? ";
		List<Student> list = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, minAge);
			ps.setInt(2, maxAge);
			rs = ps.executeQuery();
			list = new ArrayList<Student>();
			while(rs.next()){
				Student stu = new Student();
				stu.setStuName(rs.getString("stuName"));
				stu.setStuAge(rs.getInt("stuAge"));
				stu.setStuSex(rs.getString("stuSex"));
				stu.setStuTel(rs.getString("stuTel"));
				stu.setDeptID(rs.getInt("deptID"));
				list.add(stu);
			}
			return list;
		} catch (SQLException e) {
			System.out.println("���Ҵ���");
			return list;
		}
	}
/*	12)	��������ѧ����Ϣ���õ������У����ظü��ϣ�������ѯ����������ѧ����Ϣд��һ���ļ��С�*/
	public List<Student> queryAllStudent(){
		String sql = "select * from tb_student";
		List<Student> list = null;
		BufferedWriter bw = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			list = new ArrayList<Student>();
			while(rs.next()){
				Student stu = new Student();
				stu.setStuName(rs.getString("stuName"));
				stu.setStuAge(rs.getInt("stuAge"));
				stu.setStuSex(rs.getString("stuSex"));
				stu.setStuTel(rs.getString("stuTel"));
				stu.setDeptID(rs.getInt("deptID"));
				list.add(stu);
			}
			FileWriter f = new FileWriter("1.txt");
			bw = new BufferedWriter(f);
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i).getStuName());
				bw.write(list.get(i).getStuAge());
				bw.write(list.get(i).getStuSex());
				bw.write(list.get(i).getStuTel());
				bw.write(list.get(i).getDeptID());
				bw.newLine();
			}
			return list;
		} catch (SQLException e) {
			System.out.println("���Ҵ���");
			return list;
		} catch (IOException e) {
			System.out.println("д�����");
			return null;
		}finally{
			try {
				if(bw != null){
					bw.close();
				}	
			} catch (IOException e) {
				System.out.println("�رմ���");
			}
		}
	}
/*	13)	��������Ժϵ��Ϣ���õ������У����ظü���*/
	public List<Department> getAllDepartment(){
		String sql = "select * from tb_department";
		List<Department> list = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			list = new ArrayList<Department>();
			while(rs.next()){
				Department dept = new Department();
				dept.setDeptID(rs.getInt("cID"));
				dept.setDeptName(rs.getString("cName"));
				list.add(dept);
			}
			return list;
		}catch (SQLException e) {
			System.out.println("���Ҵ���");
			return list;
		}
		
	}
/*	14)	�����ݲ�����id�����Ҷ�Ӧid��Ժϵ���֣�����Ժϵ��*/
	public String getDepartment(int id){
		String sql = "select cName from tb_department where cID=(select deptID from tb_student where stuID = ?)";
		String result = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			result = rs.getString("cName");
			return result;
		} catch (SQLException e) {
			System.out.println("���Ҵ���");
			return result;
		}
	}
/*	15)	���ر�Connection����*/
	public void closeDB(){
		/*try {
			if(rs != null){
				rs.close();
			}
			if(ps != null){
				ps.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
			try {
				if(rs!=null){
				   rs.close();
				}
				if(ps!=null){
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
			try {
				if(ps!= null){
					ps.close();
				}
				if(conn!=null){
				    conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		}

		
		
		
	
//ͨ��ID �ж�student�Ƿ���� �������򷵻ظ�ID��student	
	public Student fun(int id){
		try {
			Student stu = new Student();
		    String sql = "select stuID from tb_student";
		    ps = conn.prepareStatement(sql);
		    rs = ps.executeQuery();
		    while(rs.next()){
		    	if(rs.getInt("stuID") == id){
		    		stu.setStuName(rs.getString("stuName"));
					stu.setStuAge(rs.getInt("stuAge"));
					stu.setStuSex(rs.getString("stuSex"));
					stu.setStuTel(rs.getString("stuTel"));
					stu.setDeptID(rs.getInt("deptID"));
		    	}
		    }
		    return stu;
		} catch (SQLException e) {
			System.out.println("����");
			return null;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
