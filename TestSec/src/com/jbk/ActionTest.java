package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/javabyKiran/Desktop/Selenium%20Softwares/Offline%20Website%20for%20Testing/Offline%20Website%20for%20Testing/index.html");
		driver.manage().window().maximize();
		WebElement userEle=driver.findElement(By.cssSelector("input[id=email]"));
		
		/*
		 * Actions builder=new Actions(driver); Action seriesOfActions =
		 * builder.moveToElement(userEle).click().keyDown(userEle, Keys.SHIFT).
		 * sendKeys(userEle, "javabykiran").contextClick().build();
		 * seriesOfActions.perform();
		 */
		
		/*
		 * Actions a=new Actions(driver);
		 * a.keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("s").build().perform();
		 */
		Actions a1=new Actions(driver);
		a1.moveToElement(userEle).contextClick().build().perform();
	}
	
}
