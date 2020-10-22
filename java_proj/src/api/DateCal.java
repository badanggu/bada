package api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCal {
	//멤버변수
	String name;
	Date date;
//생성자
	public DateCal(String name, Date date) {
	
		this.name=name;
		this.date=date;
		
		}
//출력
	public void viewTime() {
	
		/*날짜출력포맷*/
		SimpleDateFormat sdf= new SimpleDateFormat("YYYY年  MM月 DD日 hh:mm:ss");
		//출력
		System.out.printf("%s이 접속한 시각은 %s입니다\n",this.name,sdf.format(this.date));
	}


}
