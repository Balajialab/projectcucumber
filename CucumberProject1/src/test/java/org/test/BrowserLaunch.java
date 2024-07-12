package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BrowserLaunch {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search store\"]"));
		
	search.sendKeys("mobiles");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10))
.ignoring(Exception.class);

wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit'])[1]")));


	
	
	WebElement searchBox = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].click()", searchBox);
	
	}

}
