package pageObjects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class signInPage {

    public signInPage verifySignInPageHeading() {
        $(byXpath("//h1[text()='Sign in']")).should(visible);
        return this;
    }

    public signInPage clickCreateAccountLink() {
        $(byText("NEWBIE? CREATE ACCOUNT")).should(visible).click();
        return this;
    }
}
