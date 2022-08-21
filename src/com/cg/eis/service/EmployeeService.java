package com.cg.eis.service;
import com.cg.eis.bean.*;
public interface EmployeeService {

	String insScheme(double salary, String Designation);




abstract class Service implements EmployeeService {
	
	
	@Override
	 public String insScheme(double salary, String Designation) 
	{
		if(salary>5000 && salary<20000 && Designation.equalsIgnoreCase("System Associate")) {
			return "Scheme C";
		}
		if(salary>=20000 && salary<40000 && Designation.equalsIgnoreCase("Programmer")) {
			return "Scheme B";
		}
		if(salary>=40000  && Designation.equalsIgnoreCase("Manager")) {
			return "Scheme A";
		}
		if(salary<5000 && Designation.equalsIgnoreCase("Clerk")) {
			return "No Scheme";
		}
		else 
			return "Sorry you are not eligible ";
	}
	
	public static void main(String args[]) 
	{
		Service e = new Service();
		Employee A = new Employee(123, "ajay","programmer",51000);
		String sc = e.insScheme(A.getEmpSal(), A.getEmpDesignation());
		A.setEmpInsScheme(sc);
		System.out.println(A.getEmpName()+ "'s Insurance Scheme : "+sc);
	}
	
	

	}
}