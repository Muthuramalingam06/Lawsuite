package org.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.CUtility;

public class LawsuitsLocators extends CUtility {
	public LawsuitsLocators() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//h3//a)")
	private List<WebElement> headinglinks;
	
	@FindBy(xpath="//div[@class='plaintiff_content']")
	private WebElement pandiff ;
	
	@FindBy(xpath="//div[@class='defendant_content']")
	private WebElement Defendant ;
	
	@FindBy(xpath="//a[@href=\"https://www.accessibility.com/digital-lawsuits/andrew-toro-vs-atwood-distributing-l.p.-2023-01-31\"]")
	private WebElement flink;
	
	@FindBy(id="hs-eu-confirmation-button")
	private WebElement Accept ;
	
	

	public WebElement getAccept() {
		return Accept;
	}

	public List<WebElement> getHeadinglinks() {
		return headinglinks;
	}

	public WebElement getPandiff() {
		return pandiff;
	}

	public WebElement getDefendant() {
		return Defendant;
	}

	public WebElement getFlink() {
		return flink;
	}
	
	
	
	
	
	
	

}
