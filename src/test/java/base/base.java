package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
public static WebDriver dr;
public Properties prop;
FileInputStream fis;

public Logger log;
	
	@BeforeTest
	public void setup() throws IOException {
		prop = new Properties();
		fis = new FileInputStream("C:\\Users\\Thanuja\\eclipse-workspace\\BankingAishwarya\\src\\test\\java\\utilities\\global.properties");
		
		prop.load(fis);
		String browser= prop.getProperty("browser");
		
		if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			dr=new FirefoxDriver();
	}	
	
		else if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			dr= new ChromeDriver();
		}
		 log= Logger.getLogger("mylogs");
		 PropertyConfigurator.configure("log4j.properties");
		 log.info("opening the browser");

		dr.get("https://demo.guru99.com/V4/index.php");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 log.info("maximising the browser");
		dr.manage().window().maximize();
	}
	
	@AfterTest
	public void teardown() {
		dr.quit();
	}

}
