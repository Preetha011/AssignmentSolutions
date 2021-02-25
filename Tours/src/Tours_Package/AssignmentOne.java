package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {

	public static void main(String[] args) {
	
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		   
		   driver.findElement(By.className("EIlDfe")).sendKeys("Preetha");
		   driver.findElement(By.name("lastName")).sendKeys("Selvaraj");
		   
		   driver.findElement(By.name("Username")).sendKeys("preeeeettttttt2345.gmail.com");
		   driver.findElement(By.name("Passwd")).sendKeys("Preet28");
		   driver.findElement(By.name("ConfirmPasswd")).sendKeys("Preet2898");
		   
		   driver.findElement(By.className("VfPpkd-RLmnJb")).click();

	}

}
