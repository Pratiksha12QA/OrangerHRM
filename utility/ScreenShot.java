package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static String captureScreenShotWithPath(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot scrshot = (TakesScreenshot)driver;

		File source = scrshot.getScreenshotAs(OutputType.FILE);


		//	File destination = new File("E:\\Desktop\\VimanNagar\\Dec 21\\Screenshots\\"+name+".png");

		String path = System.getProperty("user.dir")+"\\screenshots\\"+name+".png";

		File destination = new File(path);

		FileHandler.copy(source, destination);
		
		return path;


}

		public static void captureScreenShot(WebDriver driver, String name) throws IOException
		{
			TakesScreenshot scrshot = (TakesScreenshot)driver;
	
			File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	
			//	File destination = new File("E:\\Desktop\\VimanNagar\\Dec 21\\Screenshots\\"+name+".png");

			String path = System.getProperty("user.dir")+"\\screenshots\\"+name+".png";
	
			File destination = new File(path);
	
			FileHandler.copy(source, destination);

	
}

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\chromedriver101.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();// maximize the window of the browser

	driver.get("https://www.facebook.com/signup");
	
	
	TakesScreenshot scrshot = (TakesScreenshot)driver;
	
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	
	File destination = new File("E:\\Desktop\\VimanNagar\\Dec 21\\Screenshots\\facebook.png");

	FileHandler.copy(source, destination);

  }
}