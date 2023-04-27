package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubXj
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement src= driver.findElement(By.id("source"));
		src.sendKeys("Coimbatore");
		Thread.sleep(3000);
		src.sendKeys(Keys.ENTER);
		WebElement des= driver.findElement(By.id("destination"));
		des.sendKeys("Bangalore");
		Thread.sleep(3000);
		des.sendKeys(Keys.ENTER);
		WebElement date= driver.findElement(By.id("datepicker1"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','04-05-2023')",date);
		WebElement ser= driver.findElement(By.id("seo_search_btn"));
		ser.click();	
	}
}
