package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.ChartPage;
import pages.HomePage;
import pages.LoginPage;

public class CovidTest { 
	WebDriver driver;
	HomePage homepage;
	ChartPage chartpage;
	@BeforeClass
	public void initiliseBrowser() {
	driver=new ChromeDriver();
	driver.get("https://inerg-test.web.app/");
	driver.manage().window().maximize();
    homepage = new HomePage(driver);
	chartpage=new ChartPage(driver);


}
	@Test
	public void stateDrop()   {
		homepage.selectOnStateField("Assam");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ChartPage chartpage=new ChartPage(driver);
		
		chartpage.printValue();
		
	}
	@AfterClass
	public void quitAndClose() {
		//driver.quit();
	}

}
