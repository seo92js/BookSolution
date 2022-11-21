package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			OutputStream os = new FileOutputStream("d:/test2.db");
			
			byte[] array = {10, 20, 30};
			
			os.write(array); //배열의 모든 바이트
			
			os.flush();
			os.close();
			
		}catch(Exception e) {
			
		}
	}

}
