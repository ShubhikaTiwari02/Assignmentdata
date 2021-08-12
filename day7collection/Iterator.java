package com.techment.day7collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<Integer> a1 =new ArrayList<Integer>();    //default capacity= 10;
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("forward direction"+a1);
	java.util.Iterator<Integer>	 itr = a1.listIterator();
	while(((ListIterator<Integer>) itr).hasPrevious());
	System.out.println( ((ListIterator<Integer>) itr).previous());

	}
	
}

