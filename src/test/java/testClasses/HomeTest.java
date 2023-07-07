package testClasses;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import extentListners.TestNGListeners;
@Listeners(extentListners.TestNGListeners.class)
public class HomeTest extends TestNGListeners 
{
	@Test( priority=1)
	public void validateTitle()
	{ 




		
		String title = homepage.GetTitleOfPage();
		test.info("fetched title of page");
		System.out.println(title);
		boolean ispresent = title.contains("Mubmai");
		Assert.assertEquals(ispresent,true,"test case Pass");
		test.info("Validated title of page");
	}
    @Test(priority=2)
    public void NevTosingleMalt()
    {  
    	homepage.clickOnSptits();
    	test.info("clicked on single malt");
    	homepage.clickOnSingleMalt();
    	test.info("nev to product Page");
    }
}
