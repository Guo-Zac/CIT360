package com.zacguo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//This is a test suite created to bundle different test classes to run at once.
@RunWith(Suite.class)
@SuiteClasses({ MyTestObjectParameterizedTest.class, MyTestObjectTest.class })
public class MyTestsAll {

}
