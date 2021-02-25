package Tours_Package;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_practice {
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		String hub = " http://192.168.56.1:4444/wd/hub";
		String url = "https://www.google.com/";
		
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		DesiredCapabilities hello = new DesiredCapabilities().chrome();
		
		WebDriver driver = new RemoteWebDriver(new URL(hub),hello);
		
		driver.navigate().to(url);
		
		
		
		
		
		
		
	}

}
