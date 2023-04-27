package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
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
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	WebElement inp= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	inp.sendKeys("401");
	WebElement sub= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	sub.click();
	Alert alert1=driver.switchTo().alert();
	alert1.dismiss();
	inp.clear();
	inp.sendKeys("402");
	sub.click();
	Alert alert2=driver.switchTo().alert();
	alert2.accept();
	Alert alert3=driver.switchTo().alert();
	String txt=alert3.getText();
	alert3.accept();
	}
}
