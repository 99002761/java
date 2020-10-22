package com.lts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("bike mileage is..."+100);
	
		
	}

}
