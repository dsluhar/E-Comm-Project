package com.pom.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.base.BaseClass;
import com.pom.pages.SauceDemoLogin;
import com.pom.pages.SauceDemoLogin;

public class TestSauceDemoLogin extends BaseClass  {
	
	@Test
	public void LoginTest() {
		
		SauceDemoLogin SDL = PageFactory.initElements(driver, SauceDemoLogin.class);
		SDL.EnterUserName();
		System.out.println("Value of : " +SDL.Username.getAttribute("value"));
		SDL.EnterPassword();
		SDL.ClickLoginBtn();
		
		class CustomWait {
		    private WebDriverWait wait;
		    public CustomWait(WebDriver driver) 
		    {
		        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		    }
		    public void explicitWaitForelementToBeClickable(WebDriver driver, WebElement prodBagPack) 
		    {
		        wait.until(ExpectedConditions.elementToBeClickable(prodBagPack));
		    }
		}
		CustomWait customWait = new CustomWait(driver);
		customWait.explicitWaitForelementToBeClickable(driver,SDL.ProdBagPack);
		
		Assert.assertTrue(SDL.ProdBagPack.isDisplayed(), "element is not present");
		
		System.out.println("Assert Start ");
		System.out.println("Current URL : " +driver.getCurrentUrl());
		String ExpText = driver.getTitle();
		System.out.println("Title of URL : " +ExpText);
		String ActText = "Swag Labs";
		Assert.assertEquals(ExpText,ActText, "Titles are different");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Assert Not Passed");
		System.out.println("Assert End ");
		
		SauceDemoAction SDA = PageFactory.initElements(driver, SauceDemoAction.class);
		SDA.AddToCartBikeLight();
		SDA.AddToCartbagPack();
		SDA.GoToCart();
		SDA.GoToCheckOut();
		SDA.SelectAllProducts();
	}
}
