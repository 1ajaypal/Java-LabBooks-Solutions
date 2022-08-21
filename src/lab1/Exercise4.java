package lab1;
import java.util.*;


public class Exercise4 {
	public static void main(String[] args) {
		/*Write a Java program that prompts the user for an integer and then prints out all the 
		prime numbers up to that Integer?*/
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		
		int i, j, chk;
	    
	    System.out.println("Prime Numbers from 1 to " + number);
	     for(i=2; i<=number; i++)
	     {
	         chk = 0;
	         for(j=2; j<i; j++)
	         {
	            if(i%j==0)
	            {
	               chk++;
	               break;
	            }
	        }
	         if(chk==0)
	            System.out.println(i);
	     }
	}
}
