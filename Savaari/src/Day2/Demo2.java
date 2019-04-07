package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static WebDriver browser() throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Buvaneshwari\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.savaari.com/");
Thread.sleep(2000);
return driver;
	}

}
