package com.orangehrmweek13.pages;

import com.orangehrmweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import static org.openqa.selenium.By.className;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement UserNameField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement PasswordField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement loginPanelText;
    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li[4]/a")
    WebElement logoutLink;
    public void enterUsernameOnUsernameField(String username){
        sendTextToElement(UserNameField,username);
    }
    public void enterPasswordOnPasswordField(String password){
        sendTextToElement(PasswordField,password);
    }
    public void clickOnLoginButton(){
        log.info("Click on login button"+loginButton.toString());
        clickOnElement(loginButton);
    }
    public String getLoginPanelText(){
        return getTextFromElement(loginPanelText);
    }
    By logout = By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a");
    public void mouseHoverDemo(){
        Actions actions = new Actions(driver);
        WebElement paulCollings = driver.findElement(className("oxd-userdropdown-name"));
        WebElement logout = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a"));
        actions.moveToElement(paulCollings).moveToElement(logout).click().build().perform();
    }
    public void loginToApplication(String username, String password){
        enterUsernameOnUsernameField(username);
        enterPasswordOnPasswordField(password);
        clickOnLoginButton();
    }


}
