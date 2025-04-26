package com.java.practice;

class Employee {
	String name = "John Doe";
	double salary = 50000;

	String getDetails() {
		return "Name: " + name + ", Salary: " + salary;

	}
}

class Manager extends Employee {
	int teamSize = 5;

	// @Override
	String getDetails() {
		// Call parent class method and add more info
		String baseDetails = super.getDetails(); // uses 'super' to call Employee's method
		return baseDetails + ", Team Size: " + teamSize;

	}
}

public class Practice {

	public static void main(String[] Args) {
		Manager obj = new Manager();
		obj.getDetails();

	}
}