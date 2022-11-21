package TestScripts;

import org.testng.annotations.Test;

import Genericlibrary.baseclass;
import pomPages.skillraryloginpage;
import pomPages.skillraryloginpage2;
import pomPages.skilraryloginpage3;

public class demosklrry1 extends baseclass
{
	@Test
	public void tc1() throws InterruptedException
	{
		skillraryloginpage s=new skillraryloginpage(driver);
		s.click1();
		Thread.sleep(3000);

		s.click2();
		Thread.sleep(3000);

		skillraryloginpage2 s1=new skillraryloginpage2(driver);
		Thread.sleep(3000);
				driverutilities.switchtabs(driver);
				driverutilities.mousehover(driver,s1.getCoursebtn());
				s1.seleniumbtnclick();
				Thread.sleep(3000);
				
				skilraryloginpage3 s2=new skilraryloginpage3(driver);
				Thread.sleep(3000);

				s2.addtocart();
				Thread.sleep(3000);
				Thread.sleep(3000);
				driverutilities.alertpopup(driver);
	}

}
