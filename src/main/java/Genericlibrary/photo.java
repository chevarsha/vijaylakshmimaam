package Genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photo 
{
	public void takephoto(WebDriver driver) throws IOException 
	{
		Date d=new Date();
		String currentdate = d.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(autoconstant.photoPath);
		FileUtils.copyFile(ram, dest);
	}

}
