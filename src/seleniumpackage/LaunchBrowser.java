package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		
		
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("Username");
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
		
		
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();

	}

}
