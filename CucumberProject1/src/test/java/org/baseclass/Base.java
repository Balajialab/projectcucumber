package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void browserconfig() {
		
		driver= new ChromeDriver();
	}
	
	public static void launchurl(String url) {
		driver.get(url);
	}
	
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	
	public static void Fillbox(WebElement text, String value) {
		
		text.sendKeys(value);
		
	}
	public static void click(WebElement element) {
		
		element.click();
	}
	

		
	
}
