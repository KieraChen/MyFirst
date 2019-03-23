package class12;

public class Demo {
	static int value = 9; //注意value是静态的成员变量
    public static void main(String[] args) throws Exception{
    	new Demo().printValue();
    }
    private void printValue(){
        int value = 69;
        System.out.println(this.value);
    	
    }

}
