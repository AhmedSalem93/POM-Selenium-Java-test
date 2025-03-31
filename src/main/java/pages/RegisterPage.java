package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePages;

public class RegisterPage extends BasePages {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
private By genderMale = By.id("gender-male");
private WebElement genderMaleElement;
private By fristName = By.id("FristName");
private WebElement fristNameElement;
private By lastName = By.id("LastName");
private WebElement lastNameElement;
private By emailField = By.id("Email");
private WebElement emailFieldElement;
private By passwordField = By.id("Password");
private WebElement passwordFieldElement;
private By rePasswordField = By.id("ConfirmPassword");
private WebElement rePasswordFieldElement;
private By registerButton = By.id("register-bottun");
private WebElement registerButtonElement;

public void EnterFristName(String fName) {
	fristNameElement = driver.findElement(fristName);
			sendText(fristNameElement,fName );
}
public void EnterLastName(String lName) {
	lastNameElement = driver.findElement(lastName);
	sendText(lastNameElement,lName );
}
public void EnterEmail(String mail) {
	emailFieldElement = driver.findElement(emailField);
	sendText(emailFieldElement,mail );
}
public void EnterPasswordField(String pass) {
	passwordFieldElement = driver.findElement(passwordField);
	sendText(passwordFieldElement,pass );
}
public void EnterRePasswordField(String rePass) {
	rePasswordFieldElement = driver.findElement(rePasswordField);
	sendText(rePasswordFieldElement,rePass );
}
public void ChooseGender() {
	genderMaleElement = driver.findElement(genderMale);
	clicking(genderMaleElement);
}
public void Register() {
	registerButtonElement = driver.findElement(registerButton);
	clicking(registerButtonElement);
}

}
