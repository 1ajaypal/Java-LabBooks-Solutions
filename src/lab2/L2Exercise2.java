package lab2;
import java.util.Arrays;
import java.util.Scanner;

/*Create a method that can accept an array of String objects and sort in alphabetical 
order. The elements in the left half should be completely in uppercase and the elements in the 
right half should be completely in lower case. Return the resulting array.*/
public class L2Exercise2 {
	
	{
		int n;
		  System.out.println("Enter the number of elements you want to store in array of strings : ");  
		  Scanner sc = new Scanner(System.in);
		  n=sc.nextInt();  
		  String[] x = new String[n];  
		  System.out.println("Enter the elements of the string array: ");  
		  for(int i=0; i<n; i++)  
			   {  
			    x[i]=sc.next();  
			   }  
		  //printing sorted array
		  System.out.println("\nSorted: ");
			Arrays.sort(x);
			for(String s: x) {
				System.out.print(s +" ");
			}
		  System.out.println("\nRequired array is  : " + Arrays.toString(sortStrings(x)));
	}
	
	String[] sortStrings(String[] x)
		  {
		   int b,n,i=0;
		   n = x.length;
		   if(n%2==1)
		    b=(int)(n/2);
		   else
		    b=(int)n/2;
		   Arrays.sort(x);
		   for(i=0;i<n;i++)
		   {
		    if(i<=b || (i==0))
		     x[i]=x[i].toUpperCase();
		    else if((i>b))
		     x[i]=x[i].toLowerCase();
		   }
		   return(x);
		   
		  }
		
	
	public static void main(String[] args) {
		L2Exercise2 x = new L2Exercise2();
		
	}
	
}

