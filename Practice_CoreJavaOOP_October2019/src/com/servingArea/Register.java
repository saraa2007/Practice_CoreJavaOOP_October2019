package com.servingArea;

public interface Register {
	//create a bunch of methods
	
public static void takeOrder() {
	System.out.println("Let's take your order ");
}
public void receiveMoney();
public void printReceipt();
}

class Manager implements Register {
	
	public static void takeOrder() {
		System.out.println("Let's take your order");
	}
	
	public Manager(int b, int c) {
		b = 8;
		c= 10;
		System.out.println(b);
		System.out.println(c);
	}
 

	@Override
	public void receiveMoney() {
		
		System.out.println("Let's receive your money ");
		
		
	}

	@Override
	public void printReceipt() {
		System.out.println("Here is your receipt ");
		
		
	}
	
	
	
}

class Boss {
	public static void main(String [] args) {
		Customers wait = new Customers(10, 20);
		wait.printReceipt();
		wait.receiveMoney();
		
	}
}


class Customers extends Manager implements Register {

	public Customers(int r, int s) {
		super(r, s);
		
	}
	
	//Customers is the child class
	//Manager is the parent class
}


