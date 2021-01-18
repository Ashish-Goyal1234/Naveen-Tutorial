//PLease Run TestNg.xml file
										//3Section Of Annotation
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

public class C1_TestNg_Basic 
{
	// Precondition Annotation--- starting with @Before Keyword
		@BeforeSuite       //1 st preference
		public void setup() {
			System.out.println("setup system property for chrome browserr");
		}
		
		@BeforeTest			//2 nd preference
		public void launchBrowser() {
			System.out.println("launch browser");
		}
		
		@BeforeClass		////3 rd preference
		public void  login(){
			System.out.println("login to app");
		}
		
		@BeforeMethod		//4 th preference
		public void Enter_URl() {
			System.out.println("Enter URLr");
		}
		//test case--- starting with @test
		
		@Test						//5th preference   //This is one testcase if we have 5 @test annotation then we have 5 testcases
		public void googleTitleTest() {
			System.out.println("google title test");
		}
		
		@Test				//2nd testcase
		public void serachtest() {
			System.out.println("search test");
		}
		
		
		//Post Condition ---Starting with @After
		@AfterMethod			//6th preference
		public void logout() {
			System.out.println("logout");
		}
		
		@AfterTest				//8th prefernec
		public void deleteCookies(){
			System.out.println("delete cookies");
		}
		
		@AfterClass				//7th prefernece
		public void closeBrowser(){
			System.out.println("close browser");
		}
		
		@AfterSuite
		public void generatetestreport() {
			System.out.println("generatetestreport");
		}
}
