package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.base;
import pages.LoginPage;

public class LoginTest extends base {
	
	LoginPage lp;
	String expected_title= "Guru99 Bank Manager HomePage";
	
	@Test
	public void login() {
		lp= new LoginPage(dr);
		log.info("entering username");
		lp.enterUsername(prop.getProperty("username"));
		log.info("entering password");
		lp.enterPassword(prop.getProperty("password"));
		log.info("click sign in button");
		lp.clickSigninButton();
		Assert.assertEquals(dr.getTitle(), expected_title);
	}
	
	@Test
	public void verifyTitle() {
		lp= new LoginPage(dr);
		lp.verifyTitle(expected_title);
	}

}
