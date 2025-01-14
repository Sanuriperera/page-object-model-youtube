package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdate {
    WebDriver driver;

    //Contact Information
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameLoc;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameLoc;

    @FindBy(xpath="//input[@name='phone']")
    public WebElement phoneNumLoc;

    @FindBy(xpath ="//input[@id='userName']")
    public WebElement emailLoc;
    //Mailing Information
    @FindBy(xpath="//input[@name='address1']")
    public WebElement addressLoc;
    @FindBy(name="city")
    public WebElement cityLoc;
    @FindBy(name="state")
    public WebElement stateLoc;
    @FindBy(name="postalCode")
    public WebElement postalCodeLoc;
    @FindBy(name="country")
    public WebElement countryLoc;
    //User Information
    @FindBy(id="email")
    public WebElement userNameLoc;
    @FindBy(name="password")
    public WebElement passwordLoc;
    @FindBy(name="confirmPassword")
    public WebElement confirmPasswordLoc;
    @FindBy(name="submit")
    public WebElement submitBtnLoc;

    public RegisterPageUpdate(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setFirstName(String firstName){
        firstNameLoc.sendKeys(firstName);
    }

    public void setLastname(String lastName){
        lastNameLoc.sendKeys(lastName);
    }
    public void setPhoneNum(String phoneNum){
        phoneNumLoc.sendKeys(phoneNum);
    }

    public void setEmail(String email){
        emailLoc.sendKeys(email);
    }

    public void setAddress(String address){
        addressLoc.sendKeys(address);
    }

    public void setCity(String city){
        cityLoc.sendKeys(city);
    }

    public void setState(String state){
        stateLoc.sendKeys(state);
    }

    public void setPostal(String postal){
        postalCodeLoc.sendKeys(postal);
    }

    public void setCountry(String country){
        Select select= new Select(countryLoc);
        select.selectByVisibleText(country);
    }

    public void setUserName(String userName){
        userNameLoc.sendKeys(userName);
    }

    public void setPassword(String password){
        passwordLoc.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        confirmPasswordLoc.sendKeys(confirmPassword);
    }

    public void submitBtn(){
        submitBtnLoc.click();
    }
}
