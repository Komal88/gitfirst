package firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Containsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String path=System.getProperty("user.dir")+"//drivers//geckodriver.exe";
       System.setProperty("webdriver.gecko.driver", path);
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("//input[contains(@data-testid,'royal_pass')]")).sendKeys("Komal");
	}

}
