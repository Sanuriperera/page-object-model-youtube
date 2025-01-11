package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {
    WebDriver driver;

    By successTextLoc = By.xpath("//b[contains(text(),'Dear')]");

    public RegisterSuccessPage(WebDriver driver){
        this.driver=driver;
    }

    public String registerSuccessPage(){
        String successText=  driver.findElement(successTextLoc).getText();
        return successText;
    }
}
