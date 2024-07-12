package org.pojoclass;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pojo extends Base {
	public pojo(){
	
	PageFactory.initElements(driver, this);
}

	
	
}
