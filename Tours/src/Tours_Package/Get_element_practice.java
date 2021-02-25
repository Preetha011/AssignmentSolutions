package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_element_practice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intellipaat-chat\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");
		WebElement hello = driver.findElement(By.id("email"));
		System.out.println("attribute" + hello.getAttribute("id"));
		System.out.println("url of the element" + driver.getCurrentUrl());
		System.out.println("get the title" + driver.getTitle());
		System.out.println("the tag name" + hello.getTagName());
		
		driver.close();

	}

}
