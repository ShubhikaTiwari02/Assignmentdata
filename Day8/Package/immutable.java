package com.techment.Day8.Package;

public class immutable {

	public static void main(String[] args) {
		String s1 = " java";
		System.out.println(s1);

     s1.concat(" programming");
		System.out.println(" after concate"+s1);

		s1= s1.concat("language");
	}

}
