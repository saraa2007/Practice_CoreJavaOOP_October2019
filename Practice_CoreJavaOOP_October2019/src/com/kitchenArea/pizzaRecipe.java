package com.kitchenArea;



public abstract class pizzaRecipe implements BakingOven  {
	//abstract class is a restricted class and can't create objects
private String dough;
private String sauce;
private String topping;





private String makePizza (String pizza, String box, String toppings) {
    return makePizza(pizza, box, toppings);
	
	
}

public String getDough() {
	return dough;
}

public void setDough(String dough) {
	this.dough = dough;
}

public String getSauce() {
	return sauce;
}

public void setSauce(String sauce) {
	this.sauce = sauce;
}

public String getTopping() {
	return topping;
}

public void setTopping(String topping) {
	this.topping = topping;
}

}

class Waiter extends pizzaRecipe {

	
	public void startOven() {
		
		
	}

	@Override
	public void startBaking() {
		
		
	}

	@Override
	public int stopOven() {
		return 0;
		
		
	}

	@Override
	public int takeOutPizza(int order, int delivery) {
		return takeOutPizza(order, delivery);
	}
	
}