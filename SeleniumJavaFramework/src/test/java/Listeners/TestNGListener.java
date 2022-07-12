package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("****************Test started : "+result.getName());

	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("****************Test success : "+result.getName());

	}
	public void onTestFailure(ITestResult result) {
		System.out.println("****************Test Failed : "+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("****************Test skipped : "+result.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("****************Test Finished : "+context.getName());
		}
}
