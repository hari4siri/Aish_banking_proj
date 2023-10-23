package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.base;
import pages.AddCustomerPage;
import pages.HomePage;

public class HomePageTest extends base{
	
	HomePage hp;
	AddCustomerPage ap;
	public String tab_name="New Customer";
	
	@Test
	public void clickTab() {
		hp= new HomePage(dr);
		ap= new AddCustomerPage(dr);
		hp.clickTab(tab_name);
		Assert.assertTrue(dr.findElement(ap.customer_name).isDisplayed());
	}

}
