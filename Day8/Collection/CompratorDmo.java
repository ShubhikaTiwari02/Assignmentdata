package com.techment.Day8.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
}
class AgeSortring implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.age==o2.age)
			return 0;
			else if (o1.age>o2.age)
			return 1;
		}
}
 class NameSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1 , Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	 
 }

public class CompratorDmo {

	       public static void main(String[] args) {

		ArrayList<Student > stuList =new  ArrayList<Student >();
		
		stuList.add(new Student (1, " shubhika" ,12));
		stuList.add(new Student (4, " shubh" ,10));
		stuList.add(new Student (8, " shariaa" ,1));
     
		for( Student  student : stuList )
    {
	System.out.println(student );
    }
     
System.out.println("After Sorting age ...............");

	 Collections.sort(stuList, new AgeSorting());
		  for(Student student: stuList)
	 {
           System.out.println(student);

		}
		  System.out.println("After Sorting name ...............");

	 Collections.sort(stuList, new NameSorting());
	  for(Student student: stuList)
		 {
	           System.out.println(student);

			}

}
}