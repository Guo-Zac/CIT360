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

	//This test will use assertArrayEquals to verify arrays of expected and results.
	@Test
	public void testArray(){
		MyTestObject test = new MyTestObject();
		int[] value = {10,20,30,40};
		int[] expected = {100,400,900,1600};
		int[] result = new int[4];
		for(int i = 0; i<value.length;i++){
			result[i] = test.square(value[i]);
		}
		assertArrayEquals(expected,result);
	}
	
	//This test will use assertTrue to test the result of square()
	@Test
	public void testTrue(){
		MyTestObject test = new MyTestObject();
		int result = test.square(10);
		assertTrue(100 == result);
	}
	
	//This test will use assertFalse to test the result of square()
	@Test
	public void testFalse(){
		MyTestObject test = new MyTestObject();
		int result = test.square(10);
		assertFalse(100 != result);
	}
	
	//This test will use assertNull to test if the result is null
	@Test
	public void testNull(){
		MyTestObject test = new MyTestObject();
		String result = test.nullForZac("Zac");
		assertNull(result);
	}
	
	//This test will use assertNotNull to test if the result is not null
	@Test
	public void testNotNull(){
		MyTestObject test = new MyTestObject();
		String result = test.nullForZac("Tom");
		assertNotNull(result);
	}
	
	//This test uses assertSame to test if two objects are actually the same one
	@Test
	public void testSameObject(){
		MyTestObject test = new MyTestObject();
		Object testObj = new MyTestObject();
		Object result = test.returnSameObject(testObj);
		assertSame(testObj, result);
	}
	
	//This test uses assertNotSame to test if two objects are not the same one
	@Test
	public void testNotSameObject(){
		MyTestObject test = new MyTestObject();
		Object testObj = new MyTestObject();
		Object result = test.returnSameObject(new MyTestObject());
		assertNotSame(testObj, result);
	}
	
	//fail() will just fail the test with a message.
	@Test
	public void failTest(){
		fail("This test failed.");
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
