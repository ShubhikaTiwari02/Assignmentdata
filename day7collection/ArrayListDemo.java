package com.techment.day7collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj =  new ArrayList();
		System.out.println("size before adding element: "+ obj);
	    obj.add(1);
         obj.add("shabhika");
         obj.add(24.66);
            
System.out.println("size after adding element: "+ obj);
System.out.println(" element listadding element: "+ obj);

obj.add(1,"hellow");
System.out.println(" add element in the list element : "+ obj);

obj.remove("hellow");
System.out.println(" remove element : "+ obj);
obj.remove(Integer.valueOf(1));
System.out.println(" use autoboxing  remove element : "+ obj);
System.out.println(" element at 2 index : "+ obj.get((int) 24.66));





	}

}
