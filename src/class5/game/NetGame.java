package class5.game;
/*1．	创建游戏类NetGame，其中包含：
a)	私有属性：gameName、gameServer、gameLevel
b)	方法：
i.	3个给属性赋值的方法，要求：服务器只能是“联通”、“电信”、“铁通”、“国外”，默认为联通，
           等级必须是大于等于0的整数，当等级无效时，默认为0级
ii.	3个返回属性值的方法
iii.	group(int person)：实现游戏组团的功能，显示该游戏需要多少个人才能组团，人数通过参数接受
*/
public class NetGame {
	private String gameName;
	private String gameServer;
	private int gameLevel;
	
	public String getGameName() {
		return this.gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameServer() {
		return this.gameServer;
	}
	public void setGameServer(String gameServer) {
		if("联通".equals(gameServer) || "电信".equals(gameServer) || "铁通".equals(gameServer) || "国外".equals(gameServer)){
			this.gameServer = gameServer;
		}
		else{
			this.gameServer = "联通";
		}
		
	}
	public int getGameLevel() {
		return this.gameLevel;
	}
	public void setGameLevel(int gameLevel) {
		if(gameLevel >= 0){
			this.gameLevel = gameLevel;
		}
		else{
			this.gameLevel = 0;
		}
		
	}
	
	public int group(int person){
		return person;
	}
	
	public void show(){
		System.out.println("游戏名："+this.gameName+" 游戏服务器："+this.gameServer+" 游戏等级："+this.gameLevel);
	}

}
