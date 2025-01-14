package testCases;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTestUpdated {
    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC001(){
        registerUser();
        verifyRegisterSuccess();
    }

    public void registerUser(){
        HomePageUpdated homepage=new HomePageUpdated(driver);
        homepage.selectRegisterMenu();

        RegisterPageUpdate register = new RegisterPageUpdate(driver);
        register.setFirstName("sanuri");
        register.setLastname("Perera");
        register.setPhoneNum("0772536142");
        register.setEmail("Test@gmail.com");
        register.setAddress("test address");
        register.setCity("colombo");
        register.setState("piliyandala");
        register.setPostal("10400");
        register.setCountry("SRI LANKA");
        register.setUserName("SanuriTest1");
        register.setPassword("Abcd12345");
        register.setConfirmPassword("Abcd12345");
        register.submitBtn();
    }

    public void verifyRegisterSuccess(){
        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText =registerSuccessPage.registerSuccessPage();
        Assert.assertTrue(actualText.contains("Dear"),"Registration Attempt failed !!");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
