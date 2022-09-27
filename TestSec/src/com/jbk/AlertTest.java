package com.jbk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest{
	// TODO Auto-generated constructor stub
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();

	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	
	
	
	
	
}}
	
	
	
	
