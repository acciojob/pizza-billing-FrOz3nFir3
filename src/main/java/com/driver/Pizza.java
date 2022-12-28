package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseAdded = false;
    private int cheesePrice = 80;

    private boolean toppingsAdded = false;
    private int toppingsPrice;

    private boolean takeAway = false;
    private int takeAwayPrice = 20;


    boolean billGenerated = false;

    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        // your code goes here

        if(isVeg == true){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.bill = "Base Price Of The Pizza: "+ this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        boolean notAddedAlready = this.cheeseAdded == false;
        if(notAddedAlready){
            this.price += this.cheesePrice;
            this.cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        boolean notAddedAlready = this.toppingsAdded == false;
        if(notAddedAlready){
            this.price += this.toppingsPrice;
            this.toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        boolean notAddedAlready = this.takeAway == false;
        if(notAddedAlready){
            this.price += this.takeAwayPrice;
            this.takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        boolean notAlreadyGenerated = this.billGenerated == false;
        if(notAlreadyGenerated){
            if(this.cheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: "+this.cheesePrice+ "\n";
            }
            if(this.toppingsAdded == true){
                this.bill = this.bill + "Extra Toppings Added: "+this.toppingsPrice+ "\n";
            }
            if(this.takeAway == true){
                this.bill = this.bill + "Paperbag Added: "+this.takeAwayPrice+"\n";
            }

            this.bill = this.bill + "Total Price: " + this.price + "\n";

            this.billGenerated = true;
        }
        return this.bill;
    }
}
