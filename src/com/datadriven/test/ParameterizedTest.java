package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Data_Driven_Testing.Xls_Reader;

public class ParameterizedTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\FINAL\\2.selenium\\Download Required Files or setup\\3.GoogleChrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch chrome
				
		driver.get("https://accounts.google.com/SignUp");
		
	//Data Driven Approach --- used to create data driven Framework.Data Driven means driving the test data from excel files.
	//data Driven Also Called paramenterization.	
		Xls_Reader reader = new Xls_Reader("E:\\FINAL\\2.selenium\\WORKSPACE\\Naveen_Tutorial\\src\\com\\testdata\\GmailCreateAccountTest.xlsx");
		int rowcount = reader.getColumnCount("RegTestData");
		System.out.println("Total Number Of Rows :"+rowcount);
	
	//parameterization always done with for loop	
		for(int rownum = 2; rownum <= rowcount; rownum ++) {  //started from two Because the actual data  is  started from 2 in excel.
		String firstname = reader.getCellData("RegTestData", "firstname", rownum);
			System.out.println(firstname);
		
			String Lastname = reader.getCellData("RegTestData", "lastname", rownum);
			System.out.println(Lastname);

			driver.findElement(By.id("FirstName")).clear();
			driver.findElement(By.id("FirstName")).sendKeys(firstname);
			driver.findElement(By.id("LastName")).clear();
			driver.findElement(By.id("LastName")).sendKeys(Lastname);
		}
	}

}
