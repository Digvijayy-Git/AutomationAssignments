package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4Collection {
	
	public static void main(String[] args) {
		
		//Storing Student details using Map (HashMap)
		
		//Student 1 Details
		Map <String,String> Student1Details = new HashMap <String , String> ();
		Student1Details.put("Name","John Doe");
		Student1Details.put("Age","20");
		Student1Details.put("Gender","Male");
		Student1Details.put("Roll Number","S12345");
		Student1Details.put("Grade","A");
		Student1Details.put("Major","Computer science");
		Student1Details.put("GPA","3.8");
		Student1Details.put("Email","john@example.c");
		Student1Details.put("Contact number","9999997777");
		Student1Details.put("Address","123 Elmst");
		System.out.println(Student1Details);
		
		//Student 2 Details
		Map <String,String> Student2Details = new HashMap <String, String> ();
		Student2Details.put("Name","Jane Smith");
		Student2Details.put("Age","21");
		Student2Details.put("Gender","Female");
		Student2Details.put("Roll Number","S12346");
		Student2Details.put("Grade","B");
		Student2Details.put("Major","Mathematics");
		Student2Details.put("GPA","3.5");
		Student2Details.put("Email","Jane@example.c");
		Student2Details.put("Contact number","9876665666");
		Student2Details.put("Address","456 oakst");
		System.out.println(Student2Details);
		
		//Student 3 Details
		Map <String,String> Student3Details = new HashMap <String, String> ();		
		Student3Details.put("Mike","Mike Brown");
		Student3Details.put("Age","22");
		Student3Details.put("Gender","male");
		Student3Details.put("Roll Number","S12347");
		Student3Details.put("Grade","A");
		Student3Details.put("Major","Physics");
		Student3Details.put("GPA","3.9");
		Student3Details.put("Email","mike@example.c");
		Student3Details.put("Contact number","8787876546");
		Student3Details.put("Address","789 pinest");
		System.out.println(Student3Details);	

		
		//Storing Employee details using Map (HashMap)
		//Employee 1 Details
		Map <String ,String> Employee1Details = new HashMap<String, String>();
		Employee1Details.put("Employee ID", "E001");
		Employee1Details.put("Name", "Alice Green");
		Employee1Details.put("Age", "E001");
		Employee1Details.put("Gender", "Female");
		Employee1Details.put("Depatment", "Engineering");
		Employee1Details.put("Position", "Software Engineer");
		Employee1Details.put("Salary" ,"750000");
		Employee1Details.put("Email", "alice@example.com");
		Employee1Details.put("Contact Number", "9876543213");
		System.out.println(Employee1Details);
		
		//Employee 2 Details
		Map <String ,String> Employee2Details = new HashMap<String, String>();
		Employee2Details.put("Employee ID", "E002");
		Employee2Details.put("Name", "Bob Johnson");
		Employee2Details.put("Age", "E002");
		Employee2Details.put("Gender", "Male");
		Employee2Details.put("Depatment", "Marketing");
		Employee2Details.put("Position", "Marketing Manager");
		Employee2Details.put("Salary" ,"850000");
		Employee2Details.put("Email", "bob@example.com");
		Employee2Details.put("Contact Number", "9876543214");
		System.out.println(Employee2Details);
		
		//Employee 3 Details
		Map <String ,String> Employee3Details = new HashMap<String, String>();
		Employee3Details.put("Employee ID", "E003");
		Employee3Details.put("Name", "Carol White");
		Employee3Details.put("Age", "E003");
		Employee3Details.put("Gender", "Female");
		Employee3Details.put("Depatment", "Sales");
		Employee3Details.put("Position", "Sales Executive");
		Employee3Details.put("Salary" ,"650000");
		Employee3Details.put("Email", "carolb@example.com");
		Employee3Details.put("Contact Number", "9876543215");
		System.out.println(Employee3Details);
		
		//Storing Product Details Using Map (HashMap)
		//Student 1 Details 
		Map <String, String> Product1Deatails = new HashMap <String, String>();
		Product1Deatails.put("Product ID","P001");
		Product1Deatails.put("Name","Laptop");
		Product1Deatails.put("Category ","Furniture");
		Product1Deatails.put("Price","$1200");
		Product1Deatails.put("Stock Quamntity","50");
		Product1Deatails.put("Supplier","Tech Suppliers");
		Product1Deatails.put("Warranty","2 Years");
		Product1Deatails.put("Rating","4.5");
		Product1Deatails.put("Manufacturing Date","15-01-2023");
		Product1Deatails.put("Expiry Date","15-01-2025");
		System.out.println(Product1Deatails);
		
		//Student 2 Details
		Map <String, String> Product2Deatails = new HashMap <String, String>();
		Product2Deatails.put("Product ID","P002");
		Product2Deatails.put("Name","Desk Chair");
		Product2Deatails.put("Desk Chair","Furniture");
		Product2Deatails.put("Price","$150");
		Product2Deatails.put("Stock Quamntity","200");
		Product2Deatails.put("Supplier","Office Depot");
		Product2Deatails.put("Warranty","1 Years");
		Product2Deatails.put("Rating","4");
		Product2Deatails.put("Manufacturing Date","10-02-2023");
		Product2Deatails.put("Expiry Date","N/A");
		System.out.println(Product2Deatails);
		
		//Student 3 Details
		Map <String, String> Product3Deatails = new HashMap <String, String>();
		Product3Deatails.put("Product ID","P003");
		Product3Deatails.put("Name","Coffee Maker");
		Product3Deatails.put("Desk Chair","Kitchen");
		Product3Deatails.put("Price","$75");
		Product3Deatails.put("Stock Quamntity","100");
		Product3Deatails.put("Supplier","Kitchen World");
		Product3Deatails.put("Warranty","6 months");
		Product3Deatails.put("Rating","4.2");
		Product3Deatails.put("Manufacturing Date","20-03-2023");
		Product3Deatails.put("Expiry Date","20-03-2023");
		System.out.println(Product3Deatails);
		
		
		//To Make List of all Student Details use Array (ArrayList) 
		//	StudentList = student 1 + Student 2+ Student 3
		List <Map <String , String>> StudentList = new ArrayList <Map <String, String>> ();
		StudentList.add(Student1Details);
		StudentList.add(Student2Details);
		StudentList.add(Student3Details);
		System.out.println(StudentList);
		
		//To Make List of all Employee Details use Array (ArrayList)
		// EmployeeList = Employee 1 + Employee 2 +Employee 3
		List <Map <String , String>> EmployeeList = new ArrayList <Map <String, String>> ();
		EmployeeList.add(Employee1Details);
		EmployeeList.add(Employee2Details);
		EmployeeList.add(Employee3Details);
		
		//To Make List of all Product Details use Array (ArrayList)
		// ProductList = Product 1 + Product 2 +Product 3
		List <Map <String , String>> ProductList = new ArrayList <Map <String, String>> ();
		ProductList.add(Product1Deatails);
		ProductList.add(Product2Deatails);
		ProductList.add(Product3Deatails);
		
		
		//To Access Data from All StudentList, EmployeeList and ProductList Use  Map(HashMap)
		Map <String, List<Map <String,String>> > AccessData = new HashMap<String,List< Map <String,String>>>();
		AccessData.put("StudentData", StudentList);
		AccessData.put("EmployeeData",EmployeeList);
		AccessData.put("ProductData",ProductList);
		System.out.println(AccessData);
		
		//Displaying Supplier Name of 2nd row ProductData
		String Supplier = AccessData.get("ProductData").get(1).get("Supplier");
		System.out.println(Supplier);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
