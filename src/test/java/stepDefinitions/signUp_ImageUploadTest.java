package stepDefinitions;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.petsPage;
import pageObjects.signInPage;
import pageObjects.signUpPage;
import pageObjects.userProfilePage;
import utils.baseTest;
import utils.constants;

import static org.junit.Assert.assertEquals;

public class signUp_ImageUploadTest {

    /**
     * create class objects
     **/
    signInPage signIn = new signInPage();
    petsPage pets = new petsPage();
    signUpPage signUp = new signUpPage();
    userProfilePage userProfile = new userProfilePage();

    @Before
    public void setup() {
        baseTest.openBrowser();
    }

    @Given("user is present on sign in page")
    public void userPresentOnSignInPage() {
        signIn.verifySignInPageHeading();
    }

    @When("user click on create account link")
    public void clickOnCreateAccountLink() {
        signIn.clickCreateAccountLink();
    }

    @Then("verify user redirected to create account page")
    public void userRedirectedToCreateAccountPage() {
        String currentUrl = WebDriverRunner.url();
        assertEquals(constants.signUpPageUrl, currentUrl);
    }

    @When("user enter all details")
    public void userEnterAllDetails() {
        signUp.enterDetails();
    }

    @And("click on create account button")
    public void clickOnCreateAccountButton() {
        signUp.clickCreateAccountButton();
    }

    @Then("user redirected to pets page")
    public void userRedirectedToPetsPage() {
        pets.verifyPetsPageTitle();
    }

    @When("user click on user profile")
    public void userClickOnUserProfile() {
        userProfile.clickUserProfile();
    }

    @Then("user redirected to user profile page")
    public void userRedirectedToUserProfilePage() {
        String currentUrl = WebDriverRunner.url();
        assertEquals(constants.userProfilePageUrl, currentUrl);
    }

    @And("user upload profile image")
    public void userUploadProfileImage() {
        userProfile.uploadPhoto();
        userProfile.clickSaveButton();
    }

    @Then("verify successful message")
    public void verifySuccessfulMessage() {
        userProfile.verifySuccessMessage();
    }

    @After
    public void closeSession() {
        WebDriverRunner.closeWebDriver();
    }
}
