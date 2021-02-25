package Tours_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFour {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.google.com/");
		   //To get the title
		   String title = driver.getTitle();
		   System.out.println(title);
		   		   
		   Thread.sleep(4000);
		   
		   //To get the URL
		   
		  String url =  driver.getCurrentUrl();
		  System.out.println(url);
		  Thread.sleep(4000);
		  
		  driver.quit();
		  

	}

}
