package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement box1 = driver.findElement(By.id("box3"));
		WebElement box2 = driver.findElement(By.id("box103"));
		
		act.dragAndDrop(box1, box2).build().perform();
		
		WebElement drag1 = driver.findElement(By.id("box7"));
		WebElement src = driver.findElement(By.xpath("//div[text()='South Korea']"));
		
		act.dragAndDrop(drag1, src).build().perform();
	}

}
