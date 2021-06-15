package com.bjs.opensourceobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;
	
	By comments=By.xpath("//div[@class='wp-menu-image dashicons-before dashicons-admin-comments']");
	
	public Home(WebDriver driver) {
	this.driver= driver;
	}
	
	public void clickOnComment()
	{
		driver.findElement(comments);
	}

}
