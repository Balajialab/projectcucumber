package org.seleniumtest;

import java.io.File;
import java.time.Duration;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();


driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

String title = driver.getTitle();

System.out.println("Title: "+title);

WebElement search = driver.findElement(By.xpath("//input[@type='text']"));

search.sendKeys("iphone");
Actions a = new Actions(driver);
a.keyDown(Keys.ENTER).keyUp(Keys.ENTER);


TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);

File dest = new File("C://Users//Sai Siddharth//Desktop//Screenshot090624//filkartscreenshot1.png");
		
	//fileUtils.copyFile(source, dest);
source.renameTo(dest);

Thread.sleep(5000);

//driver.close();
		
	}

}
