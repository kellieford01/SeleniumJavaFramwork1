package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();
		
	}

	public static void googleSearchTest() throws InterruptedException {
		
		//Setup Chrome path
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Create object for GoogleSeachPageObjects Class
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		//Launch Browser URL
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("A B C D");
		
		Thread.sleep(3000);
		
		searchPageObj.clickSearchbutton();
		
		driver.close();
	}
	
	
}
