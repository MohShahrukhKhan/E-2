package com.masai;

public class Person {
	String name ;
   String	gender ;
   String  city ;

	   String state;
	   String pinCode;
	   public Person() {
		   super();
	   }
	public Person(String city, String state, String pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	   
   
	
}
