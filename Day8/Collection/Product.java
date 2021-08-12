package com.techment.Day8.Collection;
import java.util.ArrayList;
import java.util.Collections;

class Product1 implements Comparable<Product1>{
	
	int id;
	String name;
	int quntity;
	int price;
	
	public Product1(int id, String name, int quantity , int price) {
		super();
		this.id = id;
		this.name = name;
		this.quntity = quantity;
		this.price=price;
	}
	@Override
	public int compareTo(Product1 o) {
		if (this.price == o.price)
			return 0;
		else 	if (this.price >o.price)
			return 1;
		return price;		  
	}
	public static void add(Product1 product1) {
		// TODO Auto-generated method stub
		
	}

	
}
    
public class Product{

	public static void main(String[] args) {
		
ArrayList<Product1> product1 = new ArrayList<Product1>();

Product1.add(new Product1 (1,"rice",500, 45));
Product1.add(new Product1 (2," vegitable",1000,4));
Product1.add(new Product1(3," suger",800,80));

for( Product1   product : product1)
{
System.out.println(product1 );
}
 
//System.out.println("After Sorting ...............");

     Collections.sort(product1);
	System.out.println(product1);

	
}
}

