package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccesspageUpdate {

    WebDriver driver;

    public RegisterSuccesspageUpdate(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath =("//b[contains(text(), 'Dear')]"))
    WebElement successText_loc;


    public String registerSuccessText()
    {
        String successText = successText_loc.getText();
        return successText;
    }
}
