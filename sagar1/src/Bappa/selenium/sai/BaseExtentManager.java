package Bappa.selenium.sai;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseExtentManager extends BaseTest {
	public static ExtentReports report;

	public static ExtentReports getInstance() {
		if (report == null) {
			report = new ExtentReports(projectpath + "//htmlreports//htmlreport.html");
			report.loadConfig(new File(projectpath + "//extentreportsconfig.xml"));
			report.addSystemInfo("seleniumLanguageBinding", "3.141.59").addSystemInfo("Environment",parentprop.getProperty("env"));
		}

		return report;
	}
}
