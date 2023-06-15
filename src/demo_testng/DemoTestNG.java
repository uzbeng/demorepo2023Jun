package demo_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = {"Smoke"})
	public void test2() {
		System.out.println("Test 2");
		Assert.fail();
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test(groups = {"Smoke"})
	public void test5() {
		System.out.println("Test 5");
	}

}
