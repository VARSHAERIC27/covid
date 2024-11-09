package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtility;

public class HomePage extends Base {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
	@FindBy(className="data-filter-input")
	private WebElement statedropdown;
	
	
	public void selectOnStateField(String state ) {
		selectByVisibleText(statedropdown,state);
		
	}
	

}
