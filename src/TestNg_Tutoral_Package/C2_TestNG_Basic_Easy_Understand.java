//PLease Run TestNg.xml file
//please see the sequance of annotation after running the below code.
package TestNg_Tutoral_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2_TestNG_Basic_Easy_Understand {
	@BeforeSuite
	public void setup() {
		System.out.println("1.BeforeSuit");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("\t 2.beforetest");
	}
	
	@BeforeClass		
	public void  login(){
		System.out.println("\t \t 3.beforeclass");
	}
	
	@BeforeMethod		
	public void Enter_URl() {
		System.out.println("\t \t \t 4.beforemethodr");
	}
	
	@Test						
	public void googleTitleTest() {
		System.out.println("\t \t \t \t1.1@test Testcase1(googleTitleTest)"); //O/P in pair of before method and after Method
	}
	
	@Test				
	public void serachtest() {
		System.out.println("\t \t \t \t1.2@test Testcase2(SearchTest)");//O/P in pair of before method and after Method
	}
	
	@Test				
	public void spellingtest() {
		System.out.println("\t \t \t \t1.3@test Testcase3(SpellingTest)");//O/P in pair of before method and after Method
	}
	@AfterMethod			
	public void logout() {
		System.out.println("\t \t \t 5.AfterMethod");
	}
	
	@AfterTest				
	public void deleteCookies(){
		System.out.println("\t 7.AfterTest");
	}
	
	@AfterClass				
	public void closeBrowser(){
		System.out.println("\t \t 6.AfterClass");
	}
	
	@AfterSuite
	public void generatetestreport() {
		System.out.println("generatetestreport");
	}
}
