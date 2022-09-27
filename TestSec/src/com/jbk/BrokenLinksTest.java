package com.jbk;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HttpConnection;

public class BrokenLinksTest {
	
	public static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\javabyKiran\\Desktop\\set\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.co.in");
	 List<WebElement>    allLinks=driver.findElements(By.tagName("a"));
                  System.out.println("allLinks.size()") ;
                  for(int i=0;i<=allLinks.size();i++) {
                WebElement ele      =allLinks.get(i);	  
                	  String url=ele.getAttribute("href");
                	  verifyLink(url);
                	  
                	  
                	  
                  }
                  }
                  public static void verifyLink(String linkurl) {
                	try {  
                	  URL url=new URL(linkurl);
                	HttpURLConnection con=(HttpURLConnection) url.openConnection();
                	con.connect();
                	if(con.getResponseCode()==200) {
                		
                		System.out.println(con.getResponseMessage());
                		
                	}
                	  if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
                		  
                		  System.out.println(con.getResponseMessage());
                	  }
                	  
                	
                	  
                	  
                  }
                	catch(Exception e){
                	e.printStackTrace();
                		
                		
                	}
                	  
                  


	 
	 
	 




}
}