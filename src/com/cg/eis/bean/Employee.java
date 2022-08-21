package com.cg.eis.bean;
import java.util.*;

public class Employee {
		// Fields
		private int empId;
		private String empName;
		private float empSal;
		private String empDesignation;
		private String empInsScheme;
		
		// Constructors 
		public Employee(int i, String string, String string2, int j) {}
		public Employee(int empId, String empName, float empSal , String empDesignation, String empInsScheme ) 
		{
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSal = empSal;
			this.empDesignation = empDesignation;
			this.empInsScheme = empInsScheme;
		}
		
		//getters and setters
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public float getEmpSal() {
			return empSal;
		}
		public void setEmpSal(float empSal) {
			this.empSal = empSal;
		}
		public String getEmpDesignation() {
			return empDesignation;
		}
		public void setEmpDesignation(String empDesignation) {
			this.empDesignation = empDesignation;
		}
		public String getEmpInsScheme() {
			return empInsScheme;
		}
		public void setEmpInsScheme(String empInsScheme) {
			this.empInsScheme = empInsScheme;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("1. Add employee");
			System.out.println("2. Update employee");
			System.out.println("3. Delete employee");
			System.out.println("4. View Schemes");
			
			System.out.println("Choose an option");
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter ID");
				int id = sc.nextInt();
				
				System.out.println("Enter employee name");
				String name =sc.nextLine();
				
				System.out.println("Enter employee salary");
				float salary = sc.nextFloat();
				
				System.out.println("Enter designation");
				String dsg=sc.nextLine();
				
				String insscheme=null;
				if(salary>5000 && salary<20000 && dsg.equalsIgnoreCase("System Associate")) {
					insscheme="Scheme C";
				
				}
				Employee emp= new Employee(id, name, salary, dsg, insscheme);
			
			
			}

		}


		
}
