package com.amazon.pages;

import com.amazon.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    public WebElement logoutBtn;
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div[2]/div[1]/form/div/div/div/h1")
    public WebElement loginTitle;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")
    public WebElement accountsAndListMenu;
    @FindBy(xpath = "//*[@id=\"nav_prefetch_yourorders\"]/span")
    public WebElement ordersBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
    public WebElement customerSupportBtn;

}
