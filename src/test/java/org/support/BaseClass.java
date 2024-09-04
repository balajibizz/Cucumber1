
package org.support;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	
	public static WebDriver driver=null;
	public static Actions a;
	public static Alert b;
	public static Select s;
	
	public static void browserLaunch() {
		driver =new EdgeDriver();
	}
	public static void getUrl(String anyUrl) {
		driver.get(anyUrl);
		
	}
	public static void maxiMz() {
		driver.manage().window().maximize();
	}
	
	public static void mini() {

	}
	public static void priTl() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static String prnCuntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}
	
	//WEB_ELEMENT
	public static void fillTextBox(WebElement webRef,String anyValue) {
		webRef.sendKeys(anyValue);
	}
	public static void getAttribute(WebElement element ) {
	String attribute=element.getDomAttribute("value");	
    
	}
	public static void btnClik(WebElement webRef) {
	webRef.click();	
	}
	public static void quitBrow() {
	driver.quit();	
	}
	
	//actions
	public static void dragAndDp(WebElement src,WebElement target) {
	a=new Actions (driver);	
    a.dragAndDrop(src, target).perform();
	}
	public static void doubleTab() {
	a.doubleClick().perform();	
	}
	public static void moveCursor(WebElement element) {
	a.moveToElement(element).perform();
	}
	public static void rightClick(WebElement element) {
	a.contextClick(element).perform();	
	}
	//alerts
	public static void switchToAlt() {
		b=driver.switchTo().alert();
	}
	public static void acceptAlt() {
		b.accept();
	}
	public void dismissAlt() {
		b.dismiss();
	}
	public void passTheText(String passtxt) {
		b.sendKeys(passtxt);
	}
	
	//date and time
	
	//select
	
	public static void selectByValue(String value) {
		s.selectByValue(value);
	}
	public static void selecByVisibleText(String text) {
		s.selectByVisibleText(text);
	}
	public static void selectByIndex(int index) {
        s.selectByIndex(index);
	}
	public static boolean selectIsMultiple() {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		return multiple;

	}
	public static String SelectGetOptionsTxt(WebElement element,int i) {
		s =new Select(element);
		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		return text;
	   
	}
	public static String SelectGetOptionsAttribute(WebElement element,int i) {
		s=new Select(element);
		
	   List<WebElement> options = s.getOptions();
	   WebElement webElement = options.get(i);
	   String attribute = webElement.getAttribute("value");
	   System.out.println("attribute"
	   		+ "");
	return attribute;
		
	}
	public static String selectGetAllSelectedOption(WebElement element,int i) {
		s=new Select(element);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		WebElement webElement = allSelectedOptions.get(i);
		String attribute = webElement.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		
	
	}
	public static String selectGetFirstSelectedOption(WebElement element) {
		s=new Select(element);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String attribute = firstSelectedOption.getAttribute("value");
		System.out.println(attribute);
		return attribute;
		
	}
	
	public static void selectDeSelectByValue(WebElement element, String value) {
		
		s=new Select(element);
		s.deselectByValue(value);

	}
	
	public static void selectDeSelectByVisibleText(WebElement element, String text) {
		
		s=new Select(element);
		s.deselectByVisibleText(text);

	}
	
	public static void selectDeSelectByIndex(WebElement element, int index) {
		
		s=new Select(element);
		s.deselectByIndex(index);

	}
	
	public static void selectDeSelectAll(WebElement element) {
		
		s=new Select(element);
		s.deselectAll();

	}
	public static void screenshot(String name) throws IOException{
		TakesScreenshot a = (TakesScreenshot)driver;
		File sou=a.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\themu\\eclipse-workspace\\Niroo\\screenshot\\"+name+".png");
		FileUtils.copyFile(sou, des);

	}
}
