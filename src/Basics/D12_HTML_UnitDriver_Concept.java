package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class D12_HTML_UnitDriver_Concept {

	public static void main(String[] args) throws InterruptedException {
	    
	    System.setProperty("webdriver.chrome.driver", "E:\\Study\\2. Selenium\\Drivers\\chromedriver_win32_74.0\\chromedriver.exe"); 
	   /*   For Headless Browser Testing Instead of creating instance of Chrome or Firefox browser 
	             we create instance of HTML Unit Driver.
	         E.g :
	            WebDriver driver = new ChromeDriver();          
	         */WebDriver driver = new HtmlUnitDriver();   // Need to download Jar files.
		
	   /*	1. HtmlUnitDriver is not a part of Selenium from version 3.x onwards.
		2. Htmlunitdriver---to use this concept we have to download htmlunitdriver jar file.
		3. This will not open any browser instead it will print output without opening browser
		 
		 Advantages Of HtmlUnitDriver :
        		 1. Testing is Happening behind the scene--no browser is launched.
        		 2. very fast--execution of testcases is very fast.---improve performance of the script.
        		 3. Not work or suitable for user action class--mouse movement, double click ,drag and drop.
        		 4. Also called as Ghost Driver or headless browser.
        		 	 Different Headless Avialble in market
        		 	 1. HtmlUnitDriver--java
        		 	 2. phantomJS--JavaScript
		 */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");
		System.out.println("Before login   :" + driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
		
		Thread.sleep(3000);
		System.out.println("After login  :" + driver.getTitle());
	}

}
