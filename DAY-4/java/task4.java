import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 {

	public static void main (String[] args) {
			WebDriverManager.chromedriver().setup () ;
			WebDriver driver;
			ChromeOptions co =new ChromeOptions () ; co.addArguments("--remote-alilow-origins*");
			driver=new ChromeDriver (co);
			driver.navigate().to ("https://j2store.net/free/");
			driver.manage () .window () .maximize () ;
			WebElement clothing=driver.findElement (By.xpath(" //*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a"));
			clothing.click ();
			driver.manage().window().maximize();
			driver .navigate().back();
			driver.navigate ().forward() ;
			driver.navigate ().refresh () ;
			driver.close();
}

}
