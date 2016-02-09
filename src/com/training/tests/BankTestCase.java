package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.BankAccount;

public class BankTestCase {
BankAccount bA=null;
	@Before
	public void setUp() throws Exception {
	bA = new BankAccount(89789789,"rajan valecha",897897);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
