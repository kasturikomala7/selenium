package Day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TestNG {
	public static  WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//label[@class='margin-left-20px']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='fromCityList']")).click();
	  ExcelData.excel();
	  String a=ExcelData.Cellvalue(0,0);
	  driver.findElement(By.xpath("//input[@id='fromCityList']")).sendKeys(a);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='fromCityList']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-control ng-dirty open ng-invalid ng-touched']")).click();
	  driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("Pune");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='ng-tns-c11-1 form-control ui-inputtext ui-widget ui-state-default ui-corner-all']")).click();
	  driver.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c11-1'])[24]")).click();
	  Thread.sleep(2000);
	  Select s=new Select(driver.findElement(By.xpath("//select[@id='pickUpTime']")));
	  s.selectByVisibleText("12:30 AM ");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='book-button btn']")).click();
	  Thread.sleep(20000);
	 System.out.println(driver.findElement(By.xpath("(//div[@class='carNamesDesktop'])[1]")).getText());
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='headingLink float-left']")).click();
	 Thread.sleep(2000);
	 
	 }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver = Demo2.browser();
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

}
