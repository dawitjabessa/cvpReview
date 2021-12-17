package testCVPNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class createUserAnnotation implements newSayings {
	public WebDriver driver;
	
	
	@Parameters({"URL","webdriver"})
	@BeforeTest
	public void createUser(String url, String webdriver) {
		System.setProperty("webdriver.chrome.driver",webdriver);
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Parameters({"userInput","email","password"})
	@Test
	public void loginUser (String userInput , String email , String password) {
		
		driver.findElement(By.className("login-btn")).click();
		
		driver.findElement(By.id("user_name")).sendKeys(userInput);
		
		driver.findElement(By.name("email")).sendKeys(email);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.name("commit")).click();
		
	}
	
	@AfterTest
	public void closeApplication() {
		driver.close();
		System.out.println("It worked");
	}
	
	@Test
	public void workingDay() {
		// TODO Auto-generated method stub
		System.out.println("This is workingDay method from interface");
	}
	@Test
	public void restingDay() {
		// TODO Auto-generated method stub
		System.out.println("This is restingDay method from interface");

	}
	
	
}
