package com.orangehrmweek13.testsuite;

import com.orangehrmweek13.pages.DashBoardPage;
import com.orangehrmweek13.pages.HomePage;
import com.orangehrmweek13.pages.LoginPage;
import com.orangehrmweek13.pages.ViewSystemUsersPage;
import com.orangehrmweek13.testbase.TestBase;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    DashBoardPage dashBoardPage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUserPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        dashBoardPage=new DashBoardPage();
        viewSystemUserPage=new ViewSystemUsersPage();
    }
    @Test(dataProvider = "Credentials",dataProviderClass = TestData.class)
    public void verifyUserShouldLoginSuccessFully(String username,String password){
        loginPage.enterUsernameOnUsernameField(username);
        loginPage.enterPasswordOnPasswordField(password);
        loginPage.clickOnLoginButton();
        String actualText3= dashBoardPage.getDashboardText();
        String expectedText3="Dashboard";
        Assert.assertEquals(actualText3,expectedText3,"Verified Dashboard Text");
    }
    @Test(dataProvider = "Credentials",dataProviderClass = TestData.class)
    public void verifyThatTheLogoDisplayOnHomePage(String username,String password){
        loginPage.enterUsernameOnUsernameField(username);
        loginPage.enterPasswordOnPasswordField(password);
        loginPage.clickOnLoginButton();
        homePage.clickOrangeHrmLogoText();
//        String actualText4=homePage.verifyOrangeHrmLogoText();
//        String expectedText4="OrangeHRM";
//        Assert.assertEquals(actualText4,expectedText4,"OrangeHRM logo is displayed");

    }
    @Test(dataProvider = "Credentials",dataProviderClass = TestData.class)
    public void verifyUserShouldLogOutSuccessFully(String username,String password){
        loginPage.enterUsernameOnUsernameField(username);
        loginPage.enterPasswordOnPasswordField(password);
        loginPage.clickOnLoginButton();
        homePage.clickOnUserProfileLogo();
        loginPage.mouseHoverDemo();
        String actualText5=loginPage.getLoginPanelText();
        String expectedText5=loginPage.getLoginPanelText();
        Assert.assertEquals(actualText5,expectedText5,"Login Panel Is Displayed");

    }
}
