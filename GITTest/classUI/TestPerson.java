package classUI;

import classes.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();	
		
		System.out.println("First Name  :" + p.getFirstName());
		System.out.println("Last Name   :" + p.getFirstName());
		System.out.println("Address     :" + p.getAddress());
		System.out.println("Town        :" + p.getTown());
		System.out.println("PostCode    :" + p.getPostcode());
		System.out.println("DOB         :" + p.getDOB());
		System.out.println("Phone       :" + p.getPhone());

	}

}
