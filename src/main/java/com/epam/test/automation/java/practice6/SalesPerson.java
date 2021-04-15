package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
	
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super (name, salary);
        this.percent = percent;
    }

   
    public BigDecimal getBonus() {
        return bonus;
    }

    
    public void setBonus(BigDecimal bonus) {
    	if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0)
    		throw new IllegalArgumentException("Bonus cannot be a negative number");
    	BigDecimal bd2 = new BigDecimal("2");
    	BigDecimal bd3 = new BigDecimal("3");
    	if (percent>100 && percent<=200) {
    		this.bonus = (bd2.multiply(bonus));
    	}
    	else if (percent>200) {
    		this.bonus = (bd3.multiply(bonus));
    	}
    	else 
    		this.bonus = bonus;
    }
}    