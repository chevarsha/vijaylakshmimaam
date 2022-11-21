package Genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public void getscreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		Date d=new Date();
		 String currentdate=d.toString().replaceAll(":", "_");
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(autoconstant.photoPath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
