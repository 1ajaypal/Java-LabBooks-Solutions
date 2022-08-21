package com.cg.eis.pl;

import java.util.Scanner;

public abstract class Service implements EmployeeService {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double salary=sc.nextDouble();
       String designation = sc.nextLine();
       sc.close();
       

	}

}