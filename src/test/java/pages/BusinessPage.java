package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SeleniumUtils;

public class BusinessPage extends TestBase {

    public BusinessPage(){

        PageFactory.initElements(driver, this);
    }



    //2nd test

    @FindBy(id="page-heading")
    public WebElement pageHead;

    public void printPage(){
        SeleniumUtils.getText(pageHead);

    }
    @FindBy(className = "content-block")
    public WebElement contentblock;

    @FindBy(id = "explore_if")
    public WebElement exploreif;

    @FindBy(id="unav-l1-signin")
    public WebElement sighnIn;

    public String getQuote(){
        return SeleniumUtils.getText(contentblock);
    }

    public void getText(){
        SeleniumUtils.getText(exploreif);
    }

    public void clickSighnIn(){
       SeleniumUtils.click(sighnIn);
    }





}
