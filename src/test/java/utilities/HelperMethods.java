package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.base;

public class HelperMethods extends base {
	
	public String generateRandomText() {
		return RandomStringUtils.randomAlphabetic(4);
	}
	
	public void captureScreen(String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		//System.out.println("Screenshot taken");
	}

}
