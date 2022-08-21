package lab5;

import java.util.Scanner;

class EmployeeException extends Exception{
	
}
public class Exercise3 {
	/*Create an Exception class named as “EmployeeException”(User defined Exception) 
in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is 
below than 3000. Use Exception Handling mechanism to handle exception properly.
*/
	int sal;
	Exercise3(int sal){
		this.sal = sal;
	}
	
	public static void main(String[] args) throws EmployeeException
	{
		//calling the function validate salary
		System.out.println("Enter your salary: ");
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		Exercise1 x1 = new Exercise1(sal);
		validateSalaray(sal);
		sc.close();
	}
	
	public static void validateSalaray(int salary) {
		try {
			if(salary<3000) {
				throw new EmployeeException();
			}
			
		} catch(EmployeeException e) {
			System.out.println("Enter salary more than 3000");
		}
	}
}
