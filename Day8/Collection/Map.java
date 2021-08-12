package com.techment.Day8.Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st1 = new Student(1, "sbhi",111);
Student st2= new Student(2, "sjkam",131);

System.out.println(str1.hashcode());
System.out.println(str2.hashcode());

HashMap<Student, String> hm = new HashMap<Student,String>();
	hm.put(new Student(1, "sbhi",111), "cse");
   hm.put(new Student(1, "sbhi",1456), "ce");

for(Entry<Student, String> stu : hm.entrySet())
{
	System.out.println(stu);
}

	}

}
