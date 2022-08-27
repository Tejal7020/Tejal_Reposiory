package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority = 0)
	public void verifycurrentUrl() {
		AssertJUnit.assertEquals(loginpage.currentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 1)
	public void verifytitleLoginPage() {
		AssertJUnit.assertEquals(loginpage.titleLoginPage(),"Login");
	}
	
	@Test(priority = 2)
	public void verifyLogin() {
		loginpage.loginMethod();
		AssertJUnit.assertEquals(pimPage.titleOfPimPage(),"PIM");
	}

	
	
}
