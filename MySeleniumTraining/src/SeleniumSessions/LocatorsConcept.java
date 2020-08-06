package SeleniumSessions;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\17043\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions ();
		options.setExperimentalOption ("excludeSwitches", Collections.singletonList ("enable-automation"));
		options.setExperimentalOption ("useAutomationExtension", false);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("u_0_m']")).sendKeys("Tom");
		//driver.findElement(By.id("lastname")).sendKeys("Peter");
		//driver.findElement(By.id("email")).sendKeys("tom123@gcom");
		//driver.findElement(By.id("PASSWORD")).sendKeys("Tom123");
		//driver.findElement(By.className("checkbox__control")).click();
		
		
		//driver.findElement(By.linkText("User Agreement")).click();
		
		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
		

}
}
