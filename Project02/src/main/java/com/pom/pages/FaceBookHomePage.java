package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.base.BaseClass;

public class FaceBookHomePage extends BaseClass {
	
//	private WebDriver driver;
//
//    public FaceBookHomePage(WebDriver driver) {
//        this.driver = driver;
//    }

	public void EnterEmail() {
		driver.findElement(By.id("email")).sendKeys("dilipluhar@gmail.com");
	}
	
	public void EnterPassword() {
		driver.findElement(By.id("pass")).sendKeys("Lufthansa..250");
	}
	
	public void ClickSignIn() {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}
