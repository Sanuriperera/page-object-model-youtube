package testCases;

import Pages.HomePage;
import Pages.RegisterPage;
import Pages.RegisterSuccessPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTest {
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
        HomePage homepage=new HomePage(driver);
        homepage.selectRegisterMenu();

        RegisterPage register = new RegisterPage(driver);
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

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText =registerSuccessPage.registerSuccessPage();
        Assert.assertTrue(actualText.contains("Dear"),"Registration Attempt failed !!");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
