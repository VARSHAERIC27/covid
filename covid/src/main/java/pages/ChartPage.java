package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ChartPage extends Base {
	WebDriver driver;

	public ChartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = "//*[local-name()='svg']//*[name()='g'  and @class='overplot' ]//*[@style='stroke-miterlimit: 2; opacity: 1;']")
	private  List<WebElement> chartpoints;

	public void printValue() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");

		
		for (WebElement value : chartpoints) {
			

			System.out.println("value=" + value.getText());
		}

	}
}
