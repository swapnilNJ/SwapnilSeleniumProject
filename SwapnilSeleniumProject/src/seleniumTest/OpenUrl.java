package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl {

	public static void main(String[] args) throws Exception {
		
		// setting the property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sangi\\\\OneDrive\\\\Desktop\\\\selenium1\\\\chromedriver.exe");
         
		//launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//launching application URl using get() method.
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		//manage() method - Maximize window
		driver.manage().window().maximize();
		
		// launching application URl using navigate() method
		Thread.sleep(2000);
		driver.navigate().to("https://chrome.google.com/webstore/category/extensions?hl=en");
		
		// Refresh the page
				Thread.sleep(2000);
				driver.navigate().refresh();
		
		// Navigate back
				Thread.sleep(2000);
				driver.navigate().back();
		
				
		// Navigate forward
				Thread.sleep(2000);
				driver.navigate().forward();
				
		//Fetch current URL
			Thread.sleep(2000);	
		   String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);	   
	
	   // close current window
	  Thread.sleep(2000);
	  driver.close();
	  
	  //close all window
	  Thread.sleep(2000);
	  driver.quit();
	}

}
