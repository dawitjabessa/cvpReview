package testCVPNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class createUserNG extends createUserAnnotation {
	
	
	public static void main(String args[]) {
	
		createUserAnnotation user1 = new createUserAnnotation();
		forgetPasswordAnnotation user2 = (forgetPasswordAnnotation) new createUserAnnotation();
	}
	
	public void loginUser () {
		System.out.println("It worked well in here too.");
	}
}
