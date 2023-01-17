package com.driver;

import java.sql.SQLOutput;

public class Pizza {

    private int price;
    private Boolean isVeg;// true -> veg pizza & false -> non-veg pizza
    private String bill="";// final bill -> after adding extra cheese, toppings & paper-bag (if added any)

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;

    private boolean isExtraToppingsAdded = false;

    private boolean isPaperbagAdded = false;

    public Pizza(Boolean isVeg){// constructor -> creating object of pizza class
        this.isVeg = isVeg;
        if(this.isVeg){
            this.price = 300;// Veg pizza base price
        }
        else{
            this.price = 400;// Non-veg pizza base price
        }
        basePizzaPrice = this.price;
    }

    public int getPrice(){
        return basePizzaPrice;
    }

    public void addExtraCheese(){
            if(!isExtraCheeseAdded) {
                this.price += 80;// same extra cheese price for both veg & non-veg pizza
                isExtraCheeseAdded = true;
            }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded) {
            if (this.isVeg) {
                this.price += 70;//  extra toppings for veg pizza

            } else {
                this.price += 120;//  extra toppings for non-veg pizza

            }
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperbagAdded) {
            this.price += 20;
            isPaperbagAdded = true;
        }
    }

    public String getBill(){

        bill += "Base Price Of The Pizza: " + basePizzaPrice + "\n";

        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: " + 80 + "\n";
        }

        if(isVeg){
            if(isExtraToppingsAdded){
                bill += "Extra Toppings Added: " + 70 + "\n";
            }
            else{
                bill += "Extra Toppings Added: " + 120 + "\n";
            }
        }

        if(isPaperbagAdded){
            bill += "Paperbag Added: " + 20 + "\n";
        }

        bill += "Total Price: " + this.price + "\n";

        return this.bill;
    }
}
