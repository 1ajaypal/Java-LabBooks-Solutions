package lab1;
//Create a method to find the sum of the cubes of the digits of an n digit number
import java.util.*;
public class Exercise1 {
	public static void main(String[] args) {
		
		System.out.println("Enter a 'n' digit number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n>0) {
			int mod = n%10;
			//sum= sum + mod*mod*mod;
			sum = sum + (int)Math.pow(mod,3);
			
			n = n/10;
		}
		System.out.println("Sum of the cubes of the n digits of number is :" + sum);
		sc.close();
	}
}

