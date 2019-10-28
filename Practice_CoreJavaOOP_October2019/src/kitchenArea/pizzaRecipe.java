package kitchenArea;



public abstract class pizzaRecipe {
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
