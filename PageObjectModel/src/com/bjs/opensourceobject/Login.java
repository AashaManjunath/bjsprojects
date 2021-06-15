package com.bjs.opensourceobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	By userlogin=By.id("user_login");
	By userpass=By.id("user_pass");
	By submit=By.id("wp-submit");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typeUsername()
	{
		driver.findElement(userlogin).sendKeys("opensourcecms");
	}
	
	public void typeUserpass()
	{
		driver.findElement(userpass).sendKeys("opensourcecms");
	}
	
	public void clickOnsubmit()
	{
		driver.findElement(submit).click();
	}
}
