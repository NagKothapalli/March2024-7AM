package seleniumAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	String mypath; //null
	
	public ReadProperties(String path)
	{
		mypath = path;
	}
	
	public String readData(String key) throws IOException
	{
		FileInputStream myfile = new FileInputStream(mypath);
		Properties myprop = new Properties();
		myprop.load(myfile);
		String value = myprop.getProperty(key);
		return value;
	}

}
