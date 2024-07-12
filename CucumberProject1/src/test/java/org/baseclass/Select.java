package org.baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {
	




	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Actions act = new Actions(driver);
	WebElement drop = driver.findElement(By.xpath("//select[@class='form-control']"));		
	
	drop.click();
	
		
		
	
	

	}

}
