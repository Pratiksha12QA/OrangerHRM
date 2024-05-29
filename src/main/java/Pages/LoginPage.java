package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public LoginPage(WebDriver driver) 
	{
		this.driver =driver;
	}

	
	
	WebDriver driver;
	public void enterCrentials()
	{
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name=\'password\']")).sendKeys("admin123");
	}

	public void clickOnLogin()
	{
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}
	public void enterPin()
	{
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
	}
	public String getTitleofPage ()
	{
		String titleofpage = driver.getTitle();
		return titleofpage;
	}

}
