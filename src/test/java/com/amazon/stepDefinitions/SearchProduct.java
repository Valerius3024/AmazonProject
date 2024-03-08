package com.amazon.stepDefinitions;

import com.amazon.pages.SearchProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchProduct {
    SearchProductPage searchProductPage = new SearchProductPage();

    @When("the user searches by {string} in the search field")
    public void the_user_searches_by_in_the_search_field(String productName){
        searchProductPage.searchField.sendKeys(productName + Keys.ENTER);
    }

    @Then("the search result should show minimum one product whose name includes {string}")
    public void the_search_result_should_show_minimum_one_product_whose_name_includes(String productName) {
        for (WebElement webElement : searchProductPage.productList) {
            if (webElement.getText().toLowerCase().contains(productName)){
                Assert.assertTrue(true);
                break;
            }else{
                Assert.fail("Search result not containing product name " + "\"" + productName + "\"");
            }
        }
    }
}
