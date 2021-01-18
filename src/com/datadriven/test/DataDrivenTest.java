package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Data_Driven_Testing.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
	
		Xls_Reader reader = new Xls_Reader("E:\\FINAL\\2.selenium\\WORKSPACE\\Naveen_Tutorial\\src\\com\\testdata\\GmailCreateAccountTest.xlsx");
		
		String Firstname = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println("Name is :"+Firstname);
		
		String Lastname = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println("Name is :"+Lastname);
		
		String location = reader.getCellData("RegTestData", "location", 2);
		System.out.println("Name is :"+location);
	
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
				
		driver.get("https://accounts.google.com/SignUp");
		//driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		//driver.findElement(By.id("LastName")).sendKeys(Lastname);
		int rowcount = reader.getColumnCount("RegTestData");
		System.out.println("Total Number Of Rows :"+rowcount);
		for(int rownum = 2; rownum <= rowcount; rownum ++) {
		String firstname = reader.getCellData("RegTestData", "firstname", rownum);
			System.out.println(firstname);
		
			String lastname = reader.getCellData("RegTestData", "lastname", rownum);
			System.out.println(lastname);
		}
	
	}
	
}


