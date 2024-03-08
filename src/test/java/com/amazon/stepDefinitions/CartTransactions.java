package com.amazon.stepDefinitions;

import com.amazon.pages.CartTransactionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartTransactions {

    CartTransactionsPage cartTransactionsPage = new CartTransactionsPage();

    @When("the user add a product to cart")
    public void the_user_add_a_product_to_cart() throws InterruptedException {

        cartTransactionsPage.addAProduct();

    }

    @And("the cart icon should be updated")
    public void the_cart_icon_should_be_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The number of items should be increased")
    public void the_number_of_items_should_be_increased() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    }

