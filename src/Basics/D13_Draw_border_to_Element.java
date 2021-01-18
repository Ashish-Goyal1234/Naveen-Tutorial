package Basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13_Draw_border_to_Element {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com"); //enter URL
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//executeScript -- to execute JavaScript code
		//Highlight the login Button
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button
		drawBorder(loginBtn, driver);
		//Take screenshot and store as file format
		File src =	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);   //Just Two lines always.	
		//now copy the screenshot to desired location using copy filr method.
		FileUtils.copyFile(src,new File("E:\\FINAL\\2.selenium\\WORKSPACE\\Naveen_Tutorial\\src\\Basics\\elemntborderscreenshot.png"));  //pasted in same location
			
	}

	
	 public static void drawBorder(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);  //we are using 0 because 1st element only 1 element.
	    }
	    
	
}



