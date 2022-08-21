package lab3;

import java.util.*;
import java.time.*;

/*: Create a method to accept date and print the duration in days, months and years 
with regards to current system date.
*/
public class Exercise9 {
	public static void main(String[] args)
	{
		System.out.println("Enter the date data : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int y = sc.nextInt();
		System.out.println("Enter the month : ");
		int m = sc.nextInt();
		System.out.println("Enter the day : ");
		int d = sc.nextInt();
		
		LocalDate date1 = LocalDate.of(y, m, d);
		LocalDate now = LocalDate.now();
		
		Period diff = Period.between(date1, now);
		
		System.out.printf("Duration with respect to current system date is : %d years, %d months, %d days", diff.getYears(), diff.getMonths(), diff.getDays());
		sc.close();
	}
		
}
