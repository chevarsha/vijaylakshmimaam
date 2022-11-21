package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skilraryloginpage3
{
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	private WebElement addtocartbtn;

	public skilraryloginpage3(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	public void addtocart()
	{
		addtocartbtn.click();
	}
 
}
