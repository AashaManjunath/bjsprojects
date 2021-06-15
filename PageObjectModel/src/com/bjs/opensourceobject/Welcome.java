package com.bjs.opensourceobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;
	By signin=By.linkText("Anmelden");
	
	public Welcome(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void clickOnSignIn() {
		driver.findElement(signin).click();
	}

}
