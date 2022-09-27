package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTest {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

	    
	    String searchSubMenu = "Electronics";

	    int totalSubMenu = driver.findElements(By.xpath("//*[contains(@class,'eFQ30H')]")).size();

	    System.out.println("Search for : " +searchSubMenu);
	    System.out.println(totalSubMenu);

		
		 for(int i=1; i<=totalSubMenu; i++) {
String getTextSubMenu =driver.findElement(By.xpath("(//*[contains(@class,'eFQ30H')])[" +i+"]")).getText(); 
System.out.println("Get Sub Menu Title : "+getTextSubMenu); 

/*if (getTextSubMenu.equals(searchSubMenu)) {
	
driver.findElement(By.xpath("(//*[contains(@class,'eFQ30H')])[" +i+"]")).click(); */
Thread.sleep(1000); 
/*
 * String targetAllGetText
 * =driver.findElement(By.xpath("(//*[contains(@class,'_3voSl0')])["
 * +i+"]")).getText(); System.out.println(targetAllGetText);
 */
	//break; 
		 } 
		 
   Actions act=new Actions(driver);
   WebElement menuEle=driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
   act.moveToElement(menuEle).perform();
   int totalSubMenuEle = driver.findElements(By.xpath("//*[contains(@class,'_6WOcW9 _3YpNQe')]")).size();
			System.out.println(totalSubMenuEle);
			for(int i=1;i<=totalSubMenuEle;i++) {
				String getTextSubMenuEle =driver.findElement(By.xpath("(//*[contains(@class,'_6WOcW9 _3YpNQe')])[" +i+"]")).getText(); 
				System.out.println("Get SubEle Menu Title : "+getTextSubMenuEle); 
				
				
			}
		
	}

}
