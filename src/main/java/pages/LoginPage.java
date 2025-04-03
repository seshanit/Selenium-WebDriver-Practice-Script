package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    //Constructor to initiate Webdriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
//locators identification
        By Username = By.name("userName");
        By Password = By.name("password");
        By Loginbtn_loc = By.name("submit");
        By Thankyou = (By.xpath("//h3[normalize-space()='Login Successfully']"));

        //identify elements

       public void enterUserName(String userName) {
          driver.findElement(Username).sendKeys(userName);
       }

       public void enterPassword(String password) {
           driver.findElement(Password).sendKeys(password);
       }

       public void loginBtn() {
           driver.findElement(Loginbtn_loc).click();
       }

       public String thankyouText() {
           return driver.findElement(Thankyou).getText();
       }
    }

