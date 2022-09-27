package com.jbk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SubMenusOfFashionMenu {
	public static WebElement SingleSubMenu;
	public  void getAllSubMenu() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		WebElement FashionMenu = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions act = new Actions(driver);
		act.moveToElement(FashionMenu).perform();
		WebElement SubMenuList = driver.findElement(By.xpath("//*[contains(@class,'_6WOcW9 _2-k99T')]"));
		act.moveToElement(FashionMenu).perform();
		List<WebElement> MensTopWearSubmenus = driver.findElements(By.xpath("//*[contains(@class,'_6WOcW9 _3YpNQe')]"));
		ArrayList<String> AllLinksMensTopWearSubmenus = new ArrayList<String>();
		Iterator<WebElement> itr = MensTopWearSubmenus.iterator();
		while (itr.hasNext()) {
			SingleSubMenu = itr.next();
			System.out.println(SingleSubMenu.getText());
			AllLinksMensTopWearSubmenus.add(SingleSubMenu.getText());
			}
			
			System.out.println("AllLinksMensTopWearSubmenus are  "+ AllLinksMensTopWearSubmenus);
			
		

	}

}
