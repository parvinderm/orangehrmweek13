package com.orangehrmweek13.pages;

import com.orangehrmweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public AdminPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//div[@class='oxd-topbar-body']//nav/ul/li[2]/span" )
    WebElement userManagementTab;
    @FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']/ul[1]/li[2]/span")
    WebElement jobTab;
    @FindBy(xpath = "//div[@class='oxd-topbar-body toggled']/nav[1]/ul[1]/li[3]/span")
    WebElement organizationTab;

    public void clickOnUserManagementTab(){
        log.info("click on User Management Tab"+userManagementTab.toString());
        clickOnElement(userManagementTab);
    }
    public void clickOnJobTab(){
        log.info("click on Job Tab"+jobTab.toString());
        clickOnElement(jobTab);

    }
    public void clickOnOrganizationTab(){
        log.info("click on organization Tab "+organizationTab.toString());
        clickOnElement(organizationTab);

    }
}
