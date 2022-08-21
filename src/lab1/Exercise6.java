package lab1;
import java.util.*;

/*Exercise 6: Create a class with a method to find the difference between the sum of the squares 
and the square of the sum of the first n natural numbers.
*/
public class Exercise6 {
	int n;
	Exercise6(int n){
		this.n = n;
	}
	
	
	int calculateDifference(int n) {
		int sum1 =0, sum2=0;
		for(int i=0; i<=n;i++) {
			sum1 = sum1 + (int)Math.pow(i,2);
			sum2 = sum2 + i;
		}
		int diff = sum1 - (sum2 * sum2);
		return diff;
	}
	public static void main(String[] args) {
		System.out.println("Enter value of n : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		Exercise6 b = new Exercise6(n);
		int diffe = b.calculateDifference(n);
		System.out.println(diffe);
		sc.close();
		
	}
}
