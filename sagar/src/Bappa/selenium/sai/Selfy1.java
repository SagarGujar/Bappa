package Bappa.selenium.sai;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Selfy1 extends BaseTest {

	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigate("googleurl");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			if (!links.get(i).getText().isEmpty()) {
				String linkname = links.get(i).getText();
				driver.findElement(By.linkText(linkname)).click();
				
				Date time=new Date();
				String string1=time.toString().replace(" ", "_").replace(":", "_");

				File srnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(srnshot, new File("C:\\Users\\HP\\Desktop\\screenshot\\" + linkname +string1+ ".png"));

				driver.navigate().back();
				links = driver.findElements(By.tagName("a"));
			}
		}
		

	}

}
