package contechmentAssigment;
import java.util.Scanner;

public class Validationpin {
		public static void main(String[] args) {

	  int correctPin = 12345;
	  
	           Scanner scanner = new Scanner(System.in);
	           
	           int pin = 0;
			while(pin!=correctPin) {
	        	   System.out.println("Enter Correct Pin :");
	        	    pin = scanner.nextInt();
	        	   
	        	    if(pin==correctPin)
	        	    	System.out.println("Pin Accepted");
	           }

		}

	}

