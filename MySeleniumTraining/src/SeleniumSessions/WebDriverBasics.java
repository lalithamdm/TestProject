package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\17043\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.get("http:\\google.com");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17043\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http:\\google.com");
		String s=driver1.getTitle();
		System.out.println(s);
		
		
		if(s.equals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Not Correct Title");
		}
		
		System.out.println(driver1.getCurrentUrl());
		
		driver1.quit();
		

	}

}
