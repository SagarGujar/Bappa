package com.sagar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BaseTest1 {
	static WebDriver driver;
	public static FileInputStream fis;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties p;
	public static Properties parentprop;
	public static Properties childprop;
	public static Properties or;

	public static void init() throws IOException { // create propeties file to load just data
		// fis=new
		// FileInputStream("C:/Users/HP/eclipse-workspace/sagar/data.properties");
		fis = new FileInputStream(projectpath + "/data.properties");
		p = new Properties();
		p.load(fis);
		// create parent properties file to load the env
		fis = new FileInputStream(projectpath + "/env.properties");
		parentprop = new Properties();
		parentprop.load(fis);
		String e = parentprop.getProperty("env");
		System.out.println(e);
		// create child properties file load the child url
		fis = new FileInputStream(projectpath + "/" + e + ".properties");
		childprop = new Properties();
		childprop.load(fis);
		String value = childprop.getProperty("amazonurl");
		System.out.println(value);

		fis = new FileInputStream(projectpath + "/or.properties");
		or = new Properties();
		or.load(fis);

	}

	public static void launch(String browser) {
		if (p.getProperty(browser).equals("Chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			option.addArguments("--disabled-notifications");

			driver = new ChromeDriver(option);
		}

		else if (p.getProperty(browser).equals("Firefox")) {

			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("saiganesh");

			profile.setPreference("dom.webnotifications.enabled", false);// for block the web notification in browser
																			// profile.

			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);

			driver = new FirefoxDriver(option);
		}

		else if (p.getProperty(browser).equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/HP/Downloads/edgedriver_win64/msedgedriver.exe");
			driver = new EdgeDriver();
		}

	}

	public static void navigate(String url) {
		driver.get(childprop.getProperty(url));
	}

	public static void selectOption(String locatorkey, String item) {
		// driver.findElement(By.id(locator)).sendKeys(item);
		getElement(locatorkey).sendKeys(item);

	}

	public static void type(String locatorkey, String text) {
		// driver.findElement(By.name(locator)).sendKeys(text);
		getElement(locatorkey).sendKeys(text);

	}

	public static void clickElement(String locatorkey) {
		// driver.findElement(By.xpath(locator)).click();
		getElement(locatorkey).click();

	}

	public static WebElement getElement(String locatorkey) {
		WebElement element = null;

		if (locatorkey.endsWith("_id"))
			element = driver.findElement(By.id(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_name"))
			element = driver.findElement(By.name(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_classname"))
			element = driver.findElement(By.className(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_xpath"))
			element = driver.findElement(By.xpath(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_cssselector"))
			element = driver.findElement(By.cssSelector(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_linktext"))
			element = driver.findElement(By.linkText(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_partiallinktext"))
			element = driver.findElement(By.partialLinkText(or.getProperty(locatorkey)));

		else if (locatorkey.endsWith("_tagname"))
			element = driver.findElement(By.tagName(or.getProperty(locatorkey)));

		return element;

	}


}
