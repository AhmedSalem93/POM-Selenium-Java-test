package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePages;

public class HomePage extends BasePages {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
By registerbutton = By.className("ico-register");
By loginbutton = By.className("ico-login");

WebElement registerButtonElement;
WebElement loginButtonElement;

public RegisterPage clickOnRegisterBottun() {
	
	registerButtonElement = driver.findElement(registerbutton);

	clicking(registerButtonElement);
	return new RegisterPage(driver);
}
public void clickOnloginBottun() {
	
	loginButtonElement = driver.findElement(loginbutton);

	clicking(loginButtonElement);
}
}
