package Bappa.selenium.sai;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Varify1  extends BaseTest{

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		navigate("amazonurl");
		
		WebElement loc=driver.findElement(By.id("twotabsearchtextbox"));
		loc.sendKeys("sony");
		String str=loc.getAttribute("value");
		System.out.println(str);
		
		//by inner html 
		//String str1 = driver.findElement(By.linkText("New Releases")).getAttribute("innerHTML");	
		//System.out.println(str1);
		
		String actuallink=driver.findElement(By.linkText("New Releases")).getText();
		String expectedlink="Releases";
		
		if (actuallink.contains(expectedlink))
				{
					System.out.println("both links are equals");
				}  
		else
			System.out.println("both links are not equals ");

	}

}
