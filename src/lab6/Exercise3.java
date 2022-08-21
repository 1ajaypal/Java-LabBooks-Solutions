package lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	/*Create a method which accepts an array of numbers and returns the numbers and 
their squares in Hashmap*/
	//getSquares Method
	Map<Integer, Integer> getSquares(int[] array) 
	{
		HashMap<Integer,Integer> square = new HashMap<>();
		for(int i=0;i<array.length;i++) 
		{
			square.put(array[i], (array[i]*array[i]));
		}
		return square;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter size of array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Exercise3 ex3= new Exercise3();
		System.out.println(ex3.getSquares(arr));
		sc.close();
		

	}
}
