package base;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import utilities.Screenshots;

public class CustomListeners extends BaseClass implements ITestListener, ISuiteListener {

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult result) {
		
		test = rep.startTest(result.getName().toUpperCase());

	}

	public void onTestSuccess(ITestResult result) {
		//Below information will log into extent Report
				test.log(LogStatus.PASS, result.getName().toUpperCase()+" PASS");
				rep.endTest(test);
				rep.flush();

	}

	public void onTestFailure(ITestResult result) {

		try {
			Screenshots.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Below is for extent report, it will attach screenshot in the extent report
		test.log(LogStatus.FAIL, result.getName().toUpperCase() + " Failed with exception : " + result.getThrowable());
		test.log(LogStatus.INFO, test.addScreenCapture(Screenshots.screenshotName));

		rep.endTest(test);
		rep.flush();
	}

	public void onTestSkipped(ITestResult result) {
		// below is for extent report
		test.log(LogStatus.SKIP, result.getName().toUpperCase() + " Skipped the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		test = rep.startTest(result.getName().toUpperCase());

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
