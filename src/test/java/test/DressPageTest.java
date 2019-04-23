package test;
import webApplication.DressPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import webApplication.BasePage;



public class DressPageTest {
	DressPageObject dresspage;
	BasePage bp;
	
	public DressPageTest() {
		dresspage = new DressPageObject();
		bp = new BasePage();
	}

@Test
public void verifyDressSize() {
	
	Assert.assertTrue(dresspage.getCatalog().isDisplayed());

	Assert.assertTrue(dresspage.getBoxText().isDisplayed());

	Assert.assertTrue(dresspage.getSmallSize().isDisplayed());
	
	Assert.assertTrue(dresspage.getFirstDress().isDisplayed());

	Assert.assertTrue(dresspage.getDiscountDress().isDisplayed());

	Assert.assertTrue(dresspage.getSmallText().isDisplayed());

}

}