package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        
        Thread.sleep(2000);
    
        
        
				

	}

}
