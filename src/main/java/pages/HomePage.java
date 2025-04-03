package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class    HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }


   public By registerBtn = By.linkText("REGISTER");

    public void SelectRegisterMenu(){
        driver.findElement(registerBtn).click();

    }



}

