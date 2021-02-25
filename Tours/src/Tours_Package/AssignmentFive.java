package Tours_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFive {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.google.com/");
		   
		   driver.get("https://www.selenium.dev/");
		   
		   driver.navigate().back(); //google
		   
		   Thread.sleep(2000); 
		   
		   driver.navigate().forward(); //selenium
		   
		   Thread.sleep(2000); 
		   
		   driver.navigate().back(); //google
		   
		   Thread.sleep(2000); 
		   
		   driver.navigate().refresh(); //refresh google

	}

}
