package tfcrmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class logintest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		  
		 	


			
		launchbrowser();
		logintoapp();
		tearDown();
	}
		
	
	
	public static void logintoapp()  {
		



		
		
		// identifying the username box and passing passing username
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		// identifying the password box and passing passing password
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		//identifying the login button and click it.
		driver.findElement(By.name("login")).click();
		
	}
	public static void tearDown() {
		
		// close the websise
		driver.close();
		
	
// what iS JUNIT ?
		//JUNIT IS UNIT TESTING FREMWORK
		
	}



	public static void launchbrowser() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAHIKA\\eclipse-newworkspace\\mavianproject\\Drivers\\chromedriver.exe");
			
	
	
			
			 driver = new ChromeDriver();
	
		driver.get("http://techfios.com/test/billing/?ng=admin/");
	
		
	
		
		// maximize the window
		driver.manage().window().maximize();
	
	}

}
