package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_link {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intellipaat-chat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("selenium");
	   driver.findElement(By.className("gNO89b")).submit();
	    
	  
	   
	    
		
		System.out.println("The title of the URL: " + driver.getTitle());
		System.out.println("To get the current URL: " + driver.getCurrentUrl());
		driver.close();
		
		
		
	

}
	
}
