package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class Exercise4 {
	
	
	HashMap<Long, String> getStudents(HashMap<Long, Double> map) {
		Set<Map.Entry<Long, Double>> stu = map.entrySet();
		System.out.println("Eligible students for scholarship : ");
		for (Map.Entry<Long, Double> it : stu) 
		{
			if (it.getValue() >= 70) 
			{
				
				System.out.println(it.getKey() +" : "+ it.getValue());
			}
		}
		HashMap<Long,String> newmap=new HashMap<>();
		for (Map.Entry<Long, Double> it : stu) 
		{
			if(it.getValue()>=90)
			{
				newmap.put(it.getKey(), "Gold");
			}
			else if(it.getValue()>=80 && it.getValue()<90) {
				newmap.put(it.getKey(), "Silver");
			}
			else if(it.getValue()>=70 && it.getValue()<90) {
				newmap.put(it.getKey(), "Bronze");
			}
			
		}
		return newmap;
		
	}


	public static void main(String[] args) {
		
		HashMap<Long, Double> students = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of students you want to see: ");
		int n = sc.nextInt();
		int up = 999;
		Random rand = new Random();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter student " + (i + 1) + " marks :");
			double marks = sc.nextInt();
			long rd = rand.nextInt(up);
			students.put(rd, marks);
		}
		Exercise4 e4 = new Exercise4();
		System.out.println(e4.getStudents(students));
		sc.close();

	}

}
