package lab1;
import java.util.Scanner;

/*: Create a method to check if a number is a power of two or not*/
public class Exercise8 {
	int num;
	Exercise8(int num){
		this.num = num;
	}
	
	boolean powerOfTwo() {
		int temp = num;
		int i=0, pow=0;
		boolean flag = false;
        //loop to check power of 2
        
        while(pow<=num) 
        {
        	pow =(int)Math.pow(2, i);
        	//flag = false;
        	if(temp == pow ) 
        	{
        		flag = true;
        		break;
        	}     	
        	//else
        		//flag = false;
        	
        	i++;
        }
        return flag;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number to check the power of two: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		
		Exercise8 b = new Exercise8(num);
		boolean check = b.powerOfTwo();
		System.out.println(check);
		sc.close();
		
	}
}
