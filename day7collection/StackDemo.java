package com.techment.day7collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
            Stack s1 = new Stack();
            s1.push(1);
            s1.add(2);
    		System.out.println("lprint data "+s1);

                	s1.pop();
            		System.out.println("remove data "+s1);
            		System.out.println("top data "+s1.peek());


	}
}
