package com.techment.Day.test;
class Animal {
	void Shout() {
		System.out.println("Shouting ");
	}
}

class Dog extends Animal {
	void Shout() {
		System.out.println("Barking....");
	}
}

class Horse extends Animal {
	void Shout() {
		System.out.println("Horse Sound");
	}
}

class Cat extends Animal {
	void Shout() {
		System.out.println("Cat Sound");
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal horse = new Horse();
		horse.Shout();

		Animal dog = new Dog();
		dog.Shout();
		
		Animal cat = new Cat();
		cat.Shout();

	}

}
