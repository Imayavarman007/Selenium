import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Gowtham");	
		WebElement remail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		remail.sendKeys("asboin@gmail.com");	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		WebElement name=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		name.sendKeys("Gowtham");	
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		email.sendKeys("asboin@gmail.com");
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]"));
		radio.click();
		WebElement msg=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		msg.sendKeys("jgebkjnbasfh");
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amt.clear();
		amt.sendKeys("7");
		WebElement chk=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input"));
		chk.click();
		WebElement sub=driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button"));
		sub.click();	
	}
}
