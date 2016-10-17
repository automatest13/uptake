package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.uptake.page.home.UpHomePage;
import com.uptake.page.peoples.UpPeoplesPage;

public class UpTakeTest {

		
		
		
		@Test
		public void test(){
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			ChromeDriver chromeDriver = new ChromeDriver();
			
			UpHomePage U = new UpHomePage(chromeDriver);
			U.naviagateUptake();
				
			UpPeoplesPage G = new UpPeoplesPage(chromeDriver);
			
			G.navigatePeoples();
			
			chromeDriver.quit();
		}

		
		

	
	}
