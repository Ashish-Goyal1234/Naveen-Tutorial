package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class D9_TAkecreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		
		
		//Take screenshot and store as file format
	File src =	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);   //Just Two lines always.	
	//now copy the screenshot to desired location using copy filr method.
	FileUtils.copyFile(src,new File("E:\\FINAL\\2.selenium\\WORKSPACE\\Naveen_Tutorial\\src\\Basics\\ashishscreenshoterror.png"));  //pasted in same location
		

	}

}
