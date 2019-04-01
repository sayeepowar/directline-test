package com.sayeepowar.directlinetest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "classpath:vehicleReg.feature",glue={"com.sayeepowar.directlinetest.steps"}, plugin = {"html:target/cucumber"})
public class Runner
{

}