package BrokenLinks;
//Links are associated by a href tag and image is associated by img tag.
//If there are 1000 link not able to check manually so below programme is for that

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get("http://www.freecrm.com");
		driver.get("https://makemysushi.com/");
	driver.findElement(By.name("username")).sendKeys("naveenk");
	driver.findElement(By.name("password")).sendKeys("test@123");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	driver.switchTo().frame("mainpanel");

	//Step1. get the list of all links and images
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));  //here we have to select FindElements only otherwise list will not work.
		linkslist.addAll(driver.findElements(By.tagName("img"))); //It means that all the a and img tags are stored in linkslistobject.
		
		System.out.println("All the Links and images size or number present :"+ linkslist.size());  //all inks and images number present with or without href attribute.
		
		List<WebElement> activelinks = new ArrayList<WebElement>();  //Created becose there a some a tags which doest cointain href attribute then we are going to test and save those only that cointain a tag with href attibute and those links are stored in this array weblement.
	
		
	//Step2. Iterate LinksList : exclude all the links/images which doesnt have href attribute.	
		for(int i=0;i<linkslist.size();i++)
		{
			System.out.println(linkslist.get(i).getAttribute("href"));
			if(linkslist.get(i).getAttribute("href")!=null && (! linkslist.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(linkslist.get(i));
			}
		}
	
	
		
	//Step3. Get the size of active links list
		System.out.println("All the Active Links and images only size or number present to test :"+ activelinks.size());  //all links and images numberpresent with href attibute to test filtered.
		
	//3.check the href url, with httpconnection api
		//200-ok
		//404-not found
		//500 internal error
		//400-bad request
		
		for(int j=0;j<activelinks.size();j++)
		{
			HttpURLConnection connection=(HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();  //ok
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
			driver.close();
		}
		
	}	
	
}
