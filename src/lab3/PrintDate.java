package lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintDate {
	public static void main(String[] args)
	{
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();
		//for date 
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		//for time
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		//printing date and time
		System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
	    System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
	}
}
