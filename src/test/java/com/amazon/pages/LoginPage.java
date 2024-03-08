package com.amazon.pages;

import com.amazon.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(DriverUtil.getDriver(), this);

    }

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "continue")
    public WebElement continueBtn;

    @FindBy(id = "signInSubmit")
    public WebElement signInBtn;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement cydeoTitle;

    @FindBy(xpath = "//h4[.='Bir sorun oluştu']")
    public WebElement errorMessage;

}
