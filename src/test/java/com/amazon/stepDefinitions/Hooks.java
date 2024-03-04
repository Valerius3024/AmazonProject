package com.amazon.stepDefinitions;

import com.amazon.utilities.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
@Slf4j
public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 1)
    public void setupScenario(){
        log.info("====Setting up browser using cucumber @Before");
        //System.out.println("====Setting up browser using cucumber @Before");
    }

    //    @Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        log.info("====this will only apply to scenarios with @login tag");
       // System.out.println("====this will only apply to scenarios with @login tag");
    }

    //    @Before (value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        log.info("====this will only apply to scenarios with @db tag");
       // System.out.println("====this will only apply to scenarios with @db tag");
    }


    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value


        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }


        //BrowserUtils.sleep(5);
        DriverUtil.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    // @BeforeStep
    public void setupStep(){
        log.info("--------> applying setup using @BeforeStep");
        //System.out.println("--------> applying setup using @BeforeStep");
    }

    //@AfterStep
    public void afterStep(){
        log.info("--------> applying tearDown using @AfterStep");
        //System.out.println("--------> applying tearDown using @AfterStep");
    }


}
