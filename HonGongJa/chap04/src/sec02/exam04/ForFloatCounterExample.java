package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 9번 실행됨
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}

}
