package lab3;
import java.util.Scanner;
/*import java.util.Collections;
import java.util.List;

import java.util.StringTokenizer;*/

/*Create a class containing a method to create the mirror image of a String. The 
method should return the two Strings separated with a pipe(|) symbol .
*/
public class Exercise2 {
	
	static String getImage(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		System.out.println(str +"|"+getImage(str));
		sc.close();
		}
}
