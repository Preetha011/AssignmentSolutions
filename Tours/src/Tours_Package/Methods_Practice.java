package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intellipaat-chat\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		WebElement a = driver.findElement(By.linkText("Images"));
		a.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("back navigation is done");
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("Forward navigation is done");
		
		driver.navigate().refresh();
		System.out.println("refresh page");
		
		driver.close();
		
		

	}

}
