package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots 
{
	public String takeScreeshot(String name,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\screenShot\\"+name+".png";
		File myscreenshot=new File(path);
		FileHandler.copy(screenShot, myscreenshot);
		return path;
	}
}
