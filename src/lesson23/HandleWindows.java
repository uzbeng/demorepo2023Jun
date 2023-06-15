package lesson23;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWindows extends Base {
	
	@Test
	public void testWindows() {
		driver.get("https://www.letskodeit.com/practice");
		
		driver.findElement(By.id("benzradio")).click();
		
		// Get current window id:
		String curWinId = driver.getWindowHandle();
		System.out.println(curWinId);		
		
		// Click and open new window:
		driver.findElement(By.id("openwindow")).click();
		
		// Get both windows ids:
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		String childWinId = null;
		// Get the child window id:
		for(String id: ids) {
			if(!id.equals(curWinId)) {
				childWinId = id;
			}
		}
		
		// Switch to the child window
		driver.switchTo().window(childWinId);
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
				
		driver.switchTo().window(curWinId);
		driver.findElement(By.id("bmwcheck")).click();
		driver.quit();
		
	}

}
