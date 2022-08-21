package lab6;
import java.util.*;

public class Exercise7 {
	/* Create a method which accepts an integer array, reverse the numbers in the array 
and returns the resulting array in sorted order*/
	int[] getSorted(int[] arr) 
	{
		int [] revarr= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			String s= String.valueOf(arr[i]);
			StringBuffer sbf = new StringBuffer(s);
			sbf.reverse();
			String res=sbf.toString();
			int n=Integer.parseInt(res);
			revarr[i]=n;
			
		}
		 Arrays.sort(revarr);;
		 return revarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("number of elements");
		int n = sc.nextInt();
		int [] arr=new int[n];
		for(int i =0;i<n;i++) {
		arr[i]=sc.nextInt();	
		}
		Exercise7 e7=new Exercise7();
		int [] revarr=new int[n];
		revarr=e7.getSorted(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(revarr[i] +" ");
		}
		
		
		

	}
}
