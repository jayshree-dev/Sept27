package com.jbk;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	
	public static WebDriver driver=null;
    
    
	static String CONFIG = "Y"; // this you can bring later from property file
    // opening of url
    public  void captureScreenshot(String filename) throws IOException, WebDriverException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
        driver=new ChromeDriver();
            driver.get("http://www.javabykiran.com/selenium/demo/");
          
            
            
            try {
				if (CONFIG.equals("Y")) { 
				  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileUtils.copyFile(scrFile,
				      new File(System.getProperty("user.dir") + "//screenshots//"+"abc.jpg"));
      }
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
    	
    	
    	
	}
    	



	
	
	
	
	
	
}
