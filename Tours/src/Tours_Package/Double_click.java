package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(a).doubleClick().build().perform();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		
		
		WebElement b = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		
		
		act.contextClick().perform();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
