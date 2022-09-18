package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

  private	static WebDriver driver= null;
	
	public static void main(String[] args) {
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Report.html");
		
		
		
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
		ExtentTest test1 = extent.createTest("Googoel search test one","first test");
		
		System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
		driver= new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test case");
		
		
		driver.get("https://www.google.com/");
		
		test1.pass("Navigated to google");
		
		
		driver.findElement(By.name("q")).sendKeys("abdc");
		
		test1.pass("Enter in searchbocx");
		
		
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).click();
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		test1.pass("click on enter");
		
		driver.quit();
		// this step is very important otherwise it will not generate report
		extent.flush();
		
		
		
	
	}

}
