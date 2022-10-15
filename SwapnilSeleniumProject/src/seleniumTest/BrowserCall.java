package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sangi\\OneDrive\\Desktop\\selenium1\\chromedriver.exe");
	      
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		
		WebElement user =driver.findElement(By.xpath("//input[@id=username]"));
		user.sendKeys("jorisanfita95@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id=password]"));
		pass.sendKeys("swapnil@16");
	    WebElement login=driver.findElement(By.xpath("//input[@text=Login]"));
	    login.click();
	}

}
