package com.kitchenArea;

import javax.swing.MenuSelectionManager;

import com.servingArea.Employees;

public class TestPizza {
	int x; //global variable
	public TestPizza() {
		//default constructor (contains no parameters)
		x = 7;
		System.out.println("Testing the pizza ");
		
	
	
		
	}
	
	public TestPizza(int test1, int test2) {
		//parameterized constructor (contains parameters/values)
		test1 = 5;
		test2 = 10;
	    
	}

	public static void main(String[] args) {
		TestPizza twoPizza = new TestPizza(); //this will call the constructor as we create an object of class TestPizza
		System.out.println(twoPizza.x);
		
		Cashier one = new Cashier(40,50);
		
		bbqPizza two = new bbqPizza(60, 80);
		
		TestPizza three = new TestPizza(40,90); //we create objects from constructors
		
		Cashier.startOven();
		
		
		Employees.getEmployeeId();
		Employees.getNameOfEmployee();
		Employees.getSalary();
		Employees.setEmployeeId(44);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	

}
