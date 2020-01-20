package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BusinessPage;
import pages.HomePage;
import pages.SighnInPage;
import utils.SeleniumUtils;

public class SighnInPageTest extends TestBase {

   HomePage home;
   BusinessPage business;
   SighnInPage signIn;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        home = new HomePage();
        business= new BusinessPage();
        signIn =new SighnInPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }



    @Test
    public void  virifySignIn(){
        home.navigateToBusinessPage();
        business.clickSighnIn();
        signIn.signIn();

    }
    @Test
    public  void verifyTitle(){
        Assert.assertEquals(driver.getTitle(),"Capital One Credit Cards, Bank, and Loans - Personal and Business");
    }


}
