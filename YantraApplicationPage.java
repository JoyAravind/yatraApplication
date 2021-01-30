package com.comcast.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YantraApplicationPage {

	WebDriver driver;
	
	@FindBy(id="BE_flight_origin_city")
	private WebElement departFrom;
	
	
	@FindBy(xpath="//p[text()='Bangalore ']")
	private WebElement blr;
	
	@FindBy(xpath="//p[text()='New Delhi ']")
	private WebElement Delhi;
	
	@FindBy(id="BE_flight_origin_date")
	private WebElement DPT;
	
	@FindBy(xpath="//td[@title='Tuesday, 2 February 2021']")
	private WebElement Date1;
	
	@FindBy(id="BE_flight_arrival_date")
	private WebElement Arl;
	
	@FindBy(xpath="//td[@title='Thursday, 4 February 2021']")
	private WebElement Date2;
	
	@FindBy(xpath="//input[@value='Search Flights']")
	private WebElement search;
	
	
	
	
	
	
	
	public YantraApplicationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOndepartFromBTN()
	{
		departFrom.click();
	}
	
	public void ClickOnBLrBTN()
	{
		blr.click();
	}
	
	public void ClickOnDelhiBTN()
	{
		Delhi.click();
	}
	
	public void ClickOnDPTBTN()
	{
		DPT.click();
		Date1.click();
	}
	
	public void ClickOnARLBTN()
	{
		Arl.click();
		Date2.click();
	}
	
	public void clickOnSearchBTN()
	{
		search.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
