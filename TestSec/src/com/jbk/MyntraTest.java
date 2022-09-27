package com.jbk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MyntraTest {
	public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	ele.sendKeys("bags");
	Actions act=new Actions(driver);
	act.moveToElement(ele).sendKeys(Keys.ENTER);
	act.moveToElement(ele).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	
	act.click();
	//Alert alert=driver.switchTo().alert();
	//alert.accept();
	WebElement drpdown=driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
	Actions act1=new Actions(driver);
	act1.moveToElement(drpdown).perform();
	Thread.sleep(1000);
	//drpdown.click();
	driver.findElement(By.xpath("//label[normalize-space()='Price: High to Low']")).click();
	//act.moveToElement(wht);
	//act.click().build().perform();
	//drpdown.click();.
	//WebElement eleS=driver.findElement(By.xpath("//span[normalize-space()='Price: High to Low']"));
	
	
	/*WebDriverWait wait=new WebDriverWait(driver, 15);
	WebElement name=wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//li[1]//a[1]//div[2]"))));
	//WebElement name=driver.findElement(By.xpath("//li[1]//a[1]//div[2]"));
	String aname=name.getText();
	System.out.println(aname);
	name.click();
	//driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[3]/ul[1]/li[4]/label[1]")).click();
	
	  String pw=driver.getWindowHandle();
	   Set<String> allW=driver.getWindowHandles(); 
	   Iterator<String> itr= allW.iterator();
	  
	  while(itr.hasNext()){ 
	  String ChildW=itr.next();
	  driver.switchTo().window(ChildW); 
	  Thread.sleep(3000);
	  WebElement ele2=driver.findElement(By.xpath("//h1[normalize-space()='Tommy Hilfiger']"));
	  
	  System.out.println(ele2.getText());
	for (String winHandle : driver.getWindowHandles()) {
	    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	System.out.println(driver.getTitle());
	
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,300)");
	 
	WebElement ele2=driver.findElement(By.xpath(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")); 
	ele2.click();
	 */
	 
	  WebElement women=driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
	  Actions act4=new Actions(driver);
	  act4.moveToElement(women).perform();
	  driver.findElement(By.xpath("//a[norm                                                                                                                                                                                                                                                                                                                                                         alize-space()='Sarees']")).click();
	 
	}
	
	

	  
	  }
	 
	
	
