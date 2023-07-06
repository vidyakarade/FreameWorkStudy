package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage 
{
	@FindBy(xpath="//*[@id='ddlProductSortyBy']")private WebElement sorting;
	@FindBy(xpath="//*[@id='term-5']")private WebElement size;
	@FindBy(xpath="//*[@id='term-362']")private WebElement type;
	@FindBy(xpath="//*[text()='APPLY']")private WebElement apply;
	@FindBy(xpath="//*[text()='RESET']")private WebElement reset;
	@FindBy(xpath="//*[@class='card wbr-product-card h-100 rounded-20']")
	private List<WebElement> productlist;	
    @FindBy(xpath="//*[text()='AMRUT INDIAN SINGLE MALT WHISKY EXCLUSIVE EDITION']")
    private WebElement product;
    WebDriverWait wait;
    WebDriver driver;
    public ProductPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    	wait= new WebDriverWait(driver,Duration.ofSeconds(30));
    	this.driver=driver;
    }
    public int ApplyFilters()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(size));
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();",size);
    	wait.until(ExpectedConditions.elementToBeClickable(type));
    	js.executeScript("arguments[0].click();",type);
    	wait.until(ExpectedConditions.elementToBeClickable(apply));
    	js.executeScript("arguments[0].click();",apply);
    	return productlist.size();
    }
    public int ResetFilters()
    {
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	wait.until(ExpectedConditions.elementToBeClickable(reset));
    	js.executeScript("arguments[0].click();",reset);
    	return productlist.size();
    }
    public void sorthingProduct(String value)
    {
    	Select s=new Select(sorting);
    	s.selectByVisibleText(value);
    }
    public void clickOnProduct()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(product));
    	product.click();
    	
    }
}


