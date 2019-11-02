package com.kitchenArea;

public interface BakingOven {
//create a bunch of methods
public static void startOven() {
	System.out.println("Let's start making pizza! ");
}
public void startBaking();
public int stopOven();
public int takeOutPizza(int order, int delivery);
}

class Cashier implements BakingOven {
	//bbqPizza is using the elements of Baking Oven which is an interface
    //interface is a collection of method signatures (must override all of its methods)
	//interface methods are either abstract/public by default
	//interface can't have constructors (can't be used to create objects)
	
	public Cashier(int i, int j) {
		i = 5;
		j= 6;
		System.out.println(i);
		System.out.println(j);
	}

	public static void startOven() {
		System.out.println("Let's make some pizza ");
		
		
	}

	@Override
	public void startBaking() {
		
		System.out.println("Let's start baking! ");
	}

	@Override
	public int stopOven() {
		
		System.out.println("Let's stop the oven now ");
		return 0;
	}

	@Override
	public int takeOutPizza(int order, int delivery) {
		return takeOutPizza(order, delivery);
		
	}
	
}

 class Pepperoni {
	 //here, we created a class
	 public static void main(String [] args) {
         bbqPizza box = new bbqPizza(40, 50); //we created an object from the class bbqPizza
		 box.startBaking();
		 box.stopOven();
		 int delivery = 5; //local variable
		int order = 10; //local variable
		box.takeOutPizza(order, delivery);
		
		
		
		
		
	 }
	 
 }
 
 class bbqPizza extends Cashier implements BakingOven {

	public bbqPizza(int i, int j) {
		super(i, j);
		
	}
	 //bbqPizza is the child class or subclass
	 //Cashier is the parent class or super class
	 //extends refers to creating a subclass (can extend only 1 class in your child class)

	
	 
	 
	 
	 
 }