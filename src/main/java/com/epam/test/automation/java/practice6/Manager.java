package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Manager extends Employee {
	   
	    private int quantity;

	    public Manager (String name, BigDecimal salary, int clientAmount) {
	        super (name, salary);
	        this.quantity = clientAmount;
	    }

	    @Override
	    public void setBonus(BigDecimal bonus) {
	    	if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0) {
	    		throw new IllegalArgumentException("bonus is null or < 0");
	    	}

	    	BigDecimal bd500 = new BigDecimal(500);
	    	BigDecimal bd1000 = new BigDecimal("1000");
	    	
	    	if (quantity>100 && quantity<=150) {	 	
	    		BigDecimal bonusOver100 = bonus.add(bd500);
	    		this.bonus = (bonusOver100);
	    	}
	    	else if (quantity>150) {
	    		BigDecimal bonusOver150 = bonus.add(bd1000);
	    		this.bonus = (bonusOver150);
	    	}
	    	else 
	    		this.bonus = bonus;
	    }
}
