package testCVP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createUser {
	public static void main(String [] args) {
		//seeks the web driver from local 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dawitjabessa\\Desktop\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		//goes to the google page
		driver.get("https://rahulshettyacademy.com/#/index");
		
		driver.findElement(By.className("login-btn")).click();
		
		driver.findElement(By.id("user_name")).sendKeys("Dawit Jabessa");
		
		driver.findElement(By.name("email")).sendKeys("brooklynB@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("helloworld");
		
		driver.findElement(By.name("commit")).click();
		
//		driver.quit();
	}
}
