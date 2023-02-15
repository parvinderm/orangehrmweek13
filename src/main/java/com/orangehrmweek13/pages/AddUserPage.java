package com.orangehrmweek13.pages;

import com.orangehrmweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public AddUserPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//div[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]" )
    WebElement userRoleDropdown;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement EmployeeName;
    @FindBy(xpath = "//div[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    WebElement usernameField;
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[3]/div/div[2]/div/div")
    WebElement statusAddDropDown;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
    WebElement disableDropdown;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form/div[2]/div/div[1]/div[1]/div[2]/input")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement saveButton;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement cancelButton;
    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div")
    WebElement resultListAdmin;
    public void userRoleDropdownLink(String text){
        Reporter.log("click on User Role Drop Down"+userRoleDropdown.toString());
        clickOnElement(userRoleDropdown);
    }
    public void EmployeeName(String name){
        Reporter.log("click on Employee Name DropDown"+EmployeeName.toString());
        clickOnElement(EmployeeName);
    }
    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }
    public void selectFromStatusDropdown(String text){
        selectByVisibleTextFromDropDown(statusAddDropDown,text);

    }
    public void enterPassword(String password){
        log.info("enter password"+passwordField.toString());
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String password){
        log.info("enter confirm password"+confirmPassword.toString());
        sendTextToElement(confirmPassword,password);
    }
    public void clickOnSaveButton(){
        log.info("click on save button "+saveButton.toString());
        clickOnElement(saveButton);
    }
    public void clickOnCancelButton(){
        log.info("click on cancel button"+cancelButton.toString());
        clickOnElement(cancelButton);
    }
    public String getResultList(){
        return getTextFromElement(resultListAdmin);
    }
    public void selectStatusAddDropDown() throws InterruptedException {
        clickOnElement(statusAddDropDown);
        Thread.sleep(1000);
        clickOnElement(disableDropdown);
    }






}
