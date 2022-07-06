package Lec31_Java_Util.com.lec.java.datetime05;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/*
 * java.sql.Timestamp;
 * 1970.01.01 00:00:00  GMT 기준 의 경과 시간을 ms 로 계산해 담은 객체
 */
public class DateTime05Main {

	public static void main(String[] args) {
		System.out.println("java.sql.Timestamp");

		Timestamp t;

		System.out.println("현재 ms: " + System.currentTimeMillis());
		t = new Timestamp(System.currentTimeMillis());
		System.out.println(t);

		t = new Timestamp(0L);
		System.out.println(t);
		
		
		//----------------------------------------------
		// 문자열 -> Timestamp
		// 	방법1 : 정해진 형식 + Timesatmp.valutOf()
		System.out.println("String -> Timestamp");
		String now = "2022-07-06 20:36:12.0";
		t = Timestamp.valueOf(now);
		System.out.println(t);
		
		// Timestamp --> LocalDateTime
		LocalDateTime dateTime1 = t.toLocalDateTime();
		System.out.println(dateTime1);

		// 	방법2 : String -> Date -> Timestamp 
		// TODO
		
		//----------------------------------------------
		// Timestamp -> 문자열
		// SimpleDateFormat + Timestamp:getTime()
		// tODO
		
	}

}
