package com.techment.Day8.Collection;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept , int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age=age;
	}
	@Override
	public String toString() {
	
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";

	}
	@Override
	public int compareTo(Employee o) {
		if (this.age == o.age)
			return 1;
		else 	if (this.age >o.age)
			return -1;
		return age;		  
	}
	
	
}
    
public class UserDefineExample {

	public static void main(String[] args) {
		
ArrayList<Employee> employee = new ArrayList<Employee>();

employee.add(new Employee (1,"ramesh"," hr",45));
employee.add(new Employee (2,"shuamesh"," maneger",4));
employee.add(new Employee (3,"kamlesh"," developers",80));
  	
 Collections.sort(employee);
	System.out.println(employee);

	}
	}
