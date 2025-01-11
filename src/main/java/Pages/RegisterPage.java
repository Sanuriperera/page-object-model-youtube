package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;

    //Contact Information
    By firstNameLoc= By.xpath("//input[@name='firstName']");
    By lastNameLoc = By.xpath("//input[@name='lastName']");
    By phoneNumLoc=By.xpath("//input[@name='phone']");
    By emailLoc =By.xpath("//input[@id='userName']");
    //Mailing Information
    By addressLoc = By.xpath("//input[@name='address1']");
    By cityLoc = By.name("city");
    By stateLoc = By.name("state");
    By postalCodeLoc = By.name("postalCode");
    By countryLoc= By.name("country");
    //User Information
    By userNameLoc =By.id("email");
    By passwordLoc = By.name("password");
    By confirmPasswordLoc=By.name("confirmPassword");
    By submitBtnLoc = By.name("submit");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String firstName){
        driver.findElement(firstNameLoc).sendKeys(firstName);
    }

    public void setLastname(String lastName){
        driver.findElement(lastNameLoc).sendKeys(lastName);
    }
    public void setPhoneNum(String phoneNum){
        driver.findElement(phoneNumLoc).sendKeys(phoneNum);
    }

    public void setEmail(String email){
        driver.findElement(emailLoc).sendKeys(email);
    }

    public void setAddress(String address){
        driver.findElement(addressLoc).sendKeys(address);
    }

    public void setCity(String city){
        driver.findElement(cityLoc).sendKeys(city);
    }

    public void setState(String state){
        driver.findElement(stateLoc).sendKeys(state);
    }

    public void setPostal(String postal){
        driver.findElement(postalCodeLoc).sendKeys(postal);
    }

    public void setCountry(String country){
        WebElement countrySelectElement =  driver.findElement(countryLoc);
        Select select= new Select(countrySelectElement);
        select.selectByVisibleText(country);
    }

    public void setUserName(String userName){
        driver.findElement(userNameLoc).sendKeys(userName);
    }

    public void setPassword(String password){
        driver.findElement(passwordLoc).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        driver.findElement(confirmPasswordLoc).sendKeys(confirmPassword);
    }

    public void submitBtn(){
        driver.findElement(submitBtnLoc).click();
    }
}
