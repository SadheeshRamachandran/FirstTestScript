package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Class {
	
	protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeClass
    public void setUp() {
        if (extent == null) {
        	
        	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/emailable-report.html");
        	extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
    }
   
    @AfterClass
    public void tearDown() {
        extent.flush(); 
    }

}
