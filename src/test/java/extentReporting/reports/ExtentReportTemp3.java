package extentReporting.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTemp3 extends Base {
	
	WebDriver driver;
	
	
	@Test
	public void initialDemo_3() {

		driver = initializeDriver();
		driver.get("https://blazedemo.com");
		System.out.println(driver.getTitle());

		driver.close();
	}
	

	

	

}
