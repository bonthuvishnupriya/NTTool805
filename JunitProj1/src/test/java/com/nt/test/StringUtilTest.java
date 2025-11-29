package com.nt.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.StringUtil;

public class StringUtilTest {
	private static StringUtil util;
	
	@BeforeAll
	public static void setupOnce() {
		System.out.println("StringUtilTest.setupOnce()");
		util=new StringUtil();
	}
	
	@BeforeEach
	public void setup() {
		System.out.println("StringUtilTest.setup()");
	}
	
	@Test
	public void testIsPallendromeWithValidData() {
	System.out.println("StringUtilTest.testIsPallendromeWithValidData()");
	boolean flag=StringUtil.isPallendrome("madam");
	assertTrue(flag);
	}
	@Test
	public void testIsPallendromeWithInValidData() {
	System.out.println("StringUtilTest.testIsPallendromeWithInValidData()");
	boolean flag=StringUtil.isPallendrome("madam1");
	assertFalse(flag);
	}
	@Test
	public void testIsPallendromeWithNoData() {
		System.out.println("StringUtilTest.testIsPallendromeWithData()");
	assertThrows(IllegalArgumentException.class,()-> StringUtil.isPallendrome(""));
	}
	
	@Test
	public void testCreateDateWithValidData() {
		System.out.println("StringUtilTest.testCreateDateWithValidData()");
		LocalDate ld= util.createDate(2000, 10, 20);
		assertNotNull(ld);
		assertEquals(LocalDate.of(2000, 10, 20), ld);
	}
	@Test
	public void testCreateDateWithInValidData() {
		System.out.println("StringUtilTest.testCreateDateWithInValidData()");
		LocalDate ld= util.createDate(1800, 10, 20);
		assertNull(ld);
	}
	
	@Test
	public void testSingleTonClass() {
		Runtime rt1=Runtime.getRuntime();
		Runtime rt2=Runtime.getRuntime();
		System.out.println(rt1.hashCode()+" " +rt2.hashCode());
		assertSame(rt1, rt2);
	}
	@Test
	public void testNonSingleTonClass() {
		LocalDate d1= LocalDate.now();
		LocalDate d2=LocalDate.of(2000, 10, 20);
		System.out.println(d1.hashCode()+" " +d2.hashCode());
		assertNotSame(d1, d2);
	}

	
	@AfterEach
	public void teardown() {
		System.out.println("StringUtilTest.tearDown()");
	}
	
	@AfterAll
	public static void teardownOnce() {
		System.out.println("StringUtilTest.tearDownOnce()");
		util=null;
	}
	

}
