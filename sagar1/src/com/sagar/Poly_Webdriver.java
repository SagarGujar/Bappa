package com.sagar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Poly_Webdriver {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");

		System.setProperty("webdriver.edge.driver", "C:/Users/HP/Downloads/edgedriver_win64/msedgedriver.exe");

		driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");

	}

}
