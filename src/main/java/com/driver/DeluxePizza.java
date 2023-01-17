package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        //super.addExtraCheese();
    }

    @Override
    public void addExtraToppings() {
        //super.addExtraToppings();
    }

    @Override
    public void addTakeaway() {
        //super.addTakeaway();
    }
}
