package hotel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class book {

	public static void main(String[] args) {
		
		
		String value="";
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://adactin.com/HotelApp/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().window().maximize();
WebElement user = driver.findElement(By.id("username"));
user.sendKeys("Tonypraki04");
driver.findElement(By.id("password")).sendKeys("P00KZ4");
driver.findElement(By.id("login")).click();
WebElement dd1 = driver.findElement(By.name("location"));
Select single = new Select (dd1);
single.selectByIndex(3);

WebElement dd2 = driver.findElement(By.id("hotels"));
Select Hotels = new Select (dd2);
Hotels.selectByIndex(3);

WebElement dd3 = driver.findElement(By.id("room_type"));
Select roomtype = new Select (dd3);
roomtype.selectByIndex(3);

WebElement dd4 = driver.findElement(By.name("room_nos"));
Select roomnum = new Select (dd4);
roomnum.selectByIndex(3);

driver.findElement(By.name("datepick_in")).sendKeys("08/04/2019");
driver.findElement(By.name("datepick_out")).sendKeys("09/04/2019");

WebElement dd5 = driver.findElement(By.name("adult_room"));
Select perroom = new Select (dd5);
perroom.selectByIndex(3);

WebElement dd6 = driver.findElement(By.name("child_room"));
Select child = new Select (dd6);
child.selectByIndex(2);

driver.findElement(By.id("Submit")).click();
driver.findElement(By.id("radiobutton_0")).click();
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("first_name")).sendKeys("Tony");
driver.findElement(By.id("last_name")).sendKeys("praki");
driver.findElement(By.id("address")).sendKeys("aravindar st, pondy");
driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");

WebElement dd7 = driver.findElement(By.name("cc_type"));
Select cctype = new Select (dd7);
cctype.selectByIndex(3);

WebElement dd8 = driver.findElement(By.name("cc_exp_month"));
Select exp = new Select (dd8);
exp.selectByIndex(9);

WebElement dd10 = driver.findElement(By.name("cc_exp_year"));
Select year = new Select (dd10);
year.selectByIndex(3);
driver.findElement(By.id("cc_cvv")).sendKeys("353");
driver.findElement(By.id("book_now")).click();
String output = driver.findElement(By.xpath("//input[@name='order_no']")).getAttribute("value");
System.out.println(output);
driver.findElement(By.name("my_itinerary")).click();

		  List<WebElement> list = driver.findElements(By.xpath("(//table)[5]//tr"));
		  
		  int size = list.size();
		  
		  System.out.println(size);
		  
		  for (int i = 2; i <size+1; i++) {
		  
		  value =driver.findElement(By.xpath("(((//table)[5]//tr)["+i+"]/td)[2]/input")).getAttribute("value");
		  
		  if(value.equals(output)) {
		  
		  driver.findElement(By.xpath("(((//table)[5]//tr)["+i+"]/td)[1]/input")).click();
		  driver.findElement(By.name("cancelall")).click();
		  driver.switchTo().alert().accept();
		  }
		  
	  
		  }
		 

System.out.println(value);

}
	}

