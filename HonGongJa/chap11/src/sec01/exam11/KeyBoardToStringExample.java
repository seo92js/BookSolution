package sec01.exam11;

import java.io.IOException;

public class KeyBoardToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] bytes = new byte[100];
		

		System.out.print("입력 : ");
		
		try {
			int readByteNo = System.in.read(bytes);
			
			String str = new String(bytes, 0, readByteNo - 2); //캐리지리턴 \r 라인피드 \n 제외
			
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외");
		}
	}

}
