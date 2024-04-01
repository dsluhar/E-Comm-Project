package com.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.base.BaseClass;
import com.pom.pages.FaceBookHomePage;

public class TestFacebookPage {

	@Test
	public void TestFaceBookHomePage() {
		FaceBookHomePage homePage = new FaceBookHomePage();
		homePage.EnterEmail();
		homePage.EnterPassword();
		homePage.ClickSignIn();
		//Obj.CloseBrowser();
		//input[@id='identifierId']
	}
}
