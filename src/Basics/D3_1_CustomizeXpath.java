package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_1_CustomizeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		/*
		 *Absolute Xpath
		 .//*[@id='s2-carouselContainer']/div/div[3]/div/div/div[1] which cointain path from its parent to exact location
		 which is not recommended as sometimes when the element changes its location then our script fails
		 1) performance issue
		 2)Can be change at any time in future
		 3)not reliable.
		 */
		driver.findElement(By.xpath("//input[@class=\"gh-tb ui-autocomplete-input\"]")).sendKeys("watches");  //customize xpath
		driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();  //customize xpath
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("watches");  //another way not recomended as some line having same value still it detect then we have go more deep to bifergate.
	
	/*
		Dynamic Id Changes : when close the page and again load page id changes
			1)sometime id = test_123
			2)sometime id = test_456
			3)sometime id = test_789
			soln
			driver.findelement(by.xpath("//input[contains(@id.'test_')]")).sendkeys("test"); dummy location
			driver.findelement(by.xpath("//input[starts-with(@id.'test_')]")).sendkeys("test"); dummy location
			
			1)sometime id = 123_test
			2)sometime id = 456_test
			3)sometime id = 789_test
			driver.findelement(by.xpath("//input[ends-with(@id,'_test')]")).sendkeys("test"); dummy location
	*/
	
		
		
	}

}
