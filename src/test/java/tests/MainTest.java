package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageHome;
import pages.PageLogin;
import pages.PageTweetDetails;

public class MainTest extends BaseTest {

    @Test
    public void verifyTweeterDetail(){
        String botName = "Wize Bot";
        String botDescription = "@wizeservicesbot - Wize Services Challenge Bot";

        PageLogin pageLogin = new PageLogin(appiumDriver);
        PageHome pageHome = pageLogin.login("username", "password");

        PageTweetDetails pageTweetDetails = pageHome.selectATweet();
        Assert.assertTrue(pageTweetDetails.verifyTweetDetails(pageHome.getSelectedTweetDetail()));
    }

    @Test
    public void verifyBotNameAndDescription(){
        String botName = "Wize Bot";
        String botDescription = "Wize Services Challenge Bot";

        PageLogin pageLogin = new PageLogin(appiumDriver);
        PageHome pageHome = pageLogin.login("username", "password");

        Assert.assertTrue(pageHome.verifyBotNameAndBotDesc(botName, botDescription));
    }
}
