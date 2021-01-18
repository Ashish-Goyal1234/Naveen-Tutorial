package Basics;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13_Alert_For_HighlightedBUg {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com"); //enter URL
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");		
		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); //login button
		drawBorder(loginBtn, driver);
		generateAlert(driver, "There is bug on button which is Highlighted");
		driver.switchTo().alert().accept();
	}

	
	 public static void drawBorder(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	//executeScript -- to execute JavaScript code
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);  //we are using 0 because 1st element only 1 element.
	    }
	 
	 public static void generateAlert(WebDriver driver, String message){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	//executeScript -- to execute JavaScript code
	    	js.executeScript("alert('"+message+"')");
	 	}
}

