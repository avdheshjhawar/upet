package pageObjects;

import utils.constants;
import utils.random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class signUpPage {

    public signUpPage enterDetails() {
        $(byXpath("//*[@name='name']")).should(visible).setValue(random.firstName());
        $(byXpath("//*[@name='lastName']")).should(visible).setValue(random.lastName());
        $(byXpath("//*[@name='email']")).should(visible).setValue(random.email());
        $(byXpath("//*[@name='password']")).should(visible).setValue(constants.password);
        return this;
    }

    public signUpPage clickCreateAccountButton() {
        $(byXpath("//*[text()='Create Account']")).should(visible).click();
        return this;
    }

}
