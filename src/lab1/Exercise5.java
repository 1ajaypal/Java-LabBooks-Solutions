package lab1;
import java.util.*;

/*Create a class with a method which can calculate the sum of first n natural numbers 
which are divisible by 3 or 5.*/

public class Exercise5 {
	int n;
	Exercise5(int n){
		this.n = n;
	}
	
	int calculateSum(int n)
	{
		int sum = 0;
		for(int i=1; i<=n; i++) 
		{
			if(i%3==0 || i%5==0) 
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter value of n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Exercise5 a = new Exercise5(n);
		int s = a.calculateSum(n);
		System.out.println(s);
	}
}
