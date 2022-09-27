package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarydemo {
	@FindBy(id="course")
	private WebElement coursetb;

	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	
	public skillrarydemo(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

}
