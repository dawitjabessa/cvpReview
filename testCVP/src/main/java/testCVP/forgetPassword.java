package testCVP;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgetPassword {
	public static void main(String[] args) {
		//seeks the web driver from local 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\dawitjabessa\\Desktop\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
				//goes to the google page
				driver.get("https://sso.teachable.com/secure/9521/identity/login");
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("John");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
				
				driver.findElement(By.xpath("//input[@type='submit']")).click();
							
				System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Your email or password is incorrect.')]")).getText());
				
				
	}
}
