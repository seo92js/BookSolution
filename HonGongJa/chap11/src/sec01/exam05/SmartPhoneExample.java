package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		
		System.out.println(strObj);
		
		System.out.println(myPhone); //객체를 주면 객체의 toString() 메소드를 호출해서 리턴값을 받아 출력한다.
	}

}
