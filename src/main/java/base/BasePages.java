package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePages {
	
protected WebDriver driver;

public BasePages(WebDriver driver) {
	this.driver = driver; 
}

public static void clicking(WebElement element) {
	element.click();
}
public static void sendText(WebElement element, String text) {
	element.sendKeys(text);
}
}
