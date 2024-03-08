package com.amazon.pages;

import com.amazon.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchProductPage {

    public SearchProductPage() {

        PageFactory.initElements(DriverUtil.getDriver(), this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchField;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> productList;


}
