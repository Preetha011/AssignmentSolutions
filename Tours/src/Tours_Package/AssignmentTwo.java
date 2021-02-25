package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intellipaat-chat\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Preetha");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Selvaraj");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("9485834343");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("preethukrish01@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("address1")).sendKeys("11, Bharathiyar Street near to Brand Factory");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("560068");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select s1 = new Select(country);
		
		s1.selectByValue("INDIA");
		country.click();
		Thread.sleep(2000);

		
		driver.findElement(By.id("email")).sendKeys("Preet98");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Preet98");
		Thread.sleep(2000);
		driver.findElement(By.name("confirmPassword")).sendKeys("Preet98");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(2000);
		
		
		driver.close();
		
		
	
		
	}

}
