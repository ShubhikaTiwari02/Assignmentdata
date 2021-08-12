package com.techment.Day.test;
import java.util.Scanner;

public class MainArray {

		
		     public static void main(String []args)
		     {
		    	 int age [] = { 34, 78, 56, 7, 12,67, 20,50};
		         Scanner sc=new Scanner(System.in);
		         System.out.println("Enter the age: ");
		         int age=sc.nextInt();
		         //Determine whether the person is eligible to vote or not
		          if(age<18)
		          {  
		                System.out.println("The person is childern");  
		          }  
		          else if(age>=18)
		          {  
		                System.out.println("The person is Adult");  
		          }  
		          if(age<=55)
		          {  
		                System.out.println("The person is Senior Chityzen");  
		          }  
		     }
		
	}


