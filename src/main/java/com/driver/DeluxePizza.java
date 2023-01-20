package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);// calling constructor of parent class

        //calling methods of pizza class -> since it has been inherited by DeluxePizza class
        //as deluxe pizza has cheese & toppings added already
        addExtraCheese();
        addExtraToppings();
    }
}
