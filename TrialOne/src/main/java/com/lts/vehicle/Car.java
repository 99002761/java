package com.lts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("car mileage is..."+500);
	
	
	}
	

}
