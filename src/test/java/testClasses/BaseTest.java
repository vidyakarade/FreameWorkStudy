package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.HomePage;
import pages.ProductPage;
import utilities.ReadData;

public class BaseTest 
{
	public static WebDriver driver;
	protected HomePage homepage;
	protected ProductPage productPage;
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		ReadData rd=new ReadData();
	//	String browser = rd.configReader("browser");
		//if(browser.equals("chrome"))
	//	{
		//	driver=new ChromeDriver();
		//}
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		String url = rd.configReader("baseUrl");
		driver.get(url);
	}
	@BeforeClass
	public void createObjectOfPage()
	{
		homepage=new HomePage(driver);
		productPage=new ProductPage(driver);
	
	}
	@AfterSuite
	public void Close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
