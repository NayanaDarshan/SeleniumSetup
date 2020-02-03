package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		String baseURL= "https://booking2.airasia.com/retrieveextbooking.aspx?culture=en-gb";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		 WebElement OriginList= driver.findElement(By.id("//select[@id='ControlGroupRetrieveBookingExpediaAKView_BookingRetrieveInputExpediaAKView_ORIGINCITY1']//parent::gtmactionname"));
			
		 Thread.sleep(2000);
			Select sel= new Select(OriginList);
			
			sel.selectByIndex(3);
	}

}
