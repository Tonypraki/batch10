package webApplication;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dresses;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirts;


	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return Dresses;
	}
	public WebElement getWomen() {
		return Women;
	}
	public WebElement getTshirts() {
		return Tshirts;
	}
	
	public void clickWomen() {
	Women.click();	
	}
	public void clickDresses() {
		Dresses.click();	
		}
	public void clickTshirts() {
		Tshirts.click();	
		}

	}	
