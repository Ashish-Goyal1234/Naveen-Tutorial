package Basics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_GmailAccount_Bootstrap_Example
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		driver.findElement(By.id("CountryCode")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='CountryCode']//div[@class='goog-menuitem-content']"));
		System.out.println("Total Number of country is :" + list.size());
		for(int i=0;i<list.size();i++) 
		{
		System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Algeria")) 
			{
				list.get(i).click();
			}
		}	
	}

}
