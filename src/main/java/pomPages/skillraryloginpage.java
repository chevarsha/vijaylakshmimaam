package pomPages;

import javax.xml.transform.Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryloginpage 
{
	@FindBy(xpath="//a[text()=\" GEARS \"]")
	private WebElement gearsbutton;
	
	@FindBy(xpath="(//a[@class=\"ignorelink\"])[16]")
	private WebElement demoapp;
	
	public skillraryloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click1()
	{
		gearsbutton.click();
	}	
	public void click2()
	{
		demoapp.click();
	}

}
