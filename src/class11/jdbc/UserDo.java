package class11.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import class11.user.User;

public class UserDo {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	//查询
	public List<User> findUser(String username,String userpass){
		String sql = "select * from tb_users where name = ? and pass = ?";
		List<User> list = null;
		try{
			conn = ConnUtil.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, userpass);
			list = new ArrayList<User>();
			while(rs.next()){
				User user = new User();
				user.setUsername(rs.getString("name"));
				user.setUserpass(rs.getString("pass"));
				list.add(user);
			}
		}catch(Exception e){
			System.out.println("查询失败！");
		}finally{
			ConnUtil.close(conn, ps, rs);
		}
		return list;
	}
	
	public void add(User user){
		String sql = "insert into tb_users(userID,userName,userPass) values(default,?,?)";
		try{
		    ps = conn.prepareStatement(sql);
		    ps.setString(1, user.getUsername());
		    ps.setString(2, user.getUserpass());
		    int i = ps.executeUpdate();
			System.out.println("添加成功！user表添加了"+i+"条记录");
		}catch(Exception e){
			System.out.println("添加失败！");
		}finally{
			ConnUtil.close(conn, ps, null);
		}
	}
	
	public void delete(int id){
		String sql = "delete from tb_user where id = ?";
		try{
		    ps = conn.prepareStatement(sql);
		    ps.setInt(1, id);
		    int i = ps.executeUpdate();
			System.out.println("删除成功！user表删除了"+i+"条记录");
		}catch(Exception e){
			System.out.println("删除失败！");
		}finally{
			ConnUtil.close(conn, ps, null);
		}
		
	}

}
