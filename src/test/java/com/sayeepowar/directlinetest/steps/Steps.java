package com.sayeepowar.directlinetest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {

    WebDriver driver;

    @Before
    public void before() {
        System.setProperty("webdriver.gecko.driver", "/Users/nandkishorpowar/IdeaProjects/directlinetest/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://covercheck.vwfsinsuranceportal.co.uk");
    }

    @After
    public void after() {
        driver.quit();
    }


    @Given("^the car registration Number \"(.*)\"$")
    public void the_car_registration_Number(String vehicleReg) throws Throwable
    {
        driver.findElement(By.name("vehicleReg")).sendKeys(vehicleReg);

    }


    @When("^Find Vehicle button is clicked$")
    public void enter_the_Car_reg_Number() throws Throwable
    {
        driver.findElement(By.name("btnfind")).click();

    }


    @Then("^Verify the \"([^\"]*)\" with \"([^\"]*)\"$")
    public void verify_the_with(String result, String resultString) throws Throwable
    {
        Assert.assertEquals((resultString), driver.findElement(By.xpath(result)).getText());

    }

}