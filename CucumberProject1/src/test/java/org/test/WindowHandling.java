package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://letcode.in/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text() = 'Muiltiple windows']")).click();
		
		
		
		Set<String> allwindow = driver.getWindowHandles();
		
//		List<String> list = new ArrayList<String>(allwindow);
//	//String window = list.get(1);
		
		
//	
//driver.switchTo().window(list.get(2));
		int count = 0;
		
		for (String x : allwindow) {
			
			if(count ==2) {
			driver.switchTo().window(x);
		break;
		
			}
			
		}
	
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	System.out.println(driver.getTitle());
	
	Thread.sleep(5000);
	
		driver.quit();

	}

}
