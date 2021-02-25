package Tours_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliPractice {

	public static void main(String[] args) throws FindFailed {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intellipaat-chat\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com//");
		
		Screen hello = new Screen();
		
		Pattern email = new Pattern("C:\\Users\\intellipaat-chat\\Desktop\\ImagesSikuli\\e1.png");
		Pattern pwd = new Pattern("C:\\Users\\intellipaat-chat\\Desktop\\ImagesSikuli\\p1.png");
		Pattern login = new Pattern("C:\\Users\\intellipaat-chat\\Desktop\\ImagesSikuli\\img3.png");
		
		hello.type(email, "hello@com");
		hello.type(pwd, "hello");
		
		hello.click(login);
		
	}

}
