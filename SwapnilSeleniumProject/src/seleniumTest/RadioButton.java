package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sangi\\\\OneDrive\\\\Desktop\\\\selenium1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
		driver.findElement(By.xpath("(//input[@name='firstname'])[1])")).sendKeys("sangita");

	}

}
