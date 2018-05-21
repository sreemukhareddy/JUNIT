package com.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class testTestClass {
	
	@BeforeClass
   public static void setup(){
        System.out.println("@BeforeAll executed");
    }
	
	@AfterClass
   public static void setupThis(){
        System.out.println("@Afterall executed");
    }
	
	@Before
	public void before() {
		System.out.println("@Before is being executed");
	}
	
	@After
	public void after() {
		System.out.println("@After is being executed");
	}

	@Test
	public void test() {
		TestClass class1=new TestClass();
		int result=class1.addNumber(1, 2);
		System.out.println(result);
		Assertions.assertEquals(3, result);
	}
	
	

}
