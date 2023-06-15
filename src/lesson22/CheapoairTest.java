package lesson22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;

public class CheapoairTest {
	
	// Global variable
	WebDriver driver = null;
	private String url = "https://www.cheapoair.com/";

	@Parameters
	@BeforeMethod
	public void setup(String browser) {

//		String browser = "chrome";

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
	
	//@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void testFlightOrder(String url, String from, String to) throws InterruptedException {
		driver.get(url);
		
		WebElement fromBox = driver.findElement(By.id("from0"));
		fromBox.click();
		Thread.sleep(1000);
		fromBox.sendKeys(Keys.CONTROL + "A");
		fromBox.sendKeys(Keys.DELETE);
		fromBox.sendKeys("New");
		Thread.sleep(500);
		
		for(int i=0;i<3;i++) {
			fromBox.sendKeys(Keys.ARROW_DOWN);
		}
		
		fromBox.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		WebElement toBox = driver.findElement(By.id("to0"));
		//toBox.click();
		//toBox.sendKeys(Keys.CONTROL + "A");
		toBox.sendKeys(Keys.DELETE);
		toBox.sendKeys("Miami");
		Thread.sleep(500);
		toBox.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		// Calendar
		// Current date
//		WebElement fromDate = driver.findElement(By.xpath("//a[@class=' month-date is--today']"));
		WebElement fromDate = driver.findElement(By.xpath("(//a[@class=' month-date'])[3]"));
		fromDate.click();
		Thread.sleep(500);
		// Next day
		WebElement toDate = driver.findElement(By.xpath("(//a[@class=' month-date'])[6]"));
		toDate.click();
		
		// Traveller button
		WebElement traveller = driver.findElement(By.id("travellerButton"));
		traveller.click();
		Thread.sleep(500);
		// Add 2 adults
		for(int i=0;i<2;i++) {
			driver.findElement(By.id("addadults")).click();
		}
		// Add 1 senior
		driver.findElement(By.id("addseniors")).click();
		// Add 1 child
		driver.findElement(By.id("addchild")).click();
		
		// Choose child age from static dropdown
		Select childAgeDrpDown = new Select(driver.findElement(By.name("ChildrenAge")));
//		childAgeDrpDown.selectByIndex(1);
//		childAgeDrpDown.selectByValue("5");
		childAgeDrpDown.selectByVisibleText("12");
//		childAgeDrpDown.deselectAll();
//		childAgeDrpDown.isMultiple();
		
		// Add 1 seat infant
		driver.findElement(By.id("addinfant")).click();
		// Add 1 lap infant
		driver.findElement(By.id("addlapinfant")).click();
		// Close the page
		driver.findElement(By.id("closeDialog")).click();
		
		// Choose direct flights
		driver.findElement(By.name("directFlightCheckname")).click();
		// Search for flights
		driver.findElement(By.id("searchNow")).click();
		
	}
}
