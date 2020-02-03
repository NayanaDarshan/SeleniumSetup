package BasicWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelection {

	public static void main(String[] args) {
		WebDriver driver;
		String BaseURL="http://warr-qa-bt39.solarsoft.local:8140/WebTrack/ShoppingCart.aspx";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-13.0.1\\lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(BaseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
////Login to site
		driver.findElement(By.xpath("//a[@id='PageHeader_MenuBar_SignInLink_SignInHyperlink']")).click();
		driver.findElement(By.xpath("//input[@id='PageBody_SignInControl_UserNameTextBox']")).sendKeys("Nayana");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), \"Items in\")]")).click();
		driver.findElement(By.xpath("//a[@id='PageBody_PlaceOrderButton']//span[contains(text(),'Place Order Now')]")).click();
		
		String Pagename= driver.getTitle();
		System.out.println("The user is in checkout page:"  +Pagename);
		
///performing the calendar selection flows
		driver.findElement(By.xpath("//a[@id='anchor_PageBody_DateRequired']//img")).click();
		
		String date ="20-12-2019";
		
		String darr[]= date.split("-");
		System.out.println(darr[0]);
		System.out.println(darr[1]);
		System.out.println(darr[2]);
		
		List<WebElement> dates= driver.findElements(By.tagName("a"));
		int size =dates.size();
		//System.out.println(" The size is "+size);
		
		/*for ( WebElement date1 : dates) {
			System.out.println(date1.getText());
		}*/
	
		for ( int i=0; i<size; i++) {
             System.out.println(dates.get(i).getText());
             
             if(dates.get(i).getText().equals(darr[0])) {
            	 
            	 dates.get(i).click();
            	 break;
             }
		}

		
		
		
		
	}

}
