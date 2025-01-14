package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdated {
    WebDriver driver;



    public HomePageUpdated(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //1st way
//    @FindBy(how = How.LINK_TEXT,using = "REGISTER")
//    public WebElement registerBtn;

    @FindBy(linkText= "REGISTER")
    public WebElement registerBtn;

//    public By registerBtnLocator =By.linkText("REGISTER");
    public void selectRegisterMenu(){
        registerBtn.click();
    }

}
