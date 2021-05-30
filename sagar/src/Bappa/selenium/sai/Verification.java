package Bappa.selenium.sai;

import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

public class Verification extends BaseTest {

	public static void main(String[] args) throws IOException {

		init();
	    test=report.startTest("Verification");
	    test.log(LogStatus.INFO,"------------started Verification test case-----------");
		test.log(LogStatus.INFO,"initialising the dependanccy file");
		
	    launch("chromebrowser");
	    test.log(LogStatus.PASS, "opening the browser:-" + p.getProperty("chromebrowser"));
		
	    navigate("amazonurl");
        test.log(LogStatus.INFO,"navigated to :-" + childprop.getProperty("amazonurl"));
	    
		String expectedlink = "new Releases";

		if (!isElementEqual(expectedlink))
			reportFailure("both links are not equals");
		else
			reportSuccess("both links are equals");
		report.endTest(test);
		report.flush();

	}

}
