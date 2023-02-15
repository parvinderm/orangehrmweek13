package com.orangehrmweek13.pages;

import com.orangehrmweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public ViewSystemUsersPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement systemUsersText;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement usernameField;
    @FindBy(xpath = "//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")
    WebElement userRollDropDown;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
    WebElement employeeNameField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")
    WebElement StatusDropDown;
    @FindBy(xpath = ("//button[@type='submit']"))
    WebElement SearchButton;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    WebElement resetButton;
    @FindBy(xpath = "//div[@class='orangehrm-header-container']/button")
    WebElement AddButton;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
    WebElement DeleteSelectedButton;
    @FindBy(xpath = "//div[@class='orangehrm-paper-container']/div/div/span")
    WebElement noRecordsFound;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement OkButtonOnPopupButton;
    @FindBy(xpath = "//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--white oxd-dialog-sheet oxd-dialog-sheet--shadow oxd-dialog-sheet--gutters orangehrm-dialog-popup'")
    WebElement PopupDisplay;
    @FindBy(xpath = "//input[@value='17']")
    WebElement checkBox;
    @FindBy(className = "oxd-sidepanel-body")
    WebElement errorCannotBeDeleted;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/span")
    WebElement RecordSelected;
    public String verifySystemUsersText(){
        return getTextFromElement(systemUsersText);
    }
    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }
    public void userRollDropdownLink(String text){
        Reporter.log("click on User Role Drop Down"+userRollDropDown.toString());
        clickOnElement(userRollDropDown);
    }
    public void employeeNameField(String name){
        Reporter.log("click on Employee Name DropDown"+employeeNameField.toString());
        clickOnElement(employeeNameField);
    }
    public void clickOnStatusDropdown(){
        log.info("clicking on status dropdown"+StatusDropDown.toString());
        clickOnElement(StatusDropDown);
    }
    public void clickSearchButton(){
        log.info("clicking on Search Button"+SearchButton.toString());
        clickOnElement(SearchButton);
    }
    public void clickOnResetButton(){
        log.info("click on Reset Button"+resetButton.toString());
        clickOnElement(resetButton);
    }
    public void clickOnAddButton(){
        log.info("click on Add Button"+AddButton.toString());
        clickOnElement(AddButton);
    }
    public void clickOnDeleteSelectedButton(){
        log.info("click on delete button"+DeleteSelectedButton.toString());
        clickOnElement(DeleteSelectedButton);
    }
    public String getNoRecordsFound(){
        return getTextFromElement(noRecordsFound);
    }
    public void clickOnOkPopUpButton(){
        log.info("clicking on popup button"+OkButtonOnPopupButton.toString());
        clickOnElement(OkButtonOnPopupButton);
    }
    public void displayPopup(){
        log.info("clicking on popup display"+PopupDisplay.toString());
        clickOnElement(PopupDisplay);
    }
    public void clickOnCheckBox(){
        log.info("clicking on check box"+checkBox.toString());
        clickOnElement(checkBox);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorCannotBeDeleted);
    }
    public String getRecordSelected(){
        return getTextFromElement(RecordSelected);
    }









}
