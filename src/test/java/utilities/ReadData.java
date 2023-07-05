package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData 
{
	public String configReader(String DataToRead) throws IOException
	{
		//String path = System.getProperty("C:\\Users\\DELL\\eclipse-workspace\\frameworkStudy\\src\\test\\resources\\config.properties");
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\frameworkStudy\\src\\test\\resources\\config.properties");
		Properties prop=new Properties();
		prop.load(file);
		String value = prop.getProperty(DataToRead);
		return value;
	}
}
