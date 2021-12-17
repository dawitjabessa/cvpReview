package testCVPNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selfIntroNG {
	@Test
	public void selfIntro () {
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
