package com.sagar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		// program for all browser launching...
		System.out.println("Ganpati Bappa Moraya");

		// System.setProperty("webdriver.chrome.driver",
		// "C:/Users/HP/selenium_file/chromedriver.exe");
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://www.fb.com");
		 * driver.findElement(By.id("email")).sendKeys("8975671853");
		 * driver.findElement(By.id("pass")).sendKeys("1014720165");
		 * driver.findElement(By.name("login")).click(); Thread.sleep(10000);
		 */

		// System.setProperty("webdriver.edge.driver",
		// "C:/Users/HP/Downloads/edgedriver_win64/msedgedriver.exe");
		/*
		 * WebDriver driver1 = new EdgeDriver(); driver1.manage().window().maximize();
		 * driver1.get("http://www.fb.com");
		 * driver1.findElement(By.id("email")).sendKeys("8975671853");
		 * driver1.findElement(By.id("pass")).sendKeys("1014720165");
		 * driver1.findElement(By.name("login")).click(); Thread.sleep(10000);
		 */

		// System.setProperty("webdriver.gecko.driver","C:/Users/HP/Downloads/geckodriver-v0.29.1-win64/geckodriver.exe");
	
		WebDriver driver2 = new FirefoxDriver();
		driver2.manage().window().maximize();
		driver2.get("http://www.fb.com");
		driver2.findElement(By.id("email")).sendKeys("8975671853");
		driver2.findElement(By.id("pass")).sendKeys("1014720165");
		driver2.findElement(By.name("login")).click();
		Thread.sleep(10000);

	}

}
