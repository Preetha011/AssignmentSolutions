package Tours_Package;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Problem_Statement {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\intellipaat-chat\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com/");
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		a.sendKeys("mobile phones");
		a.submit();
		
	
		
		 List<WebElement> my_list = driver.findElements(By.xpath(".//*[starts-with(@id, 'search_')]"));


		System.out.println(my_list.size());

		for(int i=0;i<my_list.size();i++)

			{
			String myString = my_list.get(i).getText();
			System.out.println(myString);
	
			}

		// To create excel file
		WritableWorkbook wb = Workbook.createWorkbook(new File("C:\\Users\\preet\\eclipse-workspace\\My_Selenium_Project\\src\\My_Selenium_Package\\mylist.xls"));
		WritableSheet sheet = wb.createSheet("Mobiles", 1);

		Label value1 = new Label(0,0,"MobilePhones");
		Label value2 = new Label(1,0,"Prices");
		sheet.addCell(value1);
		sheet.addCell(value2);



		wb.write();
		wb.close();
		}
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.id)
		//List<WebElement> cell = driver.findElements(By.xpath("//*[@id=\"search\"]"));
		
		//WebElement b = driver.findElement(By.className("a-size-medium a-color-base a-text-normal"));
		//b.submit();
		//System.out.println(b.getText());
		
		//a-size-mini a-spacing-none a-color-base s-line-clamp-2
		//a-size-mini a-spacing-none a-color-base s-line-clamp-2
		
	//a-size-medium a-color-base a-text-normal
		
		///html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span
		
	

		//System.out.println(cell.size());

		//Thread.sleep(5000);

		//for(int i=0;i<cell.size();i++)

		//{

		//System.out.println(cell.get(i).getText());

		//}

		//Thread.sleep(5000);
		
		
		//Thread.sleep(5000);
		
		

	}

}
