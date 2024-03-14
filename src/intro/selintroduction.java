package intro;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class selintroduction {
 
	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver  ->Methods
		// Firefox - FirefoxDriver(geckodriver) ->Methods
		// Safari - SafariDriver ->Methods
		// WebDriver close get
		// WebDriver methods + class methods
		// Step to invoke chrome driver//
		// selenium Manager
		
		//chrome
		System.setProperty("webdriver.chrome.driver", "/Users/sugadhe/OneDrive - Capgemini/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
 
	}
 
}