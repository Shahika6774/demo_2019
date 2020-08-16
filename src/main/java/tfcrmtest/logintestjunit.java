package tfcrmtest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintestjunit {
	
	WebDriver driver;
	
	@Before
	public  void launchbrowser() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAHIKA\\eclipse-newworkspace\\mavianproject\\Drivers\\chromedriver.exe");
			
		  driver = new ChromeDriver();
		   
			driver.get("http://techfios.com/test/billing/?ng=admin/");
			
			driver.manage().window().maximize();
			
	} 
		
	
         @Test
		public  void logintoapp()  {
		
         driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		
	}
         
        
         @After
		public  void tearDown() {
		
		driver.close();
		
}
	
         public void Bns() {
     		System.out.println("This is super keyword");
     	}

                     }
