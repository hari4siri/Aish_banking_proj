package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddCustomerPage {
public WebDriver dr;
	
	public AddCustomerPage(WebDriver dr){
		this.dr=dr;
	}
	
	// Create a reference
    JavascriptExecutor js = (JavascriptExecutor)dr;
   
    
    
	public By customer_name= By.xpath("//input[@name='name']");
	public By gender = By.xpath("//input[@value='f']");
	public By dob = By.xpath("//input[@id='dob']");
	
	public By address = By.xpath("//textarea[@name='addr']");
	public By city = By.xpath("//input[@name='city']");
	public By state = By.xpath("//input[@name='state']");
	public By pin = By.xpath("//input[@name='pinno']");
	public By tel = By.xpath("//input[@name='telephoneno']");
	public By email = By.xpath("//input[@name='emailid']");
	public By password = By.xpath("//input[@name='password']");
	public By submit = By.xpath("//input[@name='sub']");
	public By confirm_reg = By.xpath("//p[text()='Customer Registered Successfully!!!']");
	
	
	public void enterCustomerName(String name) {
		dr.findElement(customer_name).sendKeys(name);
	}
	
	public void selectGender() {
		dr.findElement(gender).click();
	}
	
	public void EnterDob(String date_value) {
		WebElement dt= dr.findElement(dob);
		Actions actions = new Actions(dr);
        actions.moveToElement(dt);
        actions.click();
        actions.sendKeys(date_value);
        actions.build().perform();
		
	}
	
	public void EnterAddress(String addr) {
		dr.findElement(address).sendKeys(addr);
	}
	
	public void EnterCity(String cit) {
		dr.findElement(city).sendKeys(cit);
	}
	
	public void EnterState(String st) {
		dr.findElement(state).sendKeys(st);
	}
	
	public void EnterPin(String pn) {
		dr.findElement(pin).sendKeys(pn);
	}
	
	public void EnterEmail(String em) {
		dr.findElement(email).sendKeys(em);
	}
	
	public void EnterTel(String te) {
		dr.findElement(tel).sendKeys(te);
	}
	
	public void EnterPass(String pw) {
		dr.findElement(password).sendKeys(pw);
	}
	
	public void ClikSubmit() {
		dr.findElement(submit).click();
	}

	public String getconfirmationMessage() {
		return dr.findElement(confirm_reg).getText();
	}
}
