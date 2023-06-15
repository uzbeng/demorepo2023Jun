package junitdemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JunitDemo {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void before1() {
		System.out.println("Before");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void test2() {
		System.out.println("Running test 2");
		Assert.fail();
	}
	
	@Test
	public void test1() {
		System.out.println("Running test 1");
	}
	
	@Test
	public void test3() {
		System.out.println("Running test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Running test 4");
	}

}
