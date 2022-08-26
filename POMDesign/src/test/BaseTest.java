package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.LoginPage;
import main.PimPage;

public class BaseTest {
	
	public static WebDriver driver;
	protected LoginPage loginpage;
	protected PimPage pimPage;
	
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void pageObjects() {
		loginpage = new LoginPage(driver);
		pimPage = new PimPage(driver);
	}
	
	@AfterClass
	public void tearDownEnvirnment() {
		driver.quit();
	}
	
	

}
