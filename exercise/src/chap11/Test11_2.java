package chap11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test11_2 {

	public static void main(String[] args) {
		//Date 사용
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		String strToday = sdf.format(today);
		System.out.println(strToday);
		
		//Calendar 사용
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		
		int day = now.get(Calendar.DAY_OF_MONTH);
		String strDay = (day < 10) ? ("0" + day) : ("" + day);
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		String strHour = (hour < 10) ? ("0" + hour) : ("" + hour);
		int minute = now.get(Calendar.MINUTE);
		String strMinute = (minute < 10) ? ("0" + minute) : ("" + minute);
		
		//요일
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = days[dayOfWeek-1];
		
		System.out.println(year + "년 " + strMonth + "월 " + strDay + "일 " + 
		                   strWeek + "요일 " + strHour + "시 " + strMinute + "분 ");
	}

}