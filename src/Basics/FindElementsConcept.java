package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		//get the total count of links on page
		//get the text of each link of the page
		
	List<WebElement> linklist =	driver.findElements(By.tagName("a"));
	
	// size of linklist
	System.out.println("Total Number of count :"+ linklist.size());
	
	//get the test of each link
	
	for(int i=0;i<linklist.size();i++) {
		String linktext = linklist.get(i).getText();
		System.out.println(linktext);
	}

	}

}
