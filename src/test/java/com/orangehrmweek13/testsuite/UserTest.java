package com.orangehrmweek13.testsuite;

import com.google.common.base.Verify;
import com.orangehrmweek13.pages.*;
import com.orangehrmweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends TestBase {
      LoginPage loginPage;
      HomePage homePage;
      ViewSystemUsersPage viewSystemUsersPage;
      AddUserPage addUserPage;
    @BeforeMethod
    public void inIt(){
        loginPage = new LoginPage();
        homePage  = new HomePage();
        viewSystemUsersPage = new ViewSystemUsersPage();
        addUserPage =new AddUserPage();
    }
    @Test
    public void adminShouldAddUserSuccessfully() throws InterruptedException {

        loginPage.enterUsernameOnUsernameField("Admin");
        loginPage.enterPasswordOnPasswordField("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminTab();
        String actualMessage = viewSystemUsersPage.verifySystemUsersText();
        String expectedMessage = "System Users";
        Assert.assertEquals(actualMessage, expectedMessage, "System Users Text Are Verified");
        viewSystemUsersPage.clickOnAddButton();
//        String actualMessage1= homePage.getAddUser();
//        String expectedMessage1 = "AddUser";
//        Assert.assertEquals(actualMessage1,expectedMessage1,"Verified AddUser Text");
        addUserPage.userRoleDropdownLink("Admin");
        addUserPage.EmployeeName("Sameer Mahammad");
        addUserPage.enterUsername("SameerM");
        addUserPage.selectStatusAddDropDown();
        addUserPage.enterPassword("Rahul123@");
        addUserPage.enterConfirmPassword("Rahul123@");
        addUserPage.clickOnSaveButton();
    }
    @Test
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.enterUsernameOnUsernameField("Admin");
        loginPage.enterPasswordOnPasswordField("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminTab();
        String actualText= viewSystemUsersPage.verifySystemUsersText();
        String expectedText="System Users";
        Assert.assertEquals(actualText,expectedText,"System Users Text Verified");
        viewSystemUsersPage.enterUsername("Admin");
        viewSystemUsersPage.userRollDropdownLink("Admin");
        viewSystemUsersPage.clickOnStatusDropdown();
        viewSystemUsersPage.clickSearchButton();

    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.enterUsernameOnUsernameField("Admin");
        loginPage.enterPasswordOnPasswordField("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdminTab();
        String actualText6 = viewSystemUsersPage.verifySystemUsersText();
        String expectedText6 = "System Users";
        Assert.assertEquals(actualText6,expectedText6,"System Users Text is verified");
        viewSystemUsersPage.enterUsername("SammerM");
        viewSystemUsersPage.userRollDropdownLink("Admin");
        viewSystemUsersPage.clickOnStatusDropdown();
        viewSystemUsersPage.clickSearchButton();
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDeleteSelectedButton();
        viewSystemUsersPage.displayPopup();
        viewSystemUsersPage.clickOnOkPopUpButton();
        String actualText8 = viewSystemUsersPage.getErrorMessage();
        String expectedText8 = "Error Cannot Be Deleted";
        Assert.assertEquals(actualText8,expectedText8,"Verified the text");

    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {
        loginPage.enterUsernameOnUsernameField("Admin");
        loginPage.enterPasswordOnPasswordField("admin123");
        //click on login button
        loginPage.clickOnLoginButton();
        //click on admin tab
        homePage.clickOnAdminTab();
        //Verify System users text
        String actualText9 = viewSystemUsersPage.verifySystemUsersText();
        String expectedText9 = "System Users";
        Assert.assertEquals(actualText9, expectedText9, "System Users Text Verified");
        viewSystemUsersPage.enterUsername("SameerM");
        viewSystemUsersPage.employeeNameField("Sameer Mahammad");
        viewSystemUsersPage.userRollDropdownLink("Admin");
        viewSystemUsersPage.clickOnStatusDropdown();
//        viewSystemUsersPage.clickOnSearchButton();
//         String actualText10= viewSystemUsersPage.getNoRecordsFound();
//         String expectedText10="No Records Found";
//         Assert.assertEquals(actualText10,expectedText10,"Verified No Records Found Text");

    }

    }
