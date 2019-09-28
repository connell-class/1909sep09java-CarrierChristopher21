package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.main.Calculator;

public class TestExample {

	static Calculator cal;
	
	@BeforeClass
	public static void beforeAll() {
		System.out.println("look at me");
		cal=new Calculator();
	}
	
	@AfterClass
	public static void afterAll() {
		System.out.println("im mr meeseeks");
	}
	
	@Before
	public void beforeIt() {
		System.out.println("before it");
	}
	
	@After
	public void afterIt() {
		System.out.println("after it");
	}
	
	@Test
	public void testAdd() {
		assertEquals(100, cal.sum(40,60));
	}
	
	@Test
	public void noTest() {
		assertEquals(20,cal.sum(10, 10));
	}
}
