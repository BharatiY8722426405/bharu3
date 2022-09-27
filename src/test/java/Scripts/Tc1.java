package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PomPages.addtocart;
import PomPages.skillrarydemo;
import PomPages.skillrarypage;
import genericLib.BaseClass;
import genericLib.WebDriverUtilities;

public class Tc1 extends BaseClass {
	@Test
	public void tc1() {
		skillrarypage s=new skillrarypage(driver);
		s.gearsbtn();
		s.skillraryp();
		
		w.switchTabs(driver);
		skillrarydemo sd=new skillrarydemo(driver);
		w.mouseHover(driver, sd.getCoursetb());
		sd.seleniumtraining();
		
		addtocart a=new addtocart(driver);
		w=doubleClick(driver,a.getAdd());
		a.addtocart();
		w.alertpopup(driver);
		
		
		
		
		
	}

	private WebDriverUtilities doubleClick(WebDriver driver, WebElement add) {
		// TODO Auto-generated method stub
		return null;
	}

}
