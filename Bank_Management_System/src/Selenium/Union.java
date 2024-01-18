package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class Union {
static WebDriver driver;
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.get("https://www.unionbankofindia.co.in/applynow/lead/index?lead_source=&lead_sub_source=");
		
		Select st = new Select(driver.findElement(By.id("Prefix")));
		st.selectByVisibleText("Mr");
		
		driver.findElement(By.id("Name")).sendKeys("Prikshit Sangwan");
		driver.findElement(By.id("Mobile")).sendKeys("70823441148");
		
		driver.findElement(By.id("Email")).sendKeys("prikshitsangwan82@gmail.com");
		
		Select st1 = new Select(driver.findElement(By.name("IsExistingCustomer")));
		st1.selectByVisibleText("No");
		
		Select st2 = new Select(driver.findElement(By.name("Product")));
		st2.selectByVisibleText("Current Account");
		
		driver.findElement(By.name("PinCode")).sendKeys("124103");
		
		driver.findElement(By.name("Description")).sendKeys("Please do as fast as can");
		
		//driver.findElement(By.xpath("/html/body/div/form/div/section/div/div/div[2]/div[2]/div/div[11]/div[3]/a")).click();
		
		
		
 
	}
 
}