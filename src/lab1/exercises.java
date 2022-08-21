package lab1;

import java.util.Scanner;

public class exercises {
	public static class Exercise1
	{
		//Create a method to find the sum of the cubes of the digits of an n digit number
		
		Exercise1(){
			System.out.println("Enter a 'n' digit number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sum=0;
			while(n>0) 
			{
				int mod = n%10;
				//sum= sum + mod*mod*mod;
				sum = sum + (int)Math.pow(mod,3);
				n = n/10;
			}
			System.out.println("Sum of the cubes of the n digits of number is :" + sum);
			sc.close();
		}
	}
	static class Exercise3
	{
		Exercise3()
		{
			
		}
	}
	
		
}
	
	
