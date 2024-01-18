package Selenium;
 
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class Cc {
	WebDriver driver;
	@Test
	@Parameters("Browser")
	public void test1(String browser) {
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Akshat\\Desktop\\edgedriver_win64 (1) 1\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.unionbankofindia.co.in/applynow/lead/index?lead_source=&lead_sub_source=");
			driver.close();
		} else if (browser.equalsIgnoreCase("FF")) {
			driver = new FirefoxDriver();
			driver.get("https://www.unionbankofindia.co.in/applynow/lead/index?lead_source=&lead_sub_source=");
			driver.close();
		}  
	}
 
}