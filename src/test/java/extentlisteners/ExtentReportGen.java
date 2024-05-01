package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenrator()
	{
		String path = System.getProperty("user.dir")+"//Reports//kitezerodhareport.html";
		
		//ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);	
		reporter.config().setTheme(Theme.DARK);
		
		reporter.config().setReportName("Zerodha Report");
		
		ExtentReports extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Kite zerodha");
		
		extent.setSystemInfo("Environment", "IST");
		
		extent.setSystemInfo("Executed By", "15 Jan Batch");
		
		
		return extent;
		
	}

}
