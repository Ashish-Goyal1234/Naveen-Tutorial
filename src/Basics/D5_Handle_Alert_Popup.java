//Important for Interview Purpose

package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5_Handle_Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);    //5000milisecond == 5 second.
		//When Alert Comes We have two Screen Background and Popup above screen comes so we need to tell to switch to front.
		Alert alert =driver.switchTo().alert();
		System.out.println("Text Of the alert Box"+alert.getText());
		
		String test = alert.getText();
		if(test.equals("Please enter a valid user name"))
		{
			System.out.println("Correct Alert Message");
		}
		else
		{
			System.out.println("Incorrect alert Message");
		}
		alert.accept();  //click on ok button
		//alert.dismiss();  //to click on cancel but this alert doest not have so no use.
		driver.close();
	}

}
