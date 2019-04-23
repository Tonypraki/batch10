package test;

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
		Assert.assertTrue(homePage.getWomen().isDisplayed());
	
		Assert.assertTrue(homePage.getDresses().isDisplayed());

		Assert.assertTrue(homePage.getTshirts().isDisplayed());
	}
}
