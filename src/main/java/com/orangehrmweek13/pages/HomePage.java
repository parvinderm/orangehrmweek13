package com.orangehrmweek13.pages;

import com.orangehrmweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//nav[@class='oxd-navbar-nav']/div[1]/a")
    WebElement OrangeHrmLogo;
    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li[1]/a[1]/span")
    WebElement AdminTab;
    @FindBy(xpath = "//div[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")
    WebElement PIMTab;
    @FindBy(xpath = "//span[text()='Leave']")
    WebElement LeaveTab;
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement Dashboard;
   @FindBy(xpath= "//img[@class='oxd-userdropdown-img']")
   WebElement userProfileLogo;
   @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
   WebElement addUser;
   @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
   WebElement addButton;

    public void clickOrangeHrmLogoText(){
        log.info("click on OrangeHrmLogo"+OrangeHrmLogo.toString());
        clickOnElement(OrangeHrmLogo);

    }


    public void clickOnAdminTab(){
        log.info("click on Admin tab"+ AdminTab.toString());
        clickOnElement(AdminTab);
    }
    public void clickOnPimTab(){
        log.info("click on PIM tab "+PIMTab.toString());
        clickOnElement(PIMTab);
    }
    public void clickOnLeaveTab(){
        log.info("click on Leave Tab"+LeaveTab.toString());
        clickOnElement(LeaveTab);
    }
    public String getDashboardText() {
        return getTextFromElement(Dashboard);
    }
    public void clickOnUserProfileLogo(){
        log.info("click on user profile logo"+userProfileLogo.toString());
        clickOnElement(userProfileLogo);
    }
    public String getAddUser(){
        return getTextFromElement(addUser);
    }
    public void clickOnAddButton(){
        Reporter.log("click on Add Button"+addButton.toString());
        clickOnElement(addButton);
    }


}
