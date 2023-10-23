package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.base;
import pages.AddCustomerPage;
import utilities.HelperMethods;

public class AddCustomerTest extends base {
	
	AddCustomerPage acp;
	HelperMethods help = new HelperMethods();
	
	String Cust_name = "testingone";
	String date="10-10-1990";
	String addr = "kr puram";
	String city= "blr";
	String state="kar";
	String pin = "345345";
	String tel= "2342342342";
	String email=help.generateRandomText()+"@gmail.com";
	String pass="hello";
	String expected_confirm_message= "Customer Registered Successfully!!!";
	
	
	
	@Test
	public void addCustomer() throws InterruptedException {
		acp = new AddCustomerPage(dr);
		acp.enterCustomerName(Cust_name);
		acp.selectGender();
		acp.EnterDob("22-10-1987");
		acp.EnterAddress(addr);
		acp.EnterCity(city);
		acp.EnterState(state);
		acp.EnterPin(pin);
		acp.EnterTel(tel);
		acp.EnterEmail(email);
		acp.EnterPass(pass);
		Thread.sleep(2000);
		acp.ClikSubmit();
		Assert.assertEquals(acp.getconfirmationMessage(), "asdf");
	}

}
