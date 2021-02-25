package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Practice {
	
	public static void main(String args[]) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\intellipaat-chat\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.findElement(By.cssSelector("#email")).sendKeys("preetha");
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("Hello");
		
		
	}
	
	}
	


