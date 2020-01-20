package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class SighnInPage extends TestBase {

    public SighnInPage(){

        PageFactory.initElements(driver, this);

    }

    @FindBy(id="ods-input-0")
    public WebElement userName;



    @FindBy(id="ods-input-1")
    public WebElement password;


    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement signInBtn;





    public void signIn(){
        SeleniumUtils.sendKeys(userName,"ABCD");
        SeleniumUtils.sendKeys(password,"1234");
        SeleniumUtils.click(signInBtn);

    }

}
