package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.example.Calculator;
import com.training.example.ExceedingException;
import com.training.example.NegvalueException;

class CalculatorTest {
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator= new Calculator();
		
		
		System.out.println("before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("after each testcases");
	} 

	@Test
	void testSum() {
		int actual = calculator.sum(10, 20);
		assertEquals(30, actual);
	}
	@Test
	void testSub() {
		int actual = calculator.sub(20, 10);
		assertEquals(10, actual);
	}
	@Test
	void testDiv() {
		int actual = calculator.div(20,10);
		assertEquals(2, actual);
	}
	@Test
	public double testAvg(int x,int y,int z)throws ExceeedingException {
			double tot = 0;
			if(tot>50){
				throw new ExceedingException("avg beyond limit");
			}
			if(tot<=0) {
				throw new NegvalueException("enter correct values");
			
			}
		   tot = (x+y+z)/3;
			return tot;
	}
	
	
	

}
