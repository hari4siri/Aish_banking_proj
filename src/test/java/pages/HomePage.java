package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver dr;
	
	public HomePage(WebDriver dr) {
		this.dr=dr;
	}
	
	public void clickTab(String name) {
		List<WebElement> tabs=dr.findElements(By.tagName("a"));
		for(WebElement tab: tabs) {
			String Tab_text=tab.getText();
			if(Tab_text.equals(name)) {
				tab.click();
			}
			
		}
	}

}
