package lab5;

import java.util.Scanner;


/*Validate the age of a person and display proper message by using user defined 
exception. Age of a person should be above 15.*/
/*class ageException extends Exception{
	public ageException (int msg) {
		super();*/
	


public class Exercise1 {
//Exception handling
	
	int age;
	Exercise1(int age){
		this.age = age;
	}
	
	public static void validateAge(int age)
	{
		try 
		{
			if(age<=15)
			{
				//throw Arithmatic exception please enter a valid age above 15
				throw new ArithmeticException("Person is not eligible");
				//System.out.println("You are not  eligible for scheme");
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("You are below 15 , so not eligible for scheme");
		}
	}
	
	public static void main(String[] args) //throws ageException
	{
		//calling the function validate age
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Exercise1 x1 = new Exercise1(n);
		validateAge(n);
		sc.close();
	}
}
