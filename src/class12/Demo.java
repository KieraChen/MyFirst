package class12;

public class Demo {
	static int value = 9; //ע��value�Ǿ�̬�ĳ�Ա����
    public static void main(String[] args) throws Exception{
    	new Demo().printValue();
    }
    private void printValue(){
        int value = 69;
        System.out.println(this.value);
    	
    }

}
