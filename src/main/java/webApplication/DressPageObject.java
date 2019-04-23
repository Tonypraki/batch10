package webApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObject extends BasePage {
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/div/p[2]")
	private WebElement BoxText;

	@FindBy(xpath = "//*[@id=\"layered_block_left\"]/p")
	private WebElement Catalog;

	@FindBy(xpath = "//*[@id=\"layered_id_attribute_group_1\"]")
	private WebElement SmallSize;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement FirstDress;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/div[2]/span[3]")
	private WebElement DiscountDress;

	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement SmallText;


	public DressPageObject() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getBoxText() {
		return BoxText;
	}

	public WebElement getCatalog() {
		return Catalog;
	}
	public WebElement getSmallSize() {
		return SmallSize;
	}
	public WebElement getFirstDress() {
		return FirstDress;
	}
	public WebElement getDiscountDress() {
		return DiscountDress;
	}
	public WebElement getSmallText() {
		return SmallText;
	}
	public void clickSmallSize() {
		SmallSize.click();	
		}
		public void clickFirstDress() {
			FirstDress.click();	
			}
	
	}	

