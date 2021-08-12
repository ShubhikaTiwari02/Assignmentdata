package com.techment.day7collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList  o1 = new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addLast(101);
		o1.add(4);
		o1.addFirst(101);

		System.out.println("linked list "+o1);
o1.removeLast();
System.out.println(o1);

	}

}
