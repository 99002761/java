package com.training.example;

public class Calculator {
	
	public int sum(int x, int y) {
		return x+y;
	}
	public int div(int x, int y) {
		return x/y;
	}

	public int sub(int x, int y) {
		return x-y;
	}
	public double avg(int x,int y,int z) throws ExceedingException {
		double tot= (x+y+z)/3;
		return tot;
	}
}
