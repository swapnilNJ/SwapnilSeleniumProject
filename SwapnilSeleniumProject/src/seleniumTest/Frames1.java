package seleniumTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\sangi\\OneDrive\\Desktop\\selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		Thread.sleep(3000);

		
		//Find Total number of frames present on web page
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(allFrames);
		
		//go inside frame and check element present or not
		for (int i=0; i<allFrames; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch Video']")).click();
			
			
		}
	
	}

}
