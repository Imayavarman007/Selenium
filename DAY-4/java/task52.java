import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task52 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"Mod104\"]/div/div/div/div/div/div/a"));
		btn.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		driver.findElement(By.linkText("Clothing(5)")).click();
		Thread.sleep(5000);
		List<WebElement> l1=driver.findElements(By.xpath("//h2[@class='product-title']"));
		for(WebElement link:l1) {
			System.out.println(link.getText());
		}
	}

}
