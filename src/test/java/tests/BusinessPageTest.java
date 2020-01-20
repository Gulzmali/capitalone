package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BusinessPage;
import pages.HomePage;
import utils.SeleniumUtils;

public class BusinessPageTest extends TestBase {

    HomePage homePage;
    BusinessPage Business;



    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
        Business =new BusinessPage();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void virifyBusinessPage(){
        homePage.navigateToBusinessPage();
        Assert.assertEquals(SeleniumUtils.getText( Business.pageHead),"The future of your business starts here.");
        Assert.assertEquals( Business.getQuote(),"\"Can't say enough good things about my initial experience with @CapitalOneSpark for small business. Truly impressed.\"");
        Assert.assertEquals( SeleniumUtils.getText(Business.exploreif),"Explore powerful tools for your business.");
    }









}
