package css_selector;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssDemo {
	
	WebDriver driver = null;
	
	@BeforeMethod
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
	
	//@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

	@Test
	public void test1() {
		System.out.println("Starting test 1");
		// Open the website
		driver.get("https://google.com");
		
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("selenium");
		
	}

}
