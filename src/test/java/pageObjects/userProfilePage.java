package pageObjects;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class userProfilePage {

    public userProfilePage clickUserProfile() {
        $(byId("userProfile")).should(visible).click();
        return this;
    }

    public userProfilePage uploadPhoto() {
        $(byId("uploadPhoto")).uploadFile(new File("src/test/java/../resources/heic-image.HEIC"));
        return this;
    }

    public userProfilePage clickSaveButton() {
        $(byXpath("//*[text()='Save']")).should(visible).click();
        return this;
    }

    public userProfilePage verifySuccessMessage() {
        $(byXpath("//*[text()='Profile photo updated']")).should(visible);
        return this;
    }
}
