package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageHome;
import pages.PageLogin;
import pages.PageTweetDetails;

public class MainTest extends BaseTest {

    @Test
    public void verifyTwitterDetail(){
        String botName = "Wize Bot";
        String botDescription = "@wizeservicesbot - Wize Services Challenge Bot";

        PageLogin pageLogin = new PageLogin(appiumDriver);
        PageHome pageHome = pageLogin.login("username", "password");
        //try{Thread.sleep(5000);}catch(Exception ex){};

        Assert.assertTrue(pageHome.verifyBotNameAndBotDesc(botName, botDescription));

        PageTweetDetails pageTweetDetails = pageHome.selectATweet();
        Assert.assertTrue(pageTweetDetails.verifyTweetDetails(pageHome.getSelectedTweetDetail()));
    }
}
