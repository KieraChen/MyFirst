package class5.game;
/*1��	������Ϸ��NetGame�����а�����
a)	˽�����ԣ�gameName��gameServer��gameLevel
b)	������
i.	3�������Ը�ֵ�ķ�����Ҫ�󣺷�����ֻ���ǡ���ͨ���������š�������ͨ���������⡱��Ĭ��Ϊ��ͨ��
           �ȼ������Ǵ��ڵ���0�����������ȼ���Чʱ��Ĭ��Ϊ0��
ii.	3����������ֵ�ķ���
iii.	group(int person)��ʵ����Ϸ���ŵĹ��ܣ���ʾ����Ϸ��Ҫ���ٸ��˲������ţ�����ͨ����������
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
		if("��ͨ".equals(gameServer) || "����".equals(gameServer) || "��ͨ".equals(gameServer) || "����".equals(gameServer)){
			this.gameServer = gameServer;
		}
		else{
			this.gameServer = "��ͨ";
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
		System.out.println("��Ϸ����"+this.gameName+" ��Ϸ��������"+this.gameServer+" ��Ϸ�ȼ���"+this.gameLevel);
	}

}
