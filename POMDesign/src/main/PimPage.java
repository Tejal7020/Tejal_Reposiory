package main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.BaseTest;

public class PimPage extends BaseTest {
	
	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement txtPage;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	List <WebElement> checkAll;
	
	 @FindBy(xpath="//input[@type='checkbox']")
	 List<WebElement> checkInput;
	
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String titleOfPimPage() {
		return txtPage.getText();
	}
	
	public void checkall() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		checkAll.get(0).click();
	}
	
	public boolean checkInput() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    boolean btn1 = checkInput.get(0).isSelected();
		System.out.println(btn1);
		return btn1;
	}

	

	
	

}
