package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.opensourceobject.Home;
import com.bjs.opensourceobject.Login;
import com.bjs.opensourceobject.Welcome;

public class OpenSourceTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://s1.demo.opensourcecms.com/wordpress/");
		
		Thread.sleep(5000);
		Welcome w =new Welcome(driver);
		w.clickOnSignIn();
	
		Login l = new Login(driver);
		l.typeUsername();
		l.typeUserpass();
		l.clickOnsubmit();
		
		Home h = new Home(driver);
		h.clickOnComment();
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
