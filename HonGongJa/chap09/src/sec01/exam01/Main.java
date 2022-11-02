package sec01.exam01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		// 정적 멤버 클래스 객체를 생성하기 위해서는 A객체를 생성할 필요가 없다.
		A.C c = new A.C();
		c.field1 = 3; //인스턴스 필드 사용
		c.method1(); //인스턴스 메소드 사용
		A.C.field2 = 3; //정적 필드 사용
		A.C.method2(); //정적 메소드 사용
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}

}
