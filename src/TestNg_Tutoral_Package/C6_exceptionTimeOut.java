//PLease Run TestNg.xml file
//IMp for Intervies Mostly Asked.
package TestNg_Tutoral_Package;

import org.testng.annotations.Test;

public class C6_exceptionTimeOut {
	
	//@Test(invocationTimeOut=2000)   //2msecond
	//public void infiniteLoopTest() {
		
	//}
		//Handle Exception in below format also.
		@Test(expectedExceptions=NumberFormatException.class)  //Because of this Testcase will Pass as we are Informing that we are expecting NumberFormatException.
		public void test1() {
			String x = "100A";		//because of this line NumberFormatException Occurs.And Will Fail Testcase.
			Integer.parseInt(x);
		}

}
