package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Testclasses.BaseTest;
import utility.ScreenShot;



public class ListenerClass extends BaseTest implements ITestListener{
	
	public static ExtentTest test;
	ExtentReports  extent	= ExtentReportGen.extentReportGenrator();
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started:" +result.getName());
		test = extent.createTest(result.getName());
	//	driver.manage().deleteAllCookies();// to delete all the cookies 
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed:" +result.getName());
		test.log(Status.PASS, "Test case has been passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed :"+result.getName());
		test.fail(result.getThrowable());//it will give exception data
		//here we will give path to capture scrrenshot
		try 
		{
			
			test.addScreenCaptureFromPath(ScreenShot.captureScreenShotWithPath(driver,result.getName() ), "Captured screenshot");
		}
		catch (IOException e) {
			
			System.out.println("Exception occured while taking screenshot");

		}
}
		
	

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case got Skipped:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started:" +context.getName());
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("Test Completed:" +context.getName());
		//wich events we have handeled till now it will paste in report 
		extent.flush();
	}

}
