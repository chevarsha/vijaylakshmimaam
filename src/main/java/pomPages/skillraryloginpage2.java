package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryloginpage2 
{
	@FindBy(id="course")
	private WebElement coursebtn;
	
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public void setCoursebtn(WebElement coursebtn) {
		this.coursebtn = coursebtn;
	}

	@FindBy(xpath="(//a[text()=\"Selenium Training\"])[1]")
	private WebElement seleniumbtn;
	
	public skillraryloginpage2(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void seleniumbtnclick()
	{
		seleniumbtn.click();
	}
	 
	
	

}
