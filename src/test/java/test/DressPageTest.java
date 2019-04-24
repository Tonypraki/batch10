package test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
	
	AssertJUnit.assertTrue(dresspage.getCatalog().isDisplayed());

	AssertJUnit.assertTrue(dresspage.getBoxText().isDisplayed());

	AssertJUnit.assertTrue(dresspage.getSmallSize().isDisplayed());
	
	AssertJUnit.assertTrue(dresspage.getFirstDress().isDisplayed());

	AssertJUnit.assertTrue(dresspage.getDiscountDress().isDisplayed());

	AssertJUnit.assertTrue(dresspage.getSmallText().isDisplayed());

}

}