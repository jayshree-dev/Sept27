package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/javabyKiran/Documents/Selenium%20Softwares/Offline%20Website%20for%20Testing/Offline%20Website%20for%20Testing/index.html");
		driver.manage().window().maximize();
		Actions builder=new Actions(driver);
		WebElement uname=driver.findElement(By.id("email"));
		
		uname.sendKeys("javabykiran");
		//builder.moveToElement(uname).click().keyDown(uname, Keys.SHIFT).sendKeys(uname, "javaby").build().perform();
		
		//builder.moveToElement(uname).contextClick().build().perform();
		builder.moveToElement(uname).click().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		builder.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
	}

}
