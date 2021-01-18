//PLease Run TestNg.xml file
package TestNg_Tutoral_Package;

import org.testng.annotations.Test;

public class C5_InvocationCount {
	
	@Test(invocationCount=10)    //This Invocation count will print this testcase 10 times.
	public void Addition() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition is : "+c);
	}

}
