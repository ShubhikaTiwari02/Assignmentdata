package com.techment.day7collection;

import java.util.ArrayList;

public class Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 =new ArrayList<Integer>();    //default capacity= 10;
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("forward direction"+a1);
		for(Integer i : a1) 
		{
			if (i>3)
				a1.remove(i);
				
	     System.out.println( i);

          }
	}

}
