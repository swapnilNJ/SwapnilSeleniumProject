package seleniumTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void a2() {
		
		System.out.println("Hello A2 Test method");
		
	}
	
	@BeforeTest
	public void b() {
		
		System.out.println("b method");
		
	}
	@BeforeSuite
	public void c() {
		
		System.out.println("c method");
		
	}
	@AfterMethod
	public void d() {
		
		System.out.println("d method");
		
	}
	

}
