package com.uptake.page.home;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uptake.page.peoples.*;



public class UpHomePage {
	
	ChromeDriver chromeDriver =null;  //every class has a global object of WebDriver included in jar files of selenium
	
	
	public UpHomePage(ChromeDriver chromeDriver) {  //Public constructor pass obj of Webdriver into it 
		
		this.chromeDriver = chromeDriver;                //Global webdriver is equal to the obj webdriver
		
		
	}
	
	

	public void naviagateUptake() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://uptake.com/");
		return;
		
	}
	
	/*public UpPeoplesPage navigateHomePage(){
		
		chromeDriver.findElement(By.linkText("People")).click();
		
		return new UpPeoplesPage(chromeDriver);
		
	}
	
	*/

}
