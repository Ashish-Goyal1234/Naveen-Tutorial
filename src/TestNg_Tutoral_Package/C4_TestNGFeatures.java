//PLease Run TestNg.xml file
package TestNg_Tutoral_Package;

import org.testng.annotations.Test;

public class C4_TestNGFeatures {
			@Test
			public void logintest() {
				System.out.println("Login Page Test");
				int i=9/0;  //Because of this Line exception will Occur.
			}
			
			@Test(dependsOnMethods="logintest") //As This testcase is depend on LoginTest() this testcase will Skip Until logintest() will pass.
			public void HomePAgetest() {
				System.out.println("HomePAge Test");
			}
			
			@Test(dependsOnMethods="logintest")//As This testcase is depend on LoginTest() this testcase will Skip Until logintest() will pass.
			public void SearchPagetest() {
				System.out.println("Search Page Test");
			}
			
			@Test(dependsOnMethods="logintest")//As This testcase is depend on LoginTest() this testcase will Skip Until logintest() will pass.
			public void registrationlinktest() {
				System.out.println("Registration Link Test");
			}
			
}
