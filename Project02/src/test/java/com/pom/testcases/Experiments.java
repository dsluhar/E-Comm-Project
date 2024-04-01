package com.pom.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Experiments {
	
	WebDriver wd;
	
	@Test
	public void test() {
	wd = new ChromeDriver();
//	wd.get("http://www.gmail.com");
//	wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    
//	wd.manage().window().maximize();
//	ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
//	wd.switchTo().window(tabs.get(0));
//	//To navigate to new link/URL in 2nd new tab
//	wd.get("http://www.facebook.com");
//	wd.close();
//	wd.quit();
	String ANSI_BOLD = "\u001B[1m";
	String ANSI_RESET = "\u001B[0m";
	wd.get("https://www.google.com");
	wd.findElement(By.name("q")).sendKeys("candle", Keys.ENTER);
	wd.manage().window().maximize();
	
	List<WebElement> candles = wd.findElements(By.tagName("h3"));
	//List<WebElement> candles = wd.findElements(By.cssSelector("a"));
	System.out.println(ANSI_BOLD + "The different products for search results are :" +ANSI_RESET);   
	for (WebElement candle : candles) {
		System.out.println(""+candle.getText());
		
	}
	}
	
}