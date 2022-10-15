package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sangi\\OneDrive\\Desktop\\selenium1\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
	Thread.sleep(3000);
	
	
	WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));  //defined bm1 method with connecting xpath of specific month
	Select month1 = new Select(bm1);
	List<WebElement> dropdown = month1.getOptions();
	for (int i = 0; i < dropdown.size(); i++) {
		String dropdownValues = dropdown.get(i).getText();
		if (dropdownValues.equalsIgnoreCase("Aug")) {
			 dropdown.get(i).click();
			
		}
		
		
	}
	
	}

}
