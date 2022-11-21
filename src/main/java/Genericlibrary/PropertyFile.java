package Genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public String getpropertyfiledata(String Key) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(autoconstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(Key);
	}

}
