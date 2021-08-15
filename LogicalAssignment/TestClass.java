package contechmentAssigment;
import java.util.Scanner;

import javax.imageio.IIOException;

import java.util.Scanner;
public class TestClass 
{
private static int age;
static void validate() throws Exception
{ 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your age");
 age = sc.nextInt();

 if(age < 18)  
 throw new Exception("Invalid Age, You are not eligible to vote");  
 else  
 System.out.println("Welcome to vote");  
}  
public static void main(String[] args)
{
try
{  
 validate();  
}
catch(Exception e)
{
  System.out.println("Caught an Exception: \n "+e);
 }   
 }  
}


