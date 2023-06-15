package demo_testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankingAppTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Running after suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class BankingAppTest");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class BankingAppTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method BankingAppTest");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method BankingAppTest");
	}
	
	@Test(groups = {"Smoke", "DB"})
	public void testA1() {
		System.out.println("Test A1");
	}
	
	@Test(groups = "Regression")
	public void testA2() {
		System.out.println("Test A2");
	}
	
	@Test
	public void testA3() {
		System.out.println("Test A3");
		Assert.fail();
	}
	
	@Test(enabled = false)
	public void testA4() {
		System.out.println("Test A4");
	}
	
	@Test(dependsOnMethods = {"testA3"})
	public void testA5() {
		System.out.println("Test A5");
	}

}
