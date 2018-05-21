package com.tests;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import junit.framework.Assert;

public class JunitAnnotationExample {
	
	private ArrayList<String> list=new ArrayList<String>();
	TestClass testClass=new TestClass();
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("@Before class is being executed");
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
	public void test1() {
		list.add("HARRY");
		
		int a = testClass.addNumber(1, 4);
		//Assert.assertTrue(list.isEmpty());
		
		Assert.assertEquals(5,a );
	}
	
	@Ignore
	public void ignored() {
		System.out.println("This test is ignored");
	}
	
}
