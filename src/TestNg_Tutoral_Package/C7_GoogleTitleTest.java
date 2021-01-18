//PLease Run TestNg.xml file
package TestNg_Tutoral_Package;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C7_GoogleTitleTest {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void googleTitle() {
		String title =driver.getTitle();
		System.out.println("Google Title is :"+title);
		Assert.assertEquals(title, "Google", "Title is not matched"); //Third colun value (Title is not matched) will displayed only when testcase is failed.
		//Assert.assertEquals(title, "Google123", "Title is not matched");
	}
	
	
	@Test			//Second TestCase
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b, "image is not present");
		//Assert.assertEquals(b, true); //same as above line.
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
