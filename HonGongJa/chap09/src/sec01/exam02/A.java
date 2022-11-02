package sec01.exam02;

public class A {

	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B(); 인스턴스 멤버 클래스는 정적 필드의 초기값에서 생성 불가
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B(); 인스턴스 멤버 클래스는 정적 메소드에서 생성 불가
		C var2 = new C();
	}
	
	
	class B {}
	
	static class C {}
}
