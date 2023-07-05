package extentListners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen 
{
	static ExtentReports extent;
	public static ExtentReports extentReportGenerator () 
	{
		String path = System.getProperty("user.dir")+"\\reports\\frameworkStudy.html";
		 extent=new ExtentReports();
		// File file=new File();
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
		 reporter.config().setTheme(Theme.STANDARD);
		 reporter.config().setReportName("ExtentRoportStudy");
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("browser name","chrome" );
		 extent.setSystemInfo("executedBy","tester");
		 extent.setSystemInfo("env","sit");
		
		return extent;
	}
	
}
