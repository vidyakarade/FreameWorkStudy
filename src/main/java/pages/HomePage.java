package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
   @FindBy(xpath="(//*[normalize-space(text())='SPIRITS'])[2]")private WebElement sprits;
   @FindBy(xpath="//*[text()='Single Malt']")private WebElement singleMalt;
   private WebDriver driver;
   public HomePage(WebDriver driver)
   {	   
	PageFactory.initElements(driver,this);
	this.driver=driver;
   }
   public void clickOnSptits()
   {
	   sprits.click();
   }
   public void clickOnSingleMalt()
   {
	   singleMalt.click();
   }
   public String GetTitleOfPage()
   {
	  return driver.getTitle();
	   
   }
}
