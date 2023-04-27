package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.print("\n"+driver.getWindowHandle());
		System.out.print("\n"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.print("\n"+driver.getWindowHandle());
		System.out.print("\n"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.print("\n"+driver.getWindowHandle());
		System.out.print("\n"+driver.getTitle());
		Set<String>s=driver.getWindowHandles();
		System.out.println("Number of windows opened="+s.size());
	}
}
