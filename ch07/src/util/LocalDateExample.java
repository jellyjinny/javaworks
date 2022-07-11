package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {

		//LocalDate, LocalTime 클래스 사용
		LocalDate localDate = LocalDate.now(); //대한민국 표준날짜
		System.out.println(localDate);     
		
		LocalTime localTime = LocalTime.now(); //대한민국 표준시간
		System.out.println(localTime);     
		
		LocalDateTime now = LocalDateTime.now();  //대한민국 표준 날짜/시간
		System.out.println(now);
		
		//날짜 / 시간 형식 설정
	    DateTimeFormatter myFormat = 
	    		DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");  
	    
	    String formattedDate = now.format(myFormat);  
	    System.out.println(formattedDate);  
	}

}