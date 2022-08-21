package lab3;
import java.util.*;
/*Create a method that accepts a number and modifies it such that the each of the 
digit in the newly formed number is equal to the difference between two consecutive digits in the 
original number. The digit in the units place can be left as it is. 
Note: Take the absolute value of the difference. Ex: 6-8 = 2
*/
public class Exercise4 {
	int modifyNumber(int n) {
		//converting integer to string method1
		String str = Integer.toString(n);
		StringBuffer sb = new StringBuffer(str);
		
        for(int i=1; i<str.length()-1;i++) {
        	sb.deleteCharAt(i);
        	sb.insert(i-1, (Math.abs(str.charAt(i-1)-str.charAt(i))));
        }
        int num = Integer.parseInt(sb.toString());
        
        return num;
		
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		Exercise4 mN = new Exercise4();
		System.out.println(mN.modifyNumber(n));
		sc.close();
		}
}



