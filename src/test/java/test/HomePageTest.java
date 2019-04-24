package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import webApplication.BasePage;
import webApplication.HomePageObjects;

public class HomePageTest {
	HomePageObjects homePage;
	BasePage bp;

	public HomePageTest() {
		homePage = new HomePageObjects();
		bp = new BasePage();
	} 

	@Test
	public void verifytabs() {
		AssertJUnit.assertTrue(homePage.getWomen().isDisplayed());
	
		AssertJUnit.assertTrue(homePage.getDresses().isDisplayed());

		AssertJUnit.assertTrue(homePage.getTshirts().isDisplayed());
	}
}
