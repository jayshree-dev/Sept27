package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/frames";
		
		driver.get(url);
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-bottom");
		WebElement l = driver.findElement(By.cssSelector("body"));
	      System.out.println("Bottom frame text: " +l.getText());
	      driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
