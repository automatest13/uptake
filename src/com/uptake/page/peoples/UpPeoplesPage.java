package com.uptake.page.peoples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.uptake.page.home.UpHomePage;

public class UpPeoplesPage { 
	
	ChromeDriver chromeDriver =null;
	
	String url = "http://uptake.com";
	
	
	public UpPeoplesPage(ChromeDriver chromeDriver){
		
		this.chromeDriver = chromeDriver;
	}
	
	
	
	public void navigatePeoples(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get(url);
		
		chromeDriver.findElement(By.linkText("People")).click();
		
		return;
		
	}
	
	
	
	
	
	
	
	

}
