package testCVPNG;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class forgetPasswordAnnotation extends createUserAnnotation {
	public WebDriver driver;
	
	@Parameters({"URL","webdriver"})
	@BeforeTest
	public void createUser(String url, String webdriver) {
		System.setProperty("webdriver.chrome.driver",webdriver);
		driver = new ChromeDriver();
		driver.get(url);
	}
	@Parameters({"userInput","password"})
	@Test
	public void loginUser (String userInput, String password) {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userInput);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
					
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Your email or password is incorrect.')]")).getText());
		
		
		
	}
	
	@AfterTest
	public void closeApplication() {
		driver.close();
		System.out.println("It worked");
	}
}
