package lesson23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleAlerts extends Base {
	
	@Test
	public void alertExample() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		// Handle alert:
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("enabled-button")).click();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		// Handle alert:
		Alert confirmAlertPopUp = driver.switchTo().alert();
		String alertText = confirmAlertPopUp.getText();
		confirmAlertPopUp.dismiss();
		confirmAlertPopUp.sendKeys("Cert3484730203");
		
		// Assert/Verify/Test
		Assert.assertEquals(alertText, "Are you sure you want to confirm?", "Alert text validation failed");
//		System.out.println(alertText);
		Assert.assertTrue(5 < 3, "Boolean validation failed");
		
	}

}
