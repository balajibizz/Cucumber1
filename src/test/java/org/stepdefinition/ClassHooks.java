package org.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.support.BaseClass;

public class ClassHooks extends BaseClass {
	
	@Before
	public void browser() {
		//browserLaunch();
		WebDriver driver= new ChromeDriver();
		getUrl("https://www.cebupacificair.com/en-PH/");
		System.out.println("code");
		System.out.println("code 2");

	}
	
	@After
	public void close () {
		quitBrow();
	}

}
