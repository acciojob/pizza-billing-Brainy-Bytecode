package com.driver;

import java.sql.SQLOutput;

public class Pizza {

    private int price;
    private Boolean isVeg;// true -> veg pizza & false -> non-veg pizza
    private String bill;// final bill -> after adding extra cheese, toppings & paper-bag (if added any)

    private int basePizzaPrice;

    private int extraToppingsPrice;

    private boolean isExtraCheeseAdded;

    private boolean isExtraToppingsAdded;

    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){// constructor -> creating object of pizza class
        this.isVeg = isVeg;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "";

        if(this.isVeg){
            this.price = 300;// Veg pizza base price
            this.extraToppingsPrice = 70;
        }
        else{
            this.price = 400;// Non-veg pizza base price
            this.extraToppingsPrice = 120;
        }
        basePizzaPrice = this.price;
    }

    public int getPrice(){
        return basePizzaPrice;
    }

    public void addExtraCheese(){
            if(!isExtraCheeseAdded) {
                this.price += 80;// same extra cheese price for both veg & non-veg pizza
                this.isExtraCheeseAdded = true;
            }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded) {
            this.price += extraToppingsPrice;
            this.isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded) {
            this.price += 20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){

        if(!isBillGenerated) {

            this.bill += "Base Price Of The Pizza: " + basePizzaPrice + "\n";

            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: " + "80" + "\n";
            }


            if (isExtraToppingsAdded) {
                    this.bill += "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }

            if (isTakeAwayAdded) {
                this.bill += "Paperbag Added: " + "20" + "\n";
            }

            this.bill += "Total Price: " + this.price + "\n";
            this.isBillGenerated = true;
        }

            return this.bill;
    }
}
