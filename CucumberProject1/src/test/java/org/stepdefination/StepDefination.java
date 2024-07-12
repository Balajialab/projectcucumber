package org.stepdefination;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;

public class StepDefination extends Base {
	

@Given("To login the Amazon webportal")
public void to_login_the_Amazon_webportal() {
	
	browserconfig();
	maxwindow();
	launchurl("https://www.amazon.in/");
	
    
}

@When("To Search the product in searchbox")
public void to_Search_the_product_in_searchbox() {
	
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("iphone");
	WebElement searchbttn = driver.findElement(By.id("nav-search-submit-button"));
	click(searchbttn);
	
  
}

@When("Select product in searchfield")
public void select_product_in_searchfield() {
	WebElement product = driver.findElement(By.xpath("(//span[text()= 'Apple'])[1]"));
	click(product);

}

@When("To quit the browser")
public void to_quit_the_browser() {
	
	driver.quit();

}

}
