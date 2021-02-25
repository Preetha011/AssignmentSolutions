package Tours_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		   
		   driver.findElement(By.name("firstName")).sendKeys("Preetha");
		   
		   Thread.sleep(2000);
		   driver.findElement(By.name("lastName")).sendKeys("Selvaraj");
		   Thread.sleep(2000);
		   
		 
		   driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("pselvaraj342");
		   Thread.sleep(2000);
		   
		   
		   driver.findElement(By.name("Passwd")).sendKeys("Preetha2898");
		   Thread.sleep(2000);
		  
		   driver.findElement(By.name("ConfirmPasswd")).sendKeys("Preetha2898");
		   Thread.sleep(2000);
		   	   
		   driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
		  
		   Thread.sleep(2000);
		   
		 //  driver.close();
		   
		   
	}

}
