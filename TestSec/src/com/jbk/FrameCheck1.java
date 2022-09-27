package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCheck1 {
	static WebDriver driver;
	 public static WebElement framebig;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");

		driver= new ChromeDriver();
		String url = "https://demoqa.com/frames";
		driver.get(url);
		framebig=driver.findElement(By.id("frame1"));
		
		switchToFrame(framebig);
	
	}
	public static boolean isElementPresent(WebElement framebig) {
		try {
			driver.switchTo().frame(framebig);
			return true;
		}catch(NoSuchFrameException e) {
			
			System.out.println("Unable to locate frame with id " + framebig
                    + e.getStackTrace());
			return false;
		
			
		}
		
		
		
		
		
		
		
	}
	public static void switchToFrame(WebElement framebig) { 
	    try {
	      if (isElementPresent(framebig)) { 
	        driver.switchTo().frame(framebig);
	        System.out.println("Navigated to frame with element "+ framebig);
	    } 
	      else {
	            System.out.println("Unable to navigate to frame with element "+ framebig);
	        }
	    } 
	    catch (NoSuchFrameException e) {
	            System.out.println("Unable to locate frame with element " + framebig
	                                + e.getStackTrace());
	          } catch (StaleElementReferenceException e) { 
	                System.out.println("Element with " + framebig
	                                    + "is not attached to the page document" + e.getStackTrace());
	             } catch (Exception e) {
	                  System.out.println("Unable to navigate to frame with element " 
	                                      + framebig + e.getStackTrace());
	                }
}}
