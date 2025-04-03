package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageupdated {

    WebDriver driver;

    public HomePageupdated(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    //1st way
    // @FindBy (how = How.LINK_TEXT, using = "REGISTER")
    // public WebElement registerBtn_ele;

    @FindBy(linkText = "REGISTER")
    public WebElement registerBtn_ele;


    public void Register(){
        registerBtn_ele.click();
    }
}




