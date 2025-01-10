package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    By firstNameLoc= By.xpath("//input[@name='firstName']");
    By lastNameLoc = By.xpath("//input[@name='lastName']");
    By phoneNumLoc=By.xpath("//input[@name='phone']");
    By emailLoc =By.xpath("//input[@id='userName']");
    By addressLoc = By.xpath("//input[@name='address1']");
//    By cityLoc = By.name()

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameLoc).sendKeys("sanuri");
    }


}
