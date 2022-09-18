package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePagePom {
	
	static WebDriver driver;
	

@BeforeTest

public void openHomepageTest() {
	
	
	System.setProperty("Webdriver.chrome.driver", "Chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
	
}

@Test

public static void opencomputertabTest() {
	
	driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]")).click();
	
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	
	String desktop= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).getText();
	
	System.out.println(desktop);
	
	
	
}

	
	
	
	
}
