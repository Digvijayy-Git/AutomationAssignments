package com.creatio.crm.language.basics;

public class EmpGropus {

	public static void main(String[] args) {
		
		//Creating Arrays 
		String [] EmpName = new String [3];
		int [] EmpId = new int [3];
		
		//Assign values to Arryas with refernce of Object
		Employees obj = new Employees();
		
		
		EmpName [0] = obj.Ename1;
		EmpName [1] = obj.Ename2;
		EmpName [2] = obj.Ename3;
		
		EmpId [0] = obj.Empid1;
		EmpId [1] = obj.Empid2;
		EmpId [2] = obj.Empid3;
		
		System.out.println("Employee name = "+ EmpName [0]+ " , " + "Employee id= " + EmpId [0] );
		System.out.println("Employee name = "+ EmpName [1]+ " , " + "Employee id= " + EmpId [1] );
		System.out.println("Employee name = "+ EmpName [2]+ " , " + "Employee id= " + EmpId [2] );

		

		
	}
}
	
	

