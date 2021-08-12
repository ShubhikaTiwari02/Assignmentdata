package com.techment.oopsAssignment;

public class TestCustomer {
	
  public int a;
void customer()
  {
	     
		System.out.println("This is my Default Contructor");

  }
  void getCustomerDetails(int a )
  {	     
	     this.a=a ;
		System.out.println("This is my Paramerterize Contructor"+ a);

  }
	public static void main(String[] args) {
		TestCustomer test = new TestCustomer();
		test.customer();
		test.getCustomerDetails(10);

	}
	

}
