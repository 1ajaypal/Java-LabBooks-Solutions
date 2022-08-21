package lab6;
import java.util.*;

public class Exercise5 {
	/*Create a method which accepts an array of integer elements and return the second 
smallest element in the array*/
		int getSecondSmallest(int [] arr) 
		{
		Arrays.sort(arr);
		return arr[1];
		}

		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Number of elements");
			int n = sc.nextInt();
			//for taking array input
			int [] arr = new int[n];
			for(int i= 0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
			}
			Exercise5 ex5= new Exercise5();
			System.out.println(ex5.getSecondSmallest(arr));
			sc.close();
		}
}
