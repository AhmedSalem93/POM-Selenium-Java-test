package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {
	
	protected WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
	}

	@AfterTest
	public void tearDown() {
		//if (driver != null) {
			//driver.quit();
		//}
	}
}
