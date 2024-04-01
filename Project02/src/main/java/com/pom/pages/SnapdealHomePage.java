package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.pom.base.BaseClass;

public class SnapdealHomePage extends BaseClass {

	public void FindProduct() {
		driver.findElement(By.id("inputValEnter")).sendKeys("Laptop", Keys.ENTER);
	}
}
