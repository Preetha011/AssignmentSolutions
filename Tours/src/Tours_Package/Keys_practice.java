package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement a = driver.findElement(By.name("userName"));
		WebElement b = driver.findElement(By.name("password"));
		
		Actions act = new Actions(driver);
		
		a.sendKeys("Preetha");
		
		act.click(a).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).click(b).keyDown(Keys.CONTROL)
		.sendKeys("v").build().perform();
		
		
		

	}

}
