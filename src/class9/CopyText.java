package class9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//1.	拷贝一个文本文件到指定位置
public class CopyText {

	public static void main(String[] args)/* throws Exception */{
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("note.txt");
			fw = new FileWriter("note(1).txt");
			char buf[] = new char[1024];
			int len = 0;
			while((len = fr.read(buf)) != -1){
				fw.write(buf, 0, len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				 if(fw != null){
				    fw.close();
				}if(fr != null){
					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

	}

}
