package class8.list.student;
//1�������û���Users������˽�����ԣ�username,userpass,usercity;
public class Users {
	private String userName;
	private int userPass;
	private String userCity;
	
	Users(String userName,int userPass,String userCity){
		this.userName = userName;
		this.userPass = userPass;
		this.userCity = userCity;
	}

	public String getUserName() {
		return userName;
	}

	public int getUserPass() {
		return userPass;
	}

	public String getUserCity() {
		return userCity;
	}
	
	

}
