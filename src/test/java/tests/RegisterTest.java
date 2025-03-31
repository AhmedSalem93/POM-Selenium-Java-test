package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends BaseTests {

	private HomePage homePage;
	private RegisterPage registerPage;
	@Test
	public void validRegisterTC() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		homePage = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		registerPage = homePage.clickOnRegisterBottun();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		registerPage.ChooseGender();
		registerPage.EnterFristName("Ahmed");
		registerPage.EnterLastName("Salem");
		registerPage.EnterEmail("ah@hmail.com");
		registerPage.EnterPasswordField("123123123");
		registerPage.EnterRePasswordField("123123123");
		registerPage.Register();	
	}
	
	
}
