//Important for interview

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5_Handle_FileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		//type="file" should be presnt for browse/attachfile/uploadFile buttons must present then it will work.
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("E:\\FINAL\\2.selenium\\ExcelData\\abc.txt");
		
	}

}
