package com.orangehrmweek13.pages;

import com.orangehrmweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement dashboardText;

    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }
}
