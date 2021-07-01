package pageObjects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class petsPage {

    public petsPage verifyPetsPageTitle() {
        $(byXpath("//h1[text()='Pets']")).should(visible);
        return this;
    }

}
