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
	
	//1)连接数据库
	public ConnectToServer(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println("注册驱动失败！");
		} catch (SQLException e) {
			System.out.println("连接数据库失败！请检查地址，用户名及密码！");
		}
		System.out.println("注册驱动及连接数据库成功！");
	}
	//2)判断用户名是否已被注册
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
			System.out.println("判断用户名是否已被注册错误！");
			return false;
		}
		
	}
	/*3完成注册功能，调用usernameExiste（），判断用户名是否可用，
	如果可以方可注册，如果注册成功，则返回true，否则返回false；*/
	public boolean registe(User user){
		if(usernameExiste(user.getUsername())){
			System.out.println("用户名已存在或错误！");
			return false;
		}else{
			String sql = "insert into tb_users(userID,userName,userPass) values(default,?,?)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, user.getUsername());
				ps.setString(2, user.getUserpass());
				int i = ps.executeUpdate();
				System.out.println("注册成功！user表添加了"+i+"条记录");
				return true;
			} catch (SQLException e) {
				System.out.println("注册错误！");
				return false;
			}
		}
	}
	//4完成登录功能，如果登录成功，则返回true，否则返回false；
	public boolean login(User user){
		String sql = "select * from tb_users where userName=? and userPass=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getUserpass());
			rs = ps.executeQuery();
			if(rs.next()){ 
				System.out.println("登录成功！");
				return true;
			}else{
				System.out.println("登录失败！");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("登录错误！");
			return false;
		}

	}
	//5完成修改密码功能，如果修改成功，则返回true，否则返回false；
	public boolean changePassword(User user,String newPassword){
		String sql = "update tb_job SET userPass=? WHERE userName=? and userPass=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getUserpass());
			int i = ps.executeUpdate();
			System.out.println("密码修改成功！user表修改了"+i+"条记录！");
			return true;
		} catch (SQLException e) {
			System.out.println("密码修改错误！");
			return false;
		}
	}
	//6判断参数代表的院系名字是否存在，如果存在则返回true，否则返回false；
	public boolean deptNameExiste (String name){
		String sql = "select * from tb_department where cName = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();
			if(rs.next()){
				System.out.println("存在！");
				return true;
			}
			else{
				System.out.println("不存在！");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("判断参数代表的院系名字是否存在错误！");
			return false;
		}
	}
	/*7)public boolean addDepartment(Department dept)：完成添加新学院的功能，
	调用deptNameExiste()，判断院系是否存在，如果存在则给出相应提示，并返回false，
	添加成功则返回true，否则返回false；*/
	public boolean addDepartment(Department dept){
		if(deptNameExiste(dept.getDeptName())){
			System.out.println("院系名已存在或错误！");
			return false;
		}else{
			String sql = "insert into tb_department(cID,cName) values(default,?)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, dept.getDeptName());
				int i = ps.executeUpdate();
				System.out.println("添加院系成功！department表添加了"+i+"条记录");
				return true;
			} catch (SQLException e) {
				System.out.println("添加院系错误！");
				return false;
			}
		}
	}
/*	8)	：完成添加新学生信息的功能，添加成功则返回true，否则返回false；*/
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
			System.out.println("请选择院系：");
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
			System.out.println("添加学生成功！student表添加了"+j+"条记录");
			return true;
		} catch (SQLException e) {
			System.out.println("添加学生错误！");
			return false;
		}
	}
/*	9)	：判断该学生是否存在，如果存在，则删除，并返回true，否则返回false*/
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
				System.out.println("存在！");
				sql = "delete from tb_student where stuName =? and stuAge =? and stuSex =? and stuTel =? and deptID =?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, stu.getStuName());
				ps.setInt(2, stu.getStuAge());
				ps.setString(3, stu.getStuSex());
				ps.setString(4, stu.getStuTel());
				ps.setInt(5, stu.getDeptID());
				int i = ps.executeUpdate();
				System.out.println("删除学生成功！student表删除了"+i+"条记录");
				return true;
			}
			else{
				System.out.println("不存在！");
				return false;
			}
		} catch (SQLException e) {
			System.out.println("判断学生是否存在错误或删除学生错误！");
			return false;
		}
	}
/*	10)	：根据性别查找学生，判断该性别的学生是否存在，
 * 如果存在，则将满足条件的学生存放到集合中，返回该集合，若不存在，则返回空集合*/
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
			System.out.println("查找错误！");
			return list;
		}
	}
/*	11)根据年龄查找学生，判断满足年龄范围内的学生是否存在，
 * 如果存在，则将满足条件的学生存放到集合中，返回该集合，若不存在，则返回空集合*/
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
			System.out.println("查找错误！");
			return list;
		}
	}
/*	12)	：将所有学生信息放置到集合中，返回该集合，并将查询出来的所有学生信息写入一个文件中。*/
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
			System.out.println("查找错误！");
			return list;
		} catch (IOException e) {
			System.out.println("写入错误！");
			return null;
		}finally{
			try {
				if(bw != null){
					bw.close();
				}	
			} catch (IOException e) {
				System.out.println("关闭错误！");
			}
		}
	}
/*	13)	：将所有院系信息放置到集合中，返回该集合*/
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
			System.out.println("查找错误！");
			return list;
		}
		
	}
/*	14)	：根据参数的id，查找对应id的院系名字，返回院系名*/
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
			System.out.println("查找错误！");
			return result;
		}
	}
/*	15)	：关闭Connection对象*/
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

		
		
		
	
//通过ID 判断student是否存在 ，存在则返回该ID的student	
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
			System.out.println("错误！");
			return null;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
