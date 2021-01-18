
package Basics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertiesFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// in this class we write code to read the properties.
		
		Properties prop = new Properties(); //inbuilt present in java.util package.
		
		FileInputStream ip= new FileInputStream("E:\\FINAL\\2.selenium\\WORKSPACE\\Naveen_Tutorial\\src\\Basics\\config.properties");  //location of config.properties file. 

		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		//System.out.println(prop.getProperty("Name"));  //O/p is NUll as Name is not available.
		System.out.println(prop.getProperty("age"));
		//prop.getProperty("url");
		String URL = prop.getProperty("url");
		System.out.println(URL);
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		prop.getProperty("searchXpath");
				
//Advantage is that if we want to run same script in ff also then properties field change brower as ff then it will run in ff.		
		
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			//System.setProperty(key, value);
			driver = new FirefoxDriver();
		}else if(browsername.equals("firefox")) {
			//System.setProperty(key, value);
			driver = new InternetExplorerDriver();
		}
		
		driver.get(URL);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("mobilenumber_xpath"))).sendKeys(prop.getProperty("mobilenumber"));
		driver.close();
	}

}
