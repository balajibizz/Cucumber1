package org.stepdefinition;

import org.openqa.selenium.By;

import org.support.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CebuLogin extends BaseClass {
	

@Given("To fill email in Email placeholder")
public void to_fill_email_in_Email_placeholder() {
    driver.findElement(By.xpath("//*[@id=\"input27\"]")).sendKeys("whytebizzy7@gmail.com");
    driver.findElement(By.xpath("//*[@id=\"form45\"]/div[2]/input")).click();
}

@When("To fill password in Password placeholder")
public void to_fill_password_in_Password_placeholder() {
	driver.findElement(By.xpath("//*[@id=\"input85\"]")).sendKeys("Sala2382@@");
	
}  

@When("Click login button")
public void click_login_button() {
	driver.findElement(By.xpath("//*[@id=\"form77\"]/div[2]/input")).click();
}  

@Then("To check wheather the page is valid or not")
public void to_check_wheather_the_page_is_valid_or_not() {
	
}  



}
