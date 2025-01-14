package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccessPageUpdate {
    WebDriver driver;

    @FindBy(xpath="//b[contains(text(),'Dear')]")
    public WebElement successTextLoc;

    public RegisterSuccessPageUpdate(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public String registerSuccessPage(){
        String successText=  successTextLoc.getText();
        return successText;
    }
}
