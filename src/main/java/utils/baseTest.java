package utils;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class baseTest {

    public static void openBrowser() {
        /**
         * Browser Stack Details
         **/
        String username = "taeupwork_qSwAs8";
        String accessKey = "JQCA46mFEp1A6bjRJxQz";

        /**
         * Browser Capabilities
         **/
        Configuration.remote = ("http://" + username + ":" + accessKey + "@" + "hub-cloud.browserstack.com/wd/hub");
        Configuration.timeout = 50000;
        Configuration.pageLoadTimeout = 50000;
        Configuration.startMaximized = true;
        Configuration.browser = "safari";
        Configuration.browserVersion = "14.0";
        Configuration.browserCapabilities = new DesiredCapabilities();
        Configuration.browserCapabilities.setCapability("project", "Upet");
        Configuration.browserCapabilities.setCapability("name", "SignUp And Image Upload Automation Test");

        /**
         * Open Browser
         **/
        open(constants.signInPageUrl);
    }
}
