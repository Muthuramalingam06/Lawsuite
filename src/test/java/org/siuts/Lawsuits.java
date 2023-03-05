package org.siuts;


import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.locators.LawsuitsLocators;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.CUtility;
import org.utility.ExtendsReport;

import com.aventstack.extentreports.utils.FileUtil;

public class Lawsuits  extends CUtility{
	static LawsuitsLocators l; 
	@BeforeClass
	private void beforeclasss() {
		browserlaunch("edge");
	}
	@BeforeMethod
	private void before() {
		ExtendsReport.StartReport();

	}
	@Test(enabled=false)
	private void Lawsuit() throws IOException, AWTException, InterruptedException {
		urllanuch("https://www.accessibility.com/digital-lawsuits");
		ImplicitlyWait(17);
		l= new LawsuitsLocators();
		click(l.getAccept());
		for(int i=1; i<=15; i++) {
			WebElement web = driver.findElement(By.xpath("(//h3//a)["+i+"]"));
		Scrolldown(web);
     	Thread.sleep(1000);
     	contextclick(web);
    	Thread.sleep(2000);
     	keypress(KeyEvent.VK_DOWN);
     	Thread.sleep(1000);
     	keypress(KeyEvent.VK_ENTER);
     	Thread.sleep(1000);
     	Set<String> jh = driver.getWindowHandles();
		List<String> li =new ArrayList<>();
     	li.addAll(jh);
     	driver.switchTo().window(li.get(i));
     	System.out.println(Gettext(l.getPandiff()));
     	System.out.println(Gettext(l.getDefendant()));
     	Thread.sleep(2000);
 
     	driver.switchTo().window(li.get(0));
		}
		}
	
	    @Test(enabled=true)
	    private void lawsuit2() throws InterruptedException {
	    	urllanuch("https://www.accessibility.com/digital-lawsuits");
			ImplicitlyWait(17);
			l= new LawsuitsLocators();
			for(int i=1; i<=15; i++) {
			WebElement link = driver.findElement(By.xpath("(//h3//a)["+i+"]"));
			Scrolldown(link);
			String getAttribute = GetAttribute(link, "href");
			driver.navigate().to(getAttribute);	
			System.out.println(Gettext(l.getPandiff()));
	     	System.out.println(Gettext(l.getDefendant()));
	     	Thread.sleep(1000);
	     	driver.navigate().to("https://www.accessibility.com/digital-lawsuits");
		
		}}
	    
		
		@AfterMethod
		private void afetr(ITestResult sc) {
			ExtendsReport.createReport(sc);

		}
		
		
     	@AfterClass
     	private void afterclass() {
    		ExtendsReport.EndReport();
    	    quit();

    	}

		  
}
