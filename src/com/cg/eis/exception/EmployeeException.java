package com.cg.eis.exception;
import java.util.Scanner;
public class EmployeeException 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		sc.close();
		try 
		{
			if(salary<3000)
			{
				throw new UserDefinedException("Not valid");
			}
		}
		catch(UserDefinedException e) 
		{
			e.printStackTrace();
		}
		if(salary>=3000) 
		{
			System.out.println("Salary is valid");
			sc.close();
		}
		
	}
}
class UserDefinedException extends Exception
{
		UserDefinedException(String message)
		{
			super(message);
		}
}