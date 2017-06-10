package com.zacguo.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class MyTestObjectTest {

	@Test
	public void testAddition() {
		MyTestObject test = new MyTestObject();
		int result = test.twoElementAddition(10, 20);
		assertEquals(30, result);
	}

	@Test
	public void testSqaure() {
		MyTestObject test = new MyTestObject();
		int result = test.square(10);
		assertEquals(100, result);
	}

	// This test will not run because of the @Ignore
	@Ignore
	@Test
	public void testSqaure2() {
		MyTestObject test = new MyTestObject();
		int result = test.square(10);
		assertEquals(100, result);
	}

	// This test will fail because the test run more than 0.02 second
	@Test(timeout = 20)
	public void testPrintMessage() {
		MyTestObject test = new MyTestObject();
		test.printMessageByTimes(10000);
	}

	// Similar to the last test, but this one run less than 0.02 second
	// so it passed
	@Test(timeout = 20)
	public void testPrintMessage2() {
		MyTestObject test = new MyTestObject();
		test.printMessageByTimes(100);
	}

	/*
	 * This test expects an IndexOutOfBoundsException
	 * It will fail if any other exception thrown or no exception
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testException() {
		MyTestObject test = new MyTestObject();
		test.arrayIndexOutofBounds();
	}

}
