package demo_testng;

import org.testng.annotations.Test;

public class OnlineMarket {
	@Test
	public void testB1() {
		System.out.println("Test B1");
	}
	
	@Test
	public void testB2() {
		System.out.println("Test B2");
	}
	
	@Test
	public void testB3() {
		System.out.println("Test B3");
	}
	
	@Test(groups = {"Smoke"})
	public void testB4() {
		System.out.println("Test B4");
	}
	
	@Test
	public void testB5() {
		System.out.println("Test B5");
	}
}
