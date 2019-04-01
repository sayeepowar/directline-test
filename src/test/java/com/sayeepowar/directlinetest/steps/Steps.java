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


    /*@Given("^Open the Firefox and launch the website \"(.*)\"$")
    public void launch(String webUrl) throws Throwable
    {
        System.setProperty("webdriver.gecko.driver", "/Users/nandkishorpowar/IdeaProjects/directlinetest/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(webUrl);
    }


    @When("^Enter the Car Reg number \"(.*)\" and Find Vehicle$")
    public void enter_the_Car_reg_Number(String vehicleReg) throws Throwable
    {
        driver.findElement(By.name("vehicleReg")).sendKeys(vehicleReg);
        driver.findElement(By.name("btnfind")).click();
    }


    @Then("^Verify Result$")
    public void verify_result() throws Throwable
    {
        Assert.assertEquals("Result for : OV12UYY", driver.findElement(By.className("result")).getText());
    }

    @Then("^Verify Result \"([^\"]*)\"$")
    public void verify_result(String xpath) throws Throwable
    {
        Assert.assertEquals("Result for : OV12UYY", driver.findElement(By.className("result")).getText());
        Assert.assertEquals("09 FEB 2022 : 16 : 26", driver.findElement(By.xpath(xpath)).getText());
    }
    */

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