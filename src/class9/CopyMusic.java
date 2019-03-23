package class9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//2.	拷贝一个MP3文件到指定位置
public class CopyMusic {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("a.mp3");
		FileOutputStream fos = new FileOutputStream("a(1).mp3");
		byte buf[] = new byte[1024];
		int len = 0;
		while((len = fis.read(buf)) != -1){
			fos.write(buf, 0, len);
		}
		fos.close();
		fis.close();

	}

}
