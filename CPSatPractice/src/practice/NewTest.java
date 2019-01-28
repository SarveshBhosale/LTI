package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.shoppersstop.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	  
	  Actions actions=new Actions(driver);
	  actions.moveToElement(driver.findElement(By.xpath("/html/body/main/nav/div[1]/div/ul/li[2]/a"))).perform();
	  //driver.quit();
  }
}
