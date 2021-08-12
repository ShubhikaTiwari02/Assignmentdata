package com.techment.oopsAssignment;

 class Address1 {
		private String addressLine;
		private String city;

		Address1(String addressLine, String city) {
			this.addressLine = addressLine;
			this.city = city;
		}

		public String getAddressDetails() {
	        return addressLine+", "+city;
		}

	}

	public class UserAddressDetails {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         
			Address1 obj1 = new Address1("Patan ","Durg");
			System.out.println(obj1.getAddressDetails());
		}

	}

