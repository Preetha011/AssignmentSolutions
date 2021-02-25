package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragand_Drop {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable//");
		
		
	
		
		WebElement a = driver.findElement(By.tagName("iframe"));
		Actions act = new Actions(driver);
		
		//act.moveToElement(a);
		
		driver.switchTo().frame(a);
		
		Thread.sleep(1000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		
		act.dragAndDrop(source,target).perform();
		
		Thread.sleep(2000);
		
		if(target.getText().matches("Dropped!")) {
			System.out.println("Earth is where, haha!");
		}
		
		driver.close();	

	}

}
