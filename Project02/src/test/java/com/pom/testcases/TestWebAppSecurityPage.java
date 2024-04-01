package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.pages.WebAppSecurityPage;

public class TestWebAppSecurityPage {
//	WebDriver driver = new ChromeDriver();	
	@Test
	public void TestWebAppSecurityPg() {
	WebAppSecurityPage Obj = new WebAppSecurityPage();
	Obj.SignIN();
	}

}
