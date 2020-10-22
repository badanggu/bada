package example;

public class Button {
	OnClickListener listener;
	void setOnClickListener(OnClickListener listener) { //setter 메소드 setOnclicklistener() 로 구현객체를 받아 필드에 대입
		this.listener=listener;}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener{
		void onClick();
	}
}
