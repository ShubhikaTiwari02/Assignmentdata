package com.techment.Day.test;


public class Animal {

	void eat()
		{System.out.println("eating...");}
	}
	class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
	}  
	
	class Horese extends Animal{  
		void neigh(){System.out.println("neigh...");}  
		}
	class Cat extends Animal{  
	void meow()
	{System.out.println("meowing...");}

	}  
	class TestInheritance{  
	public static void main(String args[]){  
	Cat c=new Cat();  
	c.meow();  
	c.eat();
	c.bark();
	c.neigh();
	
	}
	
	}
