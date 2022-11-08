package sec02.exam03;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		//필드값으로 익명 객체 대입.
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener); //매개값으로 필드 대입.
		button2.setOnClickListener(new Button.OnClickListener() {
			//매개값으로 익명 객체 대입.
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
