package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	public WebDriver dr;
	
	public LoginPage(WebDriver dr){
		this.dr=dr;
	}
	
	//locate Elements/locators
	By username  = By.xpath("//input[@name=\"uid\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By ok = By.name("btnLogin");
	
	//behaviour/methods
	public void enterUsername(String un) {
		dr.findElement(username).sendKeys(un);
	}
	
	public void enterPassword(String pw) {
		dr.findElement(password).sendKeys(pw);
	}
	
	public void clickSigninButton() {
		dr.findElement(ok).click();
	}
	
	public void verifyTitle(String excpected) {
		Assert.assertEquals(dr.getTitle(), excpected);
	}

}
