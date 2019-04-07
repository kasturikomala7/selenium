package seleniumdemo;

import org.testng.annotations.Test;

import seleniumdemo.demo1;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest  {
	WebDriver driver;
  @Test
  public void f() throws Exception  {
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='FromTag']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		excel.excelpath();
		String a=excel.cellvalue(0,0);
		String b=excel.cellvalue(1,0);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys(a);
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ToTag']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(b);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default '])[21]")).click();
		Thread.sleep(3000);
		Select s=new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		s.selectByValue("7");
		Thread.sleep(3000);
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		Thread.sleep(3000);
		s1.selectByValue("2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//button[@class='booking'])[1]")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("(//a[@class='weak'])[1]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@onclick='handleBaggageCall();']")).click();
		Thread.sleep(20000);
		
		
		
		
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver=demo1.browser();
  }

  @AfterMethod
  public void afterMethod() {
	 
  }

}
