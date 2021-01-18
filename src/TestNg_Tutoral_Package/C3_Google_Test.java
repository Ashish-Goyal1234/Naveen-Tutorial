//PLease Run TestNg.xml file
//Testcase can be pick any if we dont write the priority.
//Testcase are Independent
//below code has 6 testcases so 6 groups will be created of Beforemethod-test and aftermethod.
//Groups are used when in HTMl report we are able to see testcase in groups so its is easy to identify quickly where testcase is failed if we have 100 testcases.
/*
 We have to Write Priority to each testcase if we write priority for 1 testcase and not others then it will not work
 */

package TestNg_Tutoral_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C3_Google_Test {
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
	
	@Test(priority=2,groups="Title")		//First TestCase
	public void googleTitle() {
		String title =driver.getTitle();
		System.out.println("Google Title is :"+title);
	}
	
	
	@Test(priority=3,groups="Logo")			//Second TestCase
	public void googleLogoTest() {
		driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=1,groups="LinkTest")			//Third TestCAse
	public void mailLink() {
		driver.findElement(By.linkText("mail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=5,groups="Test")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(priority=6,groups="Test")
	public void Test3() {
		System.out.println("Test3");
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
