package com.techment.Day.test;
class Employe {
	String firstName;
	String lastName;

	// Constructor
	public Employe(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// toString Method
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class EmployeeTest {

	public static void main(String[] args) {

		// Creating instance of Employee class

		Employe emp1 = new Employe("shubhika", "tiwari");
		Employe emp2 = new Employe("shilvee", "tiwari");

		System.out.println(emp1);

		System.out.println(emp2);


	}

}
