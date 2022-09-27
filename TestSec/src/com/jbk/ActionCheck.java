package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCheck {
	public static void main(String[] args) {
           Actions act;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//driver.get("https://www.stqatools.com");

		// Create object of Action class
		

		/*
		 * // Sendkeys using Action class object
		 * action.sendKeys(Keys.ENTER).build().perform();
		 * 
		 * // Send mulyiple keys using action class
		 * action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 */
		/*// Send single key using sendkeys
		driver.findElement(By.xpath("ele_path")).sendKeys(Keys.ENTER);
		 
		// Handle multiple keys using chord
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		 //Navigate to the demo site
*/        driver.get("https://demoqa.com/text-box");
              act=new Actions(driver);
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
       // String currentAddress1=currentAddress.toString();
        
        
        // Copy the Current Address
        act.moveToElement(currentAddress).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		/*
		 * currentAddress.sendKeys(Keys.CONTROL); currentAddress.sendKeys("C");
		 * 
		 * //Press the TAB Key to Switch Focus to Permanent Address
		 *currentAddress.sendKeys(Keys.TAB);
		 * 
		 * //Paste the Address in the Permanent Address field WebElement
		 * permanentAddress=driver.findElement(By.id("permanentAddress"));
		 * permanentAddress.sendKeys(Keys.CONTROL); permanentAddress.sendKeys("V");
		 * 
		 * //Compare Text of current Address and Permanent Address
		 * //assertEquals(currentAddress.getAttribute("value"),permanentAddress.
		 * getAttribute("value"));
		 * 
		 * //driver.close();
		 */
        //currentAddress.sendKeys(Keys.TAB);
        //WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        act.sendKeys(Keys.TAB);
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        
        
	}
		}
		

