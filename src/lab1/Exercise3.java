package lab1;
import java.util.*;
/*Exercise 3: The Fibonacci sequence is defined by the following rule. The first 2 values in the 
sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java 
program that uses both recursive and non-recursive functions to print the nth value of the 
Fibonacci sequence?*/
public class Exercise3 
{
	public static void main(String[] args) 
	{
		//non-recursive
		System.out.println("Enter the value of count : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num1=1, num2=1, num3;
		System.out.println(num1 + " " + "\n" + num2); //printing 1 and 1
		for(int i=2; i<=count-1; i++) 
			{
			num3 = num1 +num2;
			//System.out.println( " " + num3); //loop starts after to because the num1 and num2 are already printed
			num1=num2;
			num2=num3;
			System.out.println( "" + num3);
			}
		
		sc.close();
	}
}