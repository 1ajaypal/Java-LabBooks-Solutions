package lab6;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Exercise2 {
/*Create a method that accepts a character array and count the number of 
times each character is present in the array.
*/
	Map<Character, Integer> countChars(char[] arr1){
		HashMap<Character,Integer> map =new HashMap<Character,Integer>();
		
		char [] checkarr=new char [arr1.length];
		for(int i=0;i<arr1.length;i++) 
		{
			int count=1;
			for(int j=0;j<checkarr.length;j++) 
			{
				if(arr1[i]==checkarr[j]) 
				{
					break;
				}
				else 
				{
				checkarr[j]=arr1[i];
				for(int k=i;k<arr1.length;k++) 
				{
					if(arr1[k]==arr1[i])
						count++;
				}
				}
				break;
			}
			map.put(arr1[i], count);
			}
		return map;
		}
		
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		
		Exercise2 ex2 = new Exercise2();
		System.out.println(ex2.countChars(arr));
		sc.close();
	}
}
