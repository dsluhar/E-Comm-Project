package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoLogin {
	
	WebDriver driver;
	
	public SauceDemoLogin(WebDriver driver) 
		{
		this.driver = driver;
		}

	@FindBy (id = "user-name")
	public WebElement Username ;
	
	@FindBy (id="password")
	WebElement Password ;
	
	@FindBy (id="login-button")
	WebElement LoginButton;
	
	@FindBy (xpath="//img[@alt='Sauce Labs Backpack' and contains(@class, 'inventory_item_img')]")
	public WebElement ProdBagPack ;
	
	public void EnterUserName() {
		Username.sendKeys("standard_user");
	}
	
	public void EnterPassword() {
		Password.sendKeys("secret_sauce");
	}
	
	public void ClickLoginBtn() {
		LoginButton.click();
	}
	
}
