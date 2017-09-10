import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

public class Listners  implements ITestListener,IInvokedMethodListener,IExecutionListener,IReporter 

{

	public static WebDriver wd; 
	String filePath = "D:\\SCREENSHOTS";

	@Override
	public void onFinish(ITestContext result) {
		 
		 System.out.println( "tc Finished " + result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		 
		 System.out.println("tc started " + result.getName());
 
//		 try {
//				CaptureScreenshot.takescreenshot();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("testcase is onTestFailedButWithinSuccessPercentage " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase is  FAILED " + result.getName());
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
 
		System.out.println("testcase is skipped " + result.getMethod());
	}

	@Override
	public void onTestStart(ITestResult result) {
 
		System.out.println("testcase is  started " + result.getName());
	}

	public void onTestSuccess(ITestResult result,WebDriver ldriver) throws IOException {
 
		System.out.println("testcase is successful " + result.getName());
		File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Windows.old.000\\ff.png"));
	}

	@Override
	public void afterInvocation(IInvokedMethod result, ITestResult result2) {
		// TODO Auto-generated method stub
		System.out.println("testcase is   invoked after " + result.getTestResult() +"  "+ result2.getName());
	}

	@Override
	public void beforeInvocation(IInvokedMethod result, ITestResult result2) {
		// TODO Auto-generated method stub
		System.out.println("testcase is before invoked " +  result.getTestResult() +"  "+ result2.getName());
	}

	@Override
	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("Executionends  ");
	}

	@Override
	public void onExecutionStart() {
		// TODO Auto-generated method stub
		System.out.println("ExecutionStarts  ");
	}
	public static void captureScreenShot(WebDriver ldriver){
//	File src= ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
//	try {
//	 // now copy the  screenshot to desired location using copyFile //method
//	FileUtils.copyFile(src, new File("C:/selenium/error.png"));
//	}
//	 
//	catch (IOException e)
//	 {
//	  System.out.println(e.getMessage());
//	 
//	 }
}

	@Override
	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
