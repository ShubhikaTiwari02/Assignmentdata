package com.techment.day7collection;

import java.util.ArrayList;

public class UserDefineType {
 
	public static void main(String[] args) {
         Employee emp1= new Employee(1, "sabhi", hr);
		Employee emp2= new Employee(2, "sacvbhi", research);
		
		ArrayList<Employee> employee =new ArrayList<Employee>();
		employee.add(emp1); 
		employee.add(emp2);
		employee.add(new Employee (3 ,"dafghj", " developer"));
		for(  Employee emp : employee)
		{
			
			if (emp.getId()>2)
				emp.setDept("manager");
			
			System.out.println(emp.id+ " "+ emp.name +" "+emp.dept);

		}

	}

}
