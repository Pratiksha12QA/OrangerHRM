package Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	Properties prop;
	FileInputStream fis;
	//here we have put the code of ReadDataConfig in this constructor of baseclass
	public BaseClass() throws IOException
	{
		     prop = new Properties();
			
			 String path = System.getProperty("user.dir")+"\\config.properties";
			
			 fis = new FileInputStream(path);
			
			 prop.load(fis);
			 
	}

}
