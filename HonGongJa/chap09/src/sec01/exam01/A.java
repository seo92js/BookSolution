package sec01.exam01;

// 바깥 클래스
class A {

	A() {System.out.println("A 객체가 생성됨");}
	
	// 인스턴스 멤버 클래스
	class B{
		B() {System.out.println("B 객체가 생성됨");}
		
		int field1;
		//static int field2; 인스턴스 멤버 클래스이기 때문에 정적 필드 선언 불가.
		void method1() {}
		//static void method2(){} 인스턴스 멤버 클래스이기 때문에 정적 메소드 선언 불가.
	}
	
	// 정적 멤버 클래스
	static class C{
		C() {System.out.println("C 객체가 생성됨");}
		// 정적 멤버 클래스는 모든 종류의 필드와 메소드를 선언할 수 있음.
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// 로컬 클래스
		class D{
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2; 로컬 클래스는 접근 제한자를 붙일 수 없음. 메소드 내부에서만 사용되므로
			void method1() {}
			//static void method2(){} 로컬 클래스는 접근 제한자를 붙일 수 없음. 메소드 내부에서만 사용되므로
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
