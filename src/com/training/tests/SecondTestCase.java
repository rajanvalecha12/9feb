package com.training.tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.samples.StudentList;

public class SecondTestCase {
StudentList stud=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("before called**********");
		stud=new StudentList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after called***********");
	}

	@Test
	public void test1() {,
		//fail("Not yet implemented");
		Set<String> set;
		set=stud.getNames();
		int actual= set.size();
		assertEquals(3, actual);
	}
	public void test2() {
		
	}
}
