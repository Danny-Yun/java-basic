package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	
	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스이다. DB등과 통신할 때 Date를 이용해 날짜 자료를 받아오거나 넘겨주는 것이 권장된다.
		// 사용시 import java.util.Date를 해야 함.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀 때 SimpleDateFormat을 활용한다.
		// 마찬가지로 import 필요
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}
