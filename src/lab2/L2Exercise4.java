package lab2;
import java.util.*;
/*Create a method which accepts an integer array and removes all the duplicates in 
the array. Return the resulting array in descending order*/
public class L2Exercise4 {
		int n,m;
		int[] arr;
		L2Exercise4(int n)
		{
			this.n = n;
		}
	
	int[] modifyArray(int[] arr, int m) {
		
		//temporary array 1 to store values of arr
		int[] temp1 = new int[m];
		for(int i=0; i<m; i++)
		{
			temp1[i] =arr[i] ;
		}
		Arrays.sort(temp1);
		System.out.println("sorted : " + temp1);
		//temporary array 2 to store values of temp1
		int[] temp2 = new int[m];
		for(int i=m-1; i>=0;i--)
		{
			temp2[m-i-1] = temp1[i];
		}
		return temp2;
		
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the number of integers you want to print : ");
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = sc.nextInt();  
		int[] intArray1 = new int[n]; 
		int[] intArray2 = new int[n]; 
		
		System.out.println("Enter the elements of integer array: ");
		int m=0;
		for(int i=0; i<n; i++)  
			 {  
			  	intArray1[i]=sc.nextInt(); 
			  	if(map.get(intArray1[i])==null)
			  	{
			  		intArray2[m++] = intArray1[i];
			  		map.put(intArray1[i], 1);
			  	}
			  	
			 }  
		L2Exercise4 x4 = new L2Exercise4(n);
		int [] s = x4.modifyArray(intArray1 , m);
		for(int i=0; i<n ; i++) {
			  System.out.println(s[i] + " ");
			  sc.close();
		  }
		
	}
}
