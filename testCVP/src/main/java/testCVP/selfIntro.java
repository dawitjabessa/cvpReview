package testCVP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selfIntro {
	public static void main(String[] args) {
		//seeks the web driver from local 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dawitjabessa\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//goes to the google page
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//closes the current window
		driver.close();
		//closes all the associated windows
		driver.quit();
		
	}
}
