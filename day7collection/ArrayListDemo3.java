package com.techment.day7collection;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 =new ArrayList<Integer>();    //default capacity= 10;
		a1.add(1);
		a1.add(2);
		a1.add(3);
		//a1.addAll(4);
		System.out.println("element are:"+a1);
		
		ArrayList<Integer> a2 =new ArrayList<Integer>();    //default capacity= 10;
		a2.add(1);
		a2.add(2);
		a2.add(3);
		System.out.println("element are:"+a2);
 //a2.addAll(a1);
 //a2.removeAll(a1);
 //a2.retainAll(a1);
		//a2.sort(a2);
		System.out.println("element of a2 after sorting"+a2);
 }
	
		
		//a2.removeAll(a1);
	}


