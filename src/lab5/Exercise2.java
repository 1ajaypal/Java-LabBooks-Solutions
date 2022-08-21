package lab5;

import java.util.Scanner;

/* Write a Java Program to validate the full name of an employee. Create and throw a 
user defined exception if firstName and lastName is blank.
*/
class NameException extends Exception
{
	
}

public class Exercise2 {
		//Exception handling
			
			String fname;
			String lname;
			Exercise2(String fname, String lname){
				this.fname = fname;
				this.lname = lname;
			}
			
			public static void validateName(String firstName, String lastName )
			{
				try 
				{
					if(firstName.isEmpty() || lastName.isEmpty())
					{
					
						throw new NameException();
					}
					else
					{
						System.out.println("Your full name is: " + firstName + " " + lastName  );
					}
				}
				catch(NameException e)
				{
					System.out.println("Invalid name");
				}
			}
			
			public static void main(String[] args) throws NameException
			{
				//calling the function validate name
				System.out.println("Enter your firstname: ");
				Scanner sc = new Scanner(System.in);
				String fname = sc.next();
				//System.out.println("Enter your lastname: ");
				String lname = sc.next();
				Exercise2 x1 = new Exercise2(fname , lname);
				validateName(fname, lname);
				sc.close();
			}
		
}
