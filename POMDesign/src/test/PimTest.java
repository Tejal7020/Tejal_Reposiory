package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import main.LoginPage;

public class PimTest extends BaseTest {
	
	@BeforeMethod
	public void login() {
		loginpage.loginMethod();
	}
	
	/*
	@Test(priority = 3)
	public void verifyPimPage() {
		AssertJUnit.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}*/
	
	@Test(priority = 4)
	public void verifychecklist() {
		pimPage.checkall();
		AssertJUnit.assertEquals(pimPage.checkInput(), true);
	}
	
	
	
	

}
