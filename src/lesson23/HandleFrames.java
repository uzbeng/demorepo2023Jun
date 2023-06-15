package lesson23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleFrames extends Base {
	
	@Test
	public void frameTest() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.id("benzradio")).click();
		
		// Scroll:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		// Switch to iframe:
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe-name");
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(1000);
//		driver.findElement(By.id("search")).click();
//		driver.findElement(By.id("search")).sendKeys("Test123");
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		
		
		// Switch back to the main page:
		driver.switchTo().defaultContent();
		
		// Click on BMW checkbox:
		driver.findElement(By.id("bmwcheck")).click();
	}

}
