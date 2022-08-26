package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import test.BaseTest;

public class LoginPage extends BaseTest {
	
    @FindBy(xpath = "//*[text() = 'Username']//parent::div//parent::div//input")
	WebElement username;
    @FindBy(xpath = "//*[text() = 'Password']//parent::div//parent::div//input")
   	WebElement password;
    @FindBy(xpath = "//button[@type = 'submit']")
   	WebElement btnlogin;
    
    @FindBy(xpath = "//h5[text() = 'Login']")
   	WebElement txtLoginPage;

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		btnlogin.click();
	}
	
	public String titleLoginPage() {
		return txtLoginPage.getText();
	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();
	}
	
	
	

}
