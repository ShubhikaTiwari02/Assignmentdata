package contechmentoops;
class Employee{
	  int id ;
	  String name;
	   Address address;


public Employee (int id, String name , Address address) {
	super();
	this.id=id;
	this.address=address;
	this.name=name;
	
}

void displayEmp()
{
	System.out.println("id"+id);
	System.out.println("name"+name);
	System.out.println("doorno"+ address.doorno);
	System.out.println("streetName"+address.streetName);
	System.out.println("city"+address.city);
	System.out.println("pincode"+address.pincode);

}
}
	class Address
	{
		public String streetName;
		int doorno;
		String strretName;
		String city;
		int pincode;
		
		public Address (int doorno , String StreetName, String city , int pincode) {
		super ();
		this.doorno=doorno;
		this.streetName=StreetName;
		this.city=city;
		this.pincode=pincode;
}
	}
public class IsArelationship {

	public static void main(String[] args)
	{
    Address address = new Address (101, "BTM"," Banglore", 5444667 );
    Employee emp = new Employee(111, "shubhika" , address );
    emp.displayEmp();
 
	}


}
