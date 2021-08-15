package com.techment.oopsAssignment;

import com.shape.Polygon;
import com.shape.Rectangle;
import com.shape.Square;

public class calling {


	public static void main(String[] args) {
		
		Polygon poly = new Rectangle();
		
		Polygon poly1 = new Square();
     poly.calcArea();
     poly.calcPeri();
     poly1.calcArea();
     poly1.calcPeri();
	}

}
