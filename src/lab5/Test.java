package lab5;
import java.lang.*;
import java.util.Scanner;

class ageException extends Exception{
	public ageException(String msg){
	      super(msg);
	   }
}

public class Test {
	int age;
	
	Test(int age){
		this.age=age;
	}

	public static void main(String[] args) throws ageException{
		// TODO Auto-generated method stub
		try {
		Scanner sc= new Scanner(System.in);
		int age= sc.nextInt();
		sc.close();
		if(age<15) {
			throw new ageException("You age is below 15 years ");
		}
		//Test e1 = new Test(age);
		}
		catch(ageException e) {
			e.printStackTrace();
			
		}

	}

}