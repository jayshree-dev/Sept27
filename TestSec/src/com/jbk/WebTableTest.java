package com.jbk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/javabyKiran/Desktop/Selenium%20Softwares/Offline%20Website%20for%20Testing/Offline%20Website%20for%20Testing/index.html");
		driver.manage().window().maximize();
		WebElement userEle=driver.findElement(By.cssSelector("input[id=email]"));
		userEle.sendKeys("kiran@gmail.com");
		
		WebElement Pwd=driver.findElement(By.cssSelector("input[id=password]"));
		
		Pwd.sendKeys("123456");
		WebElement SIgnIn=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		SIgnIn.click();
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		WebElement Table=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]"));
		
		List<WebElement>   rows =Table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(WebElement rowsloop : rows) {
			
			List<WebElement> columns=rowsloop.findElements(By.tagName("td"));
			
			for(WebElement columnloop:columns ) {
				
				System.out.println(columnloop.getText());
			}
			
			
		}
		
	}
	
	
	

}
