package com.pom.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.base.BaseClass;

public class SauceDemoAction extends BaseClass  implements ActionInterface {
	
	@FindBy (id = "add-to-cart-sauce-labs-bike-light")
	private WebElement bikeLight ;
	
	@FindBy (id = "add-to-cart-sauce-labs-backpack")
	private WebElement bagPack ;
	
	@FindBy (xpath ="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy (id = "checkout")
	private WebElement checkOut ;
	
	@FindAll ({@FindBy(xpath="//div[@class='inventory_item_name ']")})
	private List<WebElement> allProducts ;
	
	public void AddToCartBikeLight() {
		try {
			if (bikeLight.isDisplayed()) {
				System.out.println("Element is present");
				bikeLight.click();
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void AddToCartbagPack() {
		try {
			if (bagPack.isDisplayed()) {
				System.out.println("Element is present");
				bagPack.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void GoToCart() {
		try {
			if (cart.isDisplayed()) {
				System.out.println("Element is present");
				cart.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void GoToCheckOut() {
		try {
			if (checkOut.isDisplayed()) {
				System.out.println("Element is present");
				checkOut.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void SelectAllProducts() {
		for (WebElement product : allProducts) {
			System.out.println(product.getText());
		}
	}
	@Override
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
}
