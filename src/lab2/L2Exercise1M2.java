package lab2;
import java.util.*;

public class L2Exercise1M2 {
	 {
	  /** Create a method which accepts an array of integer elements and return the second 
	smallest element in the array*/
	  //L2Exercise1M2()
	  {
	   int n;
	   System.out.println("Enter the number of elements you want to store : ");  
	   Scanner sc = new Scanner(System.in);
	   n=sc.nextInt();  
	   sc.close();
	   int[] x = new int[n];  
	   
	   System.out.println("Enter the elements of the array: ");  
	   for(int i=0; i<n; i++)  
		   {  
		    x[i]=sc.nextInt();  
		   }  
	   System.out.println("Second smallest element is : " + getSecondSmallest(x));
	  }  
	 }
	  
	  int getSecondSmallest(int[] x) {
		   Arrays.sort(x);
		   return (x[1]);
	  
	 }


	public static void main(String[] args) {
		L2Exercise1M2 x = new L2Exercise1M2();
		
	}
}