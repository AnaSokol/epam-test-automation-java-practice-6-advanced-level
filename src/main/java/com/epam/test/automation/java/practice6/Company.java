package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Company {
    
	private Employee[] staff;
	public Company(Employee ... employees) {
		this.staff = employees;
	}
	public void giveEverybodyBonus (BigDecimal companyBonus) {
		for (int i = 0; i < staff.length; i++) {
			staff[i].setBonus(companyBonus);
		}	
	}
	
	public BigDecimal totalToPay () {
		BigDecimal totalToPay = new BigDecimal(0);
		for (int i = 0; i < staff.length; i++) {
			totalToPay = totalToPay.add(staff[i].toPay());		
		}
    	return totalToPay;
	}
	
	 public String nameMaxSalary() {
        int iMaxSalary = 0;
        BigDecimal maxSalary = staff[0].toPay();
        for (int i = 1; i < staff.length; i++) {
            if (maxSalary.compareTo(staff[i].toPay()) < 0) {
                maxSalary = staff[i].toPay();
                iMaxSalary = i;
            }
        }
        return staff[iMaxSalary].getName();
    }
	
}
