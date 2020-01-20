package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;
   // EmployeeDashboardPage employeeDashboard;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        initializer();
        homePage = new HomePage();
       // employeeDashboard = new EmployeeDashboardPage();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHomeTitle(){
        //SeleniumUtils.waitForVisibilityOfElement(homePage.logIn_Btn);
        Assert.assertEquals(driver.getTitle(), "Capital One Credit Cards, Bank, and Loans - Personal and Business");
    }

    @Test
    public void testbusinessOOF() {
       SeleniumUtils.click(homePage.businessOOF);
    }




}
