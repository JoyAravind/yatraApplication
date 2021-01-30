package yantra;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public  WebDriver driver;
	public FileUtilities file=new FileUtilities();
	
	@BeforeClass
	public void laungBrowser() throws IOException
	{
		String browser = file.getProperties("browser");
		String URL = file.getProperties("url");
		ChromeOptions option=new ChromeOptions();		
		option.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	/*@BeforeMethod
	public void config() throws IOException
	{
		String username=file.getProperties("username");
		String password=file.getProperties("oassword");
	}*/
}
