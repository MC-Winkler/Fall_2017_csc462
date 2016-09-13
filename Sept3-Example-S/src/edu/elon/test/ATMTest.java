package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATMTest {

	@Test
	public void testATM() {
		ATM atm = new ATM();
		assertEquals(atm.getBalance(),0,0);
	}

	@Test
	public void testATMDouble() {
		ATM atm = new ATM(50);
		assertEquals(atm.getBalance(),50,0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testATMDoubleNegativeInput() {
		ATM atm = new ATM(-10);
	}

	@Test
	public void testDeposit() {
		ATM atm = new ATM();
		atm.deposit(511);
		assertEquals(atm.getBalance(), 511, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDepositNegativeInput() {
		ATM atm = new ATM();
		atm.deposit(-10);
	}

	@Test
	public void testGetBalance() {
		ATM atm = new ATM(444);
		atm.deposit(12);
		assertEquals(atm.getBalance(), 456, 0);
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		ATM atm = new ATM(500);
		assertEquals(atm.withdraw(250), 250, 0);
		assertEquals(atm.getBalance(), 250, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWithdrawTooMuch() {
		ATM atm = new ATM(500);
		atm.withdraw(600);
	}
}
