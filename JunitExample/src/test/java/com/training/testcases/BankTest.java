package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegvalueException;

class BankTest {
	
	Bank bank;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
	}

	@BeforeEach
	void setUp() throws Exception {
	
		System.out.println("before each");
		bank = new Bank((double) 8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after all");
		bank=null;
	}
	@Test
	void testWithdraw() throws ExceedingException{
		double balance = bank.withdraw(2000);
		assertEquals(6000,balance,"should be 6000");
	}
	@Test
	void testWithdrawExceeding() {
		 assertThrows(ExceedingException.class,
				()-> bank.withdraw(4000));
	}

	
	  @Test 
	  void testWithdrawNeg() { assertThrows(NegvalueException.class,
			  ()-> bank.withdraw(-900));
	  }

	  @Test 
	  void testWithdrawEqual() {
		  assertThrows(ExceedingException.class,
					()-> bank.withdraw(8000));
	  }
	 
	@Test
	void testDeposit() throws ExceedingException {
		double balance = bank.deposit(2000);
		assertEquals(10000,balance,"should be 10000");
	}
	@Test 
	  void testDepositNeg() { 
		assertThrows(NegvalueException.class,
			  ()-> bank.deposit(-900));
	  }
	@Test
	@DisplayName("Test deposit")
	void testDepositExceeding() {
		 assertThrows(ExceedingException.class,
				()-> bank.deposit(51000));
	}

	

}
