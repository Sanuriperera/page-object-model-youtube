package testCases;

import Pages.HomePageUpdated;
import Pages.RegisterPageUpdate;
import Pages.RegisterSuccessPage;
import functions.NewtoursCommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTestCommonFunction {
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

//        registerUser();
//        verifyRegisterSuccess();

        NewtoursCommonFunctions newtoursCommonFunctions= new NewtoursCommonFunctions(driver);
        String actualText = newtoursCommonFunctions.registerUser("sanuri","Perera","0772536142","Test@gmail.com",
                "test address","colombo","piliyandala","10400","SRI LANKA","SanuriTest1","Abcd12345",
                "Abcd12345");

        Assert.assertTrue(actualText.contains("Dear"),"Registration Attempt failed !!");
    }



    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
