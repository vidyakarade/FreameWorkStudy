package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentListners.TestNGListeners;

public class ProductTest extends TestNGListeners
{
	@Test(priority=3)
	public void applyfilters()
	{
		int count = productPage.ApplyFilters();
		test.info("get the number of product");
		Assert.assertEquals(count,1);
		test.info("validated product count");

	}
	@Test(priority=4)
	public void resetFilters()
	{
		int count = productPage.ResetFilters();
		test.info("filter reset");
		boolean isGreater = count>1;
		Assert.assertEquals(isGreater,true);
		test.info("successfully validated that filter has been reset");
	}
	@Test(priority=5)
	public void sortingProduct() throws InterruptedException
	{
		productPage.sorthingProduct("Price Low to High");
		Thread.sleep(2000);
		productPage.sorthingProduct("Price High to Low");
		Thread.sleep(2000);
		productPage.sorthingProduct("Name A - Z");
		Thread.sleep(2000);
		productPage.sorthingProduct("Name Z - A");		
	}
	@Test(priority=6)
	public void clickOnProduct()
	{	productPage.ApplyFilters();
	test.info("Reset the filter");
		productPage.clickOnProduct();
		test.info("Clicked on the product");
	}

}
