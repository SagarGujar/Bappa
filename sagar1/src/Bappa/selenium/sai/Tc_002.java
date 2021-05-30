package Bappa.selenium.sai;




import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;
//html reports
public class Tc_002 extends BaseTest{
    
	private static final Logger log = Logger.getLogger(Tc_002.class);
	
	public static void main(String[] args) throws Exception {
		init();
		test = report.startTest("Tc_002");
		test.log(LogStatus.PASS,"-------------------started Tc_002-----------------------");
		test.log(LogStatus.PASS,"initialising the dependanccy file");
		log.info("--------------started Tc_002---------------");
		log.info("initialising the dependanccy file");
		
		
		launch("chromebrowser");
		test.log(LogStatus.PASS,"opening the borwser :- " + p.getProperty("chromebrowser"));
		log.info("opening the borwser :- " + p.getProperty("chromebrowser"));
		
		navigate("amazonurl");
		test.log(LogStatus.PASS,"navigated to :- " + childprop.getProperty("amazonurl"));
	    log.info("navigated to :- " + childprop.getProperty("amazonurl"));


		selectOption("dropdown_id", "Books");
	    test.log(LogStatus.PASS,"select the option book by using locator :- " + or.getProperty("dropdown_id"));
		log.info("select the option book by using locator :- " + or.getProperty("dropdown_id"));
	    
		type("textbox_name", "harry potter");
		test.log(LogStatus.PASS,"entered the text harry potter by using locator :- " + or.getProperty("textbox_name"));
		log.info("entered the text harry potter by using locator :- " + or.getProperty("textbox_name"));
		
		clickElement("searchbutton_id");
		test.log(LogStatus.PASS,"click the search button by using locator :- " + or.getProperty("searchbutton_id"));
		log.info("click the search button by using locator :- " + or.getProperty("searchbutton_id"));
		
		test.log(LogStatus.PASS,"-------------------ended Tc_002-----------------------");
		log.info("-------------------ended Tc_002-----------------------");
		
		report.endTest(test);
		report.flush();
		

	}

}
