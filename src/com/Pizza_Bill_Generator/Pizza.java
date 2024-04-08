package com.Pizza_Bill_Generator;

public class Pizza {
	
	private int price;
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backPack=20;
	private int basePizzaPrice;
	
	private Boolean isExtraCheeseAdded= false;
	private Boolean isExtraToppingsAdded= false;
	private Boolean isOptedForTakeAway =false;
	
	public Pizza(Boolean veg) {
		this.veg =veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}
	
	/*
	 * public void getPizzaPrice() { System.out.println("Pizza price: "+this.price);
	 * }
	 */
	
	public void addExtraCheese() {
		isExtraCheeseAdded= true;
		//System.out.println("Added extra cheese: " + extraCheesePrice);
		this.price +=extraCheesePrice;
		
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded=true;
		//System.out.println("Added extra toppings: "+ extraToppingsPrice);
		this.price +=extraToppingsPrice;
	}
	
	public void takeAway() {
		isOptedForTakeAway=true;
		//System.out.println("Take away charges: "+backPack);
		this.price +=backPack;
	}
	
	public void getBill() {
		String bill="";
		System.out.println("Base Price: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese Added: "+ extraCheesePrice+ "\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra Toppings Added: "+ extraToppingsPrice+ "\n";
		}
		if(isOptedForTakeAway) {
			bill += "Take Away: "+ backPack+ "\n";
		}
		
		bill += "Total Amt: "+this.price;
		
		System.out.println(bill);
		
	}


}
