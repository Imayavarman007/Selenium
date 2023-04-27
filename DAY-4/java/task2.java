import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Gowtham");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("G");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("727721eucs032@gmail.com");
		WebElement pass=driver.findElement(By.id("input-password"));
		pass.sendKeys("12345678");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		WebElement radio=driver.findElement(By.id("input-newsletter-yes"));
		radio.click();
	}

}
