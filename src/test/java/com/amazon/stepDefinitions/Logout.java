package com.amazon.stepDefinitions;

import com.amazon.pages.LogoutPage;
import com.amazon.utilities.DriverUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Logout {

    LogoutPage logoutPage = new LogoutPage();
    Login login = new Login();

    @Given("user successfully logged in")
    public void user_successfully_logged_in(){
        login.user_at_home_page();
        login.user_enters_email_and_password();
        login.user_clicks_login_button();
        login.user_succesfully_login();
    }

    @And("user hover over accounts and lists menu")
    public void userHoverOverAccountsAndListsMenu() {
        new Actions(DriverUtil.getDriver()).moveToElement(logoutPage.accountsAndListMenu).perform();
    }
    @When("user clicks logout button")
    public void user_clicks_logout_button() {
        logoutPage.logoutBtn.click();
    }
    @Then("user lands in login page")
    public void userLandsInLoginPage() {
        String actualLoginTitle = logoutPage.loginTitle.getText();
        String expectedLoginTitle = "Giriş yap";
        Assert.assertEquals(expectedLoginTitle,actualLoginTitle);
    }
    @When("user clicks back button")
    public void user_clicks_back_button() {
        DriverUtil.getDriver().navigate().back();
    }

    @And("user clicks orders button")
    public void userClicksOrdersButton() {
        logoutPage.ordersBtn.click();
    }

    @And("user clicks customer support button")
    public void userClicksCustomerSupportButton() {
        logoutPage.customerSupportBtn.click();
    }

}
