package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D9_Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("http://amazon.com");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.close();
	}

}
