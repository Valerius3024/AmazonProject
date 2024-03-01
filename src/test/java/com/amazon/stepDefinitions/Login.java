package com.amazon.stepDefinitions;

import com.amazon.pages.LoginPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login {

    LoginPage loginPage = new LoginPage();

    @Given("user at home page")
    public void user_at_home_page() {
        DriverUtil.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters email and password")
    public void user_enters_email_and_password() {
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.continueBtn.click();
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.signInBtn.click();
    }
    @Then("user succesfully")
    public void user_succesfully() {
        String actualText = loginPage.cydeoTitle.getText();
        String expectedText = "Cydeo";

        Assert.assertEquals(expectedText,actualText);
    }


}

