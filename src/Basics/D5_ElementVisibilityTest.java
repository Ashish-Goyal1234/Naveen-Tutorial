package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5_ElementVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/register/");
		
		//1. isDisplayed()-is applicable for all the elements
		
		boolean b=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b);  //true
		
		//2. isEnabled()-
		boolean b1=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("Before Click on Agree check box button enable :" +b1);  //false
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("After Click on Agree check box button enable :" +b2);  //true
		
		//3. isSelected()-- only  applicable for checkboxes, dropdown,radiobuttons
		
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("Agree check box is selected :" +b3);  //as already selected it will return true.
		
	}

}
