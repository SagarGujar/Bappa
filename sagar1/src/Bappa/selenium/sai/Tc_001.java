package Bappa.selenium.sai;
import org.apache.log4j.Logger;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
// #find webelement in dynamic way     #log4j concept
public class Tc_001 extends BaseTest {
    private static final Logger log = Logger.getLogger(Tc_001.class);
	public static void main(String[] args) throws IOException, InterruptedException {

		init();
		log.info("-------------------started Tc_001-----------------------");
		log.info("initialising the dependanccy file");
		launch("chromebrowser");
		log.info("opening the borwser :- " + p.getProperty("chromebrowser"));
		navigate("amazonurl");
		log.info("navigated to :- " + childprop.getProperty("amazonurl"));

		selectOption("dropdown_id", "Books");
		log.info("select the option book by using locator :- " + or.getProperty("dropdown_id"));
		type("textbox_name", "harry potter");
		log.info("entered the text harry potter by using locator :- " + or.getProperty("textbox_name"));
		clickElement("searchbutton_id");
		log.info("click the search button by using locator :- " + or.getProperty("searchbutton_id"));
		log.info("-------------------ended Tc_001-----------------------");

	}

}
