package remd.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하시오.");
		System.out.print("년 : ");
		int year = sc.nextInt();
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		System.out.println("입력된 날짜에 대한 정보는 아래와 같습니다.");
		
		Calendar cal = new GregorianCalendar(year, month-1, day);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 M월 dd일 E요일");
		
		System.out.println(sdf.format(cal.getTime()));
		
		String result = "";
		if (( 0 == (year % 4) && 0 != (year % 100) ) || 0 == year % 400 ){
			result = "년은 윤년이다.";
		}else{
			result = "년은 윤년이 아니다.";
		}
		System.out.println(year + result);
	}

}
