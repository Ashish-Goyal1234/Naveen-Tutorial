package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D7_ImplicitylyWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 Sometime some webpages are too heavy that they dont load quickly ans selenium will not wait for them. so pageLoadTimeout is
		 a concept that tell selenium to please waith atleat 40 second.The second advantage is that if page load within 2 second then 
		 remaining 38 seconds is ignored automatically.
		 */
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		/*
		 Implicitily is available for all the elements available in the webpage.when The page is Fully loaded and some element or button 
		 or field or drop down taking more  time to load then we are informing selenium to atleast wait for 30second and then 
		 perform action.If the element found within 2 second then rest 28 second is ignored automatically.
		 */
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   //also calle as dynamic wait.

		//Thread.sleep(2000);  //Static wait.   we are forcefully pausing for 2 second.	
	}

}
