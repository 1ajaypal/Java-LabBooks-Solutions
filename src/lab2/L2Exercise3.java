package lab2;

import java.util.Arrays;
import java.util.Scanner;

/*: Create a method which accepts an integer array, reverse the numbers in the array 
and returns the resulting array in sorted order*/
public class L2Exercise3 {
	
		int n;
		int[] arr;
		L2Exercise3(int n)
		{
			this.n = n;
		}
		
		//method getSorted - Method 1
		int[] getSorted1(int[] arr)
		{
			StringBuffer[] results = new StringBuffer[arr.length];
			int [] intResults = new int[arr.length];
			
			for(int i=0; i<arr.length;i++) 
			{
				results[i] = new StringBuffer(Integer.toString(arr[i])).reverse();
				intResults[i] = Integer.parseInt(results[i].toString());
			}
			Arrays.sort(intResults);
			return intResults;
		}
	   //method getSorted 2
		int[] getSorted2(int[] arr)
		{
			for(int i=0; i<n; i++)
			{
				int k = arr[i], d=0, r=0;
				while(k>0)
				{
					d = k%10;
					r = r*10 +d;
					k = k/10;
				}
				arr[i] = r;
			}
			Arrays.sort(arr);
			return arr;
		}
	
	public static void main(String[] args) {
		
		  System.out.println("Enter the number of elements you want to store in array of integers : ");  
		  Scanner sc = new Scanner(System.in);
		  int n=sc.nextInt();  
		  int[] intArray = new int[n];  
		  System.out.println("Enter the elements of the array: ");  
		  for(int i=0; i<n; i++)  
			   {  
			    intArray[i]=sc.nextInt();  
			   }  
		  L2Exercise3 x3 = new L2Exercise3(n);
		  int [] s1 = x3.getSorted1(intArray);
		  int [] s2 = x3.getSorted2(intArray);
		  for(int i=0; i<n ; i++) {
			  System.out.println(s1[i] + " ");
		  }
		  for(int i=0; i<n ; i++) {
			  System.out.println(s2[i] + " ");
			  sc.close();
		  }
	}
}
