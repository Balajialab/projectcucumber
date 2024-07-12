package org.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoselect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("maven");
		
		Thread.sleep(10000);
		
		List<WebElement> all = driver.findElements(By.xpath("(//div[@class='erkvQe']//ul[@role='listbox']"));
		
		System.out.println(all.size());
		
		driver.close();
		
		
		
		
	}

}
