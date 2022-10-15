package seleniumTest;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankingDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sangi\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      //  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/V4/index.php");
		//Thread.sleep(3000);
	    driver.manage().window().maximize();
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr434879");
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dybAtys");
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
	    
	    //driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
	    
	    // refresh due to random add pop-up

	 // Navigate back
		Thread.sleep(2000);
		driver.navigate().back();

		
// Navigate forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ravikantshankar SsF PatilP");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("27-06-1995");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("JM Road Pune");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("411005");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9960034300");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("TPatilPPRVgrvipatil@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dybAtys");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='sub']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> li =  (List<WebElement>) driver.findElement(By.id("//table[@id='customer']/tbody/tr/td[2]"));
		for (int i=0; i <li.size(); i++ );
		{
			System.out.println(li.get(0).getText());
			
		}
		
		
		//driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='New Account']")).click();
		
		// now apply the command to paste
		driver.findElement (By.xpath("//input[@name='cusid']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		
		
		
		
		
		
	//WebElement DateofBirth = driver.findElement(By.xpath("//input[@id='dob']"));
		
		//*new WebDriverWait(driver, Duration.ofSeconds(5))*//
		//*.until(ExpectedConditions.visibilityOfElementLocated(By.className("datepicker-days")));*//
	
		//* SelectDate("27", "June", "1992");*//
	
		
	}

	//*private static void SelectDate(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

//}
