package builtinclass;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		//시간 - 시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//요일 - //1-일, 2-월, 3-화... 6-토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//현재 시간 시간 측정 - 1970. 1. 1 자정이후 ms 기준
		long time = cal.getTimeInMillis();
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		System.out.println(day); 
		System.out.println(time + "ms");
		System.out.println(time/1000 + "초");
	}
}
