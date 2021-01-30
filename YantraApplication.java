package yantra;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.comcast.objectrepositorylib.YantraApplicationPage;

public class YantraApplication  extends BaseClass {

	
	@Test
	public void testapplication() throws InterruptedException
	{
		//driver.findElement(By.id("BE_flight_origin_city")).click();
		
		YantraApplicationPage lp=new YantraApplicationPage(driver);
		lp.ClickOndepartFromBTN();
		lp.ClickOnBLrBTN();
		lp.ClickOnDelhiBTN();
		lp.ClickOnDPTBTN();
		lp.ClickOnARLBTN();
		lp.clickOnSearchBTN();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebDriverWait wait=new WebDriverWait(driver,50);
		WebElement title = driver.findElement(By.xpath("//span[text()='Book Flights, Hotels and Holiday Packages']"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
		//driver.findElement(By.xpath("//span[text()='Flights']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Book Flights, Hotels and Holiday Packages']/ancestor::div[@class='be-container-snipe']/descendant::div[@class='oneway-roundtrip CitySwap']"));
		WebElement btn = driver.findElement(By.className("//input[@class='required_field cityPadRight ac_input origin_ac']"));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		/*YantraApplicationPage lp=new YantraApplicationPage(driver);
		
		//System.out.println(driver.getTitle());
		lp.ClickOndepartFromBTN();*/
		/*Thread.sleep(2000);
		
		//
		btn.click();*/
	}
}
