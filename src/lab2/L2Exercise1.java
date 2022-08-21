package lab2;
import java.util.*;
/*Create a method which accepts an array of integer elements and return the second 
			smallest element in the array
*/
public class L2Exercise1 {
	
		static int getSecondSmallest() {
			int [] arr = new int[]{10, 3, 9, 45, 6};
			//unsorted
			System.out.println("Unsorted: ");
			for(int un: arr) {
				System.out.print(un +" ");
			}
			System.out.println("\nSorted: ");
			Arrays.sort(arr);
			
			for(int s: arr) {
				System.out.print(s +" ");
			}
			
			return arr[1];
		}
		
		public static void main(String[] args) {
			int a = getSecondSmallest();
			System.out.println("\nSecond smallest element is = " + a);
		}
}

