package com.pom.pages;

import org.openqa.selenium.By;
import com.pom.base.BaseClass;

public class WebAppSecurityPage extends BaseClass {
	
	public void SignIN() {
		//driver.findElement(By.xpath("id = signin_button")).click();
		
		driver.findElement(By.xpath("id = signin_button")).click();
	}

//	public void EnterEmail() {
//		driver.findElement(By.id("email")).sendKeys("dilipluhar@gmail.com");
//	}
}
