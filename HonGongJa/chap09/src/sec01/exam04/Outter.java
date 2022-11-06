package sec01.exam04;

public class Outter {

	//자바 7 이전.
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; final
		//localVariable = 100; final
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후.
	public void method2(int arg) {
		int localVariable = 1;
		//매개변수와 로컬변수를 로컬 클래스 내부에서 사용할 때 매개 변수와 로컬 변수가 final 특성을 갖고 있음.
		//arg = 100;
		//localVariable = 100;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
