// Assignment Question  1 :---

package com.techment.oopsAssignment;
class Address{
	String area;
	String city;

  Address(String area,String city)
  {
	  this.area=area;
	  this.city=city;
  }
	
}

public class Customer {

	private static final String Durg = " Durg";
	private String customerName;
	Address residentialAddress;
	
	
	Customer(String customerName,Address resdentialAddress){
		this.customerName=customerName;
		this.residentialAddress=resdentialAddress;
	}
	
	      public String getCustomerDetails() {
		
		String str = "Customer : "+customerName+"\n"+"Residential Address :"+residentialAddress.area+" "+residentialAddress.city;
		return str;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Address addr = new Address("Patan ",Durg);
		Customer customer = new Customer("ShubhikaTiwari",addr);
		System.out.println(customer.getCustomerDetails());
	}

}

