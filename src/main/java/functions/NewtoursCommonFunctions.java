package functions;

import Pages.HomePageUpdated;
import Pages.RegisterPageUpdate;
import Pages.RegisterSuccessPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewtoursCommonFunctions {
    WebDriver driver;

    public NewtoursCommonFunctions(WebDriver driver){
        this.driver = driver;
    }


    public String registerUser(String fname,String lname,String phone,String email,String address,
    String city, String state , String postal, String country,String uname,String password,String compass){
        HomePageUpdated homepage=new HomePageUpdated(driver);
        homepage.selectRegisterMenu();

        RegisterPageUpdate register = new RegisterPageUpdate(driver);
        register.setFirstName(fname);
        register.setLastname(lname);
        register.setPhoneNum(phone);
        register.setEmail(email);
        register.setAddress(address);
        register.setCity(city);
        register.setState(state);
        register.setPostal(postal);
        register.setCountry(country);
        register.setUserName(uname);
        register.setPassword(password);
        register.setConfirmPassword(compass);
        register.submitBtn();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String successText =registerSuccessPage.registerSuccessPage();
        return successText;
    }



}
