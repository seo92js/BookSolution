package sec02.exam03;

public class Button {
	OnClickListener listener; //인터페이스 타입 필
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}

	static interface OnClickListener{
		void onClick();
	}
}
