package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\gghg\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        System.out.println("i m inn");
        driver.get("file:///C:/Users/javabyKiran/Desktop/Selenium%20Softwares/Offline%20Website%20for%20Testing/Offline%20Website%20for%20Testing/index.html");
		System.out.println("in git");
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aaa");
        driver.().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("bbb");
        WebElement SIgnon=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
        WebDriverWait wait=new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(SIgnIn));
        
        SIgnIn.click();

}}
