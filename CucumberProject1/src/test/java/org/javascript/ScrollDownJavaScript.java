package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownJavaScript {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
//	WebElement scroll = driver.findElement(By.xpath("//div[text()='Top Stories :']"));
//	
//	JavaScriptUtil.scrollDown(scroll, driver);
	
	
	JavaScriptUtil.scrollend(driver);
	}
	


}
