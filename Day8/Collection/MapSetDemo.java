package com.techment.Day8.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapSetDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1," shubhi");
		m.put(8,"shree");
		m.put(5," shilvee");
         System.out.println("hashmap data\n"+m);
 
		LinkedHashMap lm = new LinkedHashMap();
		lm.put(41," reya");
		lm.put(6,"reena");
		lm.put(5," roohi");
		System.out.println("linkedhashmap data\n "+lm);
		
		TreeMap t = new TreeMap();
		t.put(10," sherya");
		t.put(7," dev");
		t.put(4," veeya");
		System.out.println(" tree map data\n"+t);
		
	
		}
	}


