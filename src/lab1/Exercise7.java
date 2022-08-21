package lab1;
import java.util.*;
/*Exercise 6: Create a class with a method to find the difference between the sum of the squares 
and the square of the sum of the first n natural numbers.
A number is said to be an increasing number if 
no digit is exceeded by the digit to its left. 
For Example : 134468 is an increasing number
*/
public class Exercise7 {
	int number;
	Exercise7(int number){
		this.number = number;
	}
	boolean checkNumber(){
		
		int temp = number;
		//Storing the first digit
		int dig1 = temp%10;
		temp = temp/10;
		//flag to store the result
		boolean flag = true;
		
		//loop that iterates through all the digits
		while(temp>0) {
			//checking if all digits are in ascending order
			if(dig1<=(temp%10)) {
				flag = false;
				break;
			}
			dig1 = temp%10;
			temp = temp/10;
		}
		//printing the result
		return flag;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter value of number to check that numbers are in  increasing order: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		Exercise7 b = new Exercise7(number);
		boolean check = b.checkNumber();
		System.out.println(check);
		sc.close();
		
	}
	
}
