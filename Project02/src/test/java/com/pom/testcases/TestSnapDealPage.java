package com.pom.testcases;

import org.testng.annotations.Test;

import com.pom.pages.SnapdealHomePage;

public class TestSnapDealPage {
	
	@Test
	public void TestSnapDeal() {
		SnapdealHomePage Obj1 = new SnapdealHomePage();
		Obj1.FindProduct();
	}

}
