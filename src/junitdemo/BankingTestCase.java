package junitdemo;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankingTestCase {
	
	//@BeforeClass
	//@AfterClass
	//@Before
	//@After
	//@Test
	
	WebDriver driver = null;

	// Testing Frameworks:
	// JUnit (Unit testing)
	// TestNG
	
	// It runs before each test
//	@Before
	public void setup() {
		
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		// Move the window to the left side:
		driver.manage().window().setPosition(new Point(-1800, 0));
		driver.manage().window().maximize();
	}
	
//	@After
//	public void tearDown() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.close();
//	}
//
//	@Test
//	public void test1() {
//		System.out.println("Starting test 1");
//		// Open the website
//		driver.get("https://facebook.com");
//		// some tests on the website
//		
//	}
//	
//	@Test
//	public void test2() {
//		System.out.println("Starting test 2");		
//
//		// Open the website
//		driver.get("https://www.letskodeit.com/practice");
//		
//	}
//	
//	@Test
//	public void test3() {
//		System.out.println("Starting test 3");		
//
//		// Open the website
//		driver.get("https://google.com");
//		
//	}

}
