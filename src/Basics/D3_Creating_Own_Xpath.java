package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_Creating_Own_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.freecrm.com");
		Thread.sleep(3000);

		//Xpath for Links
		//{//a[text()='Features']} where a is HTML Taga and text() used for name oof link and Features is link name.
		driver.findElement(By.xpath("//a[text()='Features']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Features')]")).click();  //Another way for xpath
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//{//input[@name='Username']} here input is HTml Tag_Name and name is field name 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		
		//{ //input[@type='submit' and @value='Login']}  here I have shared two textbox attributes to make the field more correct or exact location using and operator.
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
//		driver.findElement(By.xpath("//a[text()='abram RRnn']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();  //Preceding Sibling for checkbox.
		
		
		
		
		
		//driver.findElement(By.xpath("//button[@type='button' and @class='btn' ]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();  //Another way to inspect the button.
	 
	}

}
