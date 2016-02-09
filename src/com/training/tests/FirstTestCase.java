package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.CurrencyConvertor;

public class FirstTestCase {
	CurrencyConvertor conv=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("before called**********");
	conv = new CurrencyConvertor();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after called***********");
	}

	@Test
	public void test1() {
		// fail("test1 Not yet implemented");
		
		double actual = conv.dollarToRuppee(10);
		assertEquals(1000.0, actual, 0);
	}

	@Test
	public void test2() {
		double actual = conv.dollarToRuppee(10);
		assertNotNull(actual);
	}

}
