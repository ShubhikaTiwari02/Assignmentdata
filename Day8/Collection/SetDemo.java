package com.techment.Day8.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
HashSet hs = new HashSet();
hs.add(1);
hs.add(2);
hs.add(5);

System.out.println("hashset data"+hs);
LinkedHashSet ls = new LinkedHashSet();
ls.add(41);
ls.add(6);
ls.add(5);

System.out.println("linkedhashset data"+ls);
TreeSet t = new TreeSet();
t.add(1);
t.add(8);
t.add(5);
System.out.println(" treeset data"+t);

}

}