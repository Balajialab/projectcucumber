package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		
		driver.switchTo().frame(frame);
		
		WebElement frame1 = driver.findElement(By.xpath("//img[@data-attachment-id='1981']"));
		
		frame1.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame2 = driver.findElement(By.xpath("//h1[text() = 'Selenium 3.0 Training']"));
		
//String text = frame2.getText();
		
		System.out.println(frame2.getText());
		
		driver.quit();
		
		
		
		
	}

}
