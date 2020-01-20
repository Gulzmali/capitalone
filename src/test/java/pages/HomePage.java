package pages;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {

    public HomePage(){

        PageFactory.initElements(driver, this);
    }


    //first test
   @FindBy(id = "businessOOF")
    public WebElement businessOOF;

    public void navigateToBusinessPage(){
        SeleniumUtils.click(businessOOF);
    }







}
