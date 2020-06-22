package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdentifyElementUniquelyByID {
	// identify element by id
	
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\j\\chromedriver_win32\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("--disable-extensions");
	        options.addArguments("--auto-open-devtools-for-tabs");
	        WebDriver driver = new ChromeDriver(options);
	        
	        driver.get("https://www.amazon.in/");
	       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
	        
	        
	        
	 }

}
