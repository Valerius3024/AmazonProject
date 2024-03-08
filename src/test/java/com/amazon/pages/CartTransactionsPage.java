package com.amazon.pages;

import com.amazon.utilities.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartTransactionsPage {

    public CartTransactionsPage() {

        PageFactory.initElements(DriverUtil.getDriver(), this);

    }

    @FindBy(id = "p13n-asin-index-0")
    public WebElement firstProductOnMainPage;

    @FindBy(xpath = "(//span[@class='a-button-inner'])[1]")
    public WebElement addtoCartLinkOfFirstProduct;

    @FindBy(id="nav-cart-count")
    public WebElement cartCount;



    WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(3));
    public void addAProduct() throws InterruptedException {

        firstProductOnMainPage.click();
        wait.until(ExpectedConditions.elementToBeClickable(addtoCartLinkOfFirstProduct));
        addtoCartLinkOfFirstProduct.click();

    }

}
