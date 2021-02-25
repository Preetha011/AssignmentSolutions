package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Tour_Class {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intellipaat-chat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		WebElement user_name = driver.findElement(By.id("email"));
		user_name.sendKeys("preethukrish01@gmail.com");
		WebElement pass_word = driver.findElement(By.name("pass"));
		pass_word.sendKeys("wrongpassword");
		driver.findElement(By.name("login")).submit();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.className("_97w4")).click();
		driver.findElement(By.linkText("No longer have access to these?")).click();
		
		driver.get("https://www.google.com//");
		WebElement google_search = driver.findElement(By.name("q"));
		google_search.sendKeys("Hello");
		google_search.findElement(By.name("btnK")).click();
		//google_search.submit();
		
	
		driver.quit();
	}
}
