package contechmentAssigment;

class Employee {
	static String dept;
      final int id=1;

}
public class finalDemo {
public static void main (String args[])
{
	Employee emp1 =new Employee();
	Employee emp2=new Employee();
	
	emp1.dept="HR";
	emp2.dept="Developer";
	
	System.out.println(emp1.dept);
	System.out.println(emp2.id);


}
	
}