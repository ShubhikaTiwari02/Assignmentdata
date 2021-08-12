package com.techment.oopsAssignment;


abstract class  Medicine {
	 void getDetails (){
	    	
	    	int price;
	    	int expriydate;
	    }
    abstract void displayLabel();
}
   
	
    
	class Tablet extends Medicine
	{
		@Override
		void displayLabel() {
		}
		public void show2() {
			System.out.println(" Store in a cool Dry place.");

		}
		
	}
	class Syrup  extends Medicine{
		@Override
		void displayLabel() {

		}
		public void show() {
			System.out.println(" Not take too much in a day its harmful.");

		}
		
	}
	class Ointment  extends Medicine{
		@Override
		void displayLabel() {

		}	
	public void show1() {
		System.out.println(" for external use only.");

	}
	
	}
	

	class TestMedicine{
		   int arr[] = new int[5];

		public static void main(String[] args) {
			TestMedicine m = new TestMedicine();
			 m.show1();
	}
	}


