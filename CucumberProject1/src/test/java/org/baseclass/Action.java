package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
       // WebElement src = driver.findElement(By.xpath("//a[text()='Desktops']"));
        
        //WebElement target = driver.findElement(By.xpath("(//div[@class='dropdown-inner']/ul/li/child::a[contains(text(),'Mac')])[1]"));
		
		WebElement search = driver.findElement(By.name("search"));
		
		search.sendKeys("Mobile");
        
       Actions act = new Actions(driver);
       
      // act.contextClick(search).build().perform();
       
       act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
       
       Thread.sleep(10000);
       
 
       act.keyDown(Keys.CONTROL).sendKeys("X").keyUp(Keys.CONTROL).perform();
       
  
      // act.moveToElement(src).moveToElement(target).click().build().perform();
       
       
        
		
}
}
