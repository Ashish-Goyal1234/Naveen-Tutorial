/*
 Keep Scrolling Until the defined element is visible.
 */

package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13_Scroll_into_view {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com"); //enter URL
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button

		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		scrollIntoView(forgotPwdLink, driver);
	}
	public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);  //means keep scrolling util the particular element is visible.
    }
    

}
