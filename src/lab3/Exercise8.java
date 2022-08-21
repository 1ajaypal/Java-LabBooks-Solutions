package lab3;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

/*Create a method that accepts a String and checks if it is a positive string. A string is 
considered a positive string, if on moving from left to right each character in the String comes 
after the previous characters in the Alphabetical order. For Example: ANT is a positive String 
(Since T comes after N and N comes after A). The method should return true if the entered string 
is positive.*/

public class Exercise8 {
	
	static boolean positiveString(String s) {
		int n = s.length();
		
		//creating a char array of string length
		char c[] = new char[n];
		
		//assign string to char array-------
		for(int i=0; i<n;i++) 
		{
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		
		//check if the character array is equal to string or not
		for(int i=0; i<n;i++)
		{
			if(c[i] != s.charAt(i))
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		if(positiveString(str))
			System.out.println("Positive String");
		else
			System.out.println("Not a Positive String");
		sc.close();
		}
}
