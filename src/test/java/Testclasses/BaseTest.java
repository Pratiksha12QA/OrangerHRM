package Testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Dashboard;
//import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.Dashboard;
import Pages.LoginPageAdvance;
import utility.ReadDataFromConfig;

public class BaseTest {
	
	public static WebDriver driver;
	public LoginPageAdvance lp;
    public Dashboard db;
	@BeforeSuite 
	public void initBrowser() throws IOException
	{

		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver101\\chromedriver.exe");
		 

         //WebDriverManager.chromedriver().setup();

         
       //  ChromeOptions options = new ChromeOptions();
		
          driver = new EdgeDriver();
         
         //addarguments is method wich is used to add configration
        // options.addArguments("--disable-notifications");
         
        // options.addArguments("--incognito");
         
         //options.addArguments("--start-maximized");
         
 //   	options.addArguments("--headless");
//		Headless is a mode in which we execute the script but it will not display any activity to the user 
	
        // driver = new ChromeDriver(options);// chrome browser will get open
	
        // driver.manage().window().maximize();// to maximize the window
         
         String url = ReadDataFromConfig.getPropData("testsiteurl");
	
         driver.get(url);
	}
	@AfterSuite
	public void tearDown()
	{
	   driver.quit();
	}
	@BeforeClass
	public void objectCreation() throws IOException
	{
		lp = new LoginPageAdvance(driver);
		
		db = new Dashboard(driver);
	}
	@Test
	public void run()
	{
		System.out.print("hii");
	}

}

