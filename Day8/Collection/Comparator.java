package com.techment.Day8.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

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
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}


class AgeSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.age>o2.age)
			return 1;
		else 
			return -1;
		
		
		
	}
	
}


class NameSorting implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.name.compareTo(o2.name));
		
		
		
	}
	
}



public class Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Student> stud1 = new ArrayList<Student>();
		
		stud1.add(new Student(1,"shubhika",21));
		stud1.add(new Student(2,"riya",29));
		stud1.add(new Student(3,"shilvee",23));
		
		System.out.println("Before sorting");
		for(Student s:stud1)
			System.out.println(s);
		
		
		System.out.println("\n Sorting");
		
		
		Collections.sort(stud1,new AgeSorting());
		
		for(Student s:stud1)
		{
			System.out.println(s);
		}
		
		
	}
}
