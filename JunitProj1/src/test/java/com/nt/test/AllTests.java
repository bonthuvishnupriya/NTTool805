package com.nt.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ ArithmeticOperationsTest.class, StringUtilTest.class })
@SelectPackages("com.nt.test")
public class AllTests {

}
