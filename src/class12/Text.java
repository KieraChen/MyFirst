package class12;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = null;
		for(int i = 0;i < 7;i++){
			int num = (int)(Math.random()*35+1);
			result = result + " "+ num ;
			}
		System.out.println(result);

	}

}
