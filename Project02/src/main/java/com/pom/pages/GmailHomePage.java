package com.pom.pages;

import org.openqa.selenium.By;
import com.pom.base.BaseClass;


public class GmailHomePage extends BaseClass {
	
	public void EnterEmaiID() {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sqadilip@gmail.com");
	}
	
	public void ClickNext1() {
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
	
	public void EnterPassword() {
		driver.findElement(By.xpath("//Passwd")).sendKeys("Spark@301");
	}
		
	public void ClickNext2() {
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}
	
    public void loginGmail() {
    	EnterEmaiID();
    	ClickNext1();
    	EnterPassword();
    	ClickNext2();
    }

}
