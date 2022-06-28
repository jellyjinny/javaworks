package builtinclass;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		//시간 - 시, 분, 초 
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		System.out.println(day);  //1-일, 2-월, 3-화, 4-수, 5-목, 6-금, 7-토
	}
}
