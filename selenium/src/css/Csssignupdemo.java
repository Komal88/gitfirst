package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Csssignupdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String path=System.getProperty("user.dir")+"//drivers//chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path);
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.findElement(By.cssSelector("input[name^='firstn']")).sendKeys("Komalpreet");
      driver.findElement(By.cssSelector("input[aria-label$='rname']")).sendKeys("Kaur");
      driver.findElement(By.cssSelector("input[name$='email__']")).sendKeys("chadhakomal18@gmail.com");
      driver.findElement(By.cssSelector("input[aria-label^='Re-enter email a']")).sendKeys("chadhakomal18@gmail.com");
      driver.findElement(By.cssSelector("input[data-type^='passw']")).sendKeys("9417033888");
      Select day1 = new Select(driver.findElement(By.cssSelector("#day")));
      Select month1=new Select(driver.findElement(By.cssSelector("#month")));
      Select year1=new Select(driver.findElement(By.cssSelector("select[title^='Yea']")));
      day1.selectByIndex(14);
      month1.selectByValue("6");
      year1.selectByVisibleText("1992");
      driver.findElement(By.cssSelector("input[value='1']")).click();
      driver.findElement(By.cssSelector("input[type='websubmit']")).click();
      
	}

}
